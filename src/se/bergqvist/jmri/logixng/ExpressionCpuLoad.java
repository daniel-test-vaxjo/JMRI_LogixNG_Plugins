package se.bergqvist.jmri.logixng;

import java.lang.management.ManagementFactory;
import java.util.Locale;
import java.util.Map;
import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.InstanceNotFoundException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;
import javax.management.ReflectionException;
import jmri.JmriException;
import jmri.jmrit.logixng.Base;
// import jmri.jmrit.logixng.NewLogixExpressionPlugin;
import jmri.jmrit.logixng.Category;
import jmri.jmrit.logixng.expressions.AbstractDigitalExpression;
import jmri.jmrit.logixng.FemaleSocket;

/**
 * Check if the cpu load is above a certain threshold.
 * 
 * How to get percentage of CPU usage of OS from java
 * https://stackoverflow.com/questions/18489273/how-to-get-percentage-of-cpu-usage-of-os-from-java/21962037
 * 
 * java cpu usage monitoring
 * https://stackoverflow.com/questions/2062440/java-cpu-usage-monitoring
 * 
 * Class ManagementFactory
 * https://docs.oracle.com/javase/7/docs/api/java/lang/management/ManagementFactory.html
 * 
 * Interface OperatingSystemMXBean
 * https://docs.oracle.com/javase/7/docs/api/java/lang/management/OperatingSystemMXBean.html
 * 
 * @author Daniel Bergqvist Copyright(C) 2018
 */
public class ExpressionCpuLoad extends AbstractDigitalExpression {

    private double _threshold = 0.33;
    
    public ExpressionCpuLoad() {
        super("Daniel", null);
        System.out.format("Test%n");
    }

    public ExpressionCpuLoad(String systemName) {
        super(systemName, null);
        System.out.format("Test%n");
    }
    
    public void setThreshold(double threshold) {
        _threshold = threshold;
    }
    
    public double getThreshold() {
        return _threshold;
    }
    
    private double getCpuLoad() throws MalformedObjectNameException,
            InstanceNotFoundException, ReflectionException {
        
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = ObjectName.getInstance("java.lang:type=OperatingSystem");
        AttributeList list = mbs.getAttributes(name, new String[]{ "SystemCpuLoad" });      // CPU load for the entire system
//        AttributeList list = mbs.getAttributes(name, new String[]{ "ProcessCpuLoad" });     // CPU load for the Java process
        if (list.isEmpty()) {
            return 0.0;
        }
        
        Attribute att = (Attribute)list.get(0);
        Double value  = (Double)att.getValue();
        
        // usually takes a couple of seconds before we get real values
        if (value < 0.0) {
            return 0.0;
        }
        
        return value;
    }

    /** {@inheritDoc} */
    @Override
    public Category getCategory() {
        return Category.OTHER;
    }

    /** {@inheritDoc} */
    @Override
    public boolean isExternal() {
        return true;
    }

    /** {@inheritDoc} */
    @Override
    public boolean evaluate() {
        try {
            return (getCpuLoad() > _threshold);
        } catch (MalformedObjectNameException | InstanceNotFoundException | ReflectionException e) {
            return false;
        }
    }

    @Override
    public FemaleSocket getChild(int i) throws IllegalArgumentException, UnsupportedOperationException {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public int getChildCount() {
        return 0;
    }

    @Override
    protected void registerListenersForThisClass() {
        // Do nothing
    }

    @Override
    protected void unregisterListenersForThisClass() {
        // Do nothing
    }

    @Override
    protected void disposeMe() {
        // Do nothing
    }

    @Override
    public Base getDeepCopy(Map<String, String> map, Map<String, String> map1) throws JmriException {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public String getShortDescription(Locale locale) {
        return "Cpu load";
    }

    @Override
    public String getLongDescription(Locale locale) {
        return String.format("Cpu load above %1.2f %%", _threshold);
    }

    @Override
    public void setup() {
        // Do nothing
    }
    
}
