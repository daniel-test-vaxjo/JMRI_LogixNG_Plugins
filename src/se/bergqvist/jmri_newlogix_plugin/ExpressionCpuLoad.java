package se.bergqvist.jmri_newlogix_plugin;

import java.lang.management.ManagementFactory;
import java.util.HashMap;
import java.util.Map;
import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.InstanceNotFoundException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;
import javax.management.ReflectionException;
import jmri.NewLogixCategory;
import jmri.implementation.AbstractExpression;
import jmri.jmrit.newlogix.ExpressionPluginInterface;

/**
 * Check if the cpu load is above a certain threshold.
 * 
 * @author Daniel Bergqvist Copyright(C) 2018
 */
public class ExpressionCpuLoad extends AbstractExpression
        implements ExpressionPluginInterface {

    private double _threshold = 0.33;
    
    public ExpressionCpuLoad() {
        super("Daniel");
        System.out.format("Test%n");
    }

    public ExpressionCpuLoad(String systemName) {
        super(systemName);
        System.out.format("Test%n");
    }
    
    private double getCpuLoad() throws MalformedObjectNameException,
            InstanceNotFoundException, ReflectionException {
        
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = ObjectName.getInstance("java.lang:type=OperatingSystem");
        AttributeList list = mbs.getAttributes(name, new String[]{ "ProcessCpuLoad" });
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
    public NewLogixCategory getCategory() {
        return NewLogixCategory.OTHER;
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

    /** {@inheritDoc} */
    @Override
    public void reset() {
        // Call reset() on children.
    }

    /** {@inheritDoc} */
    @Override
    public void init(Map<String, String> config) {
        _threshold = Double.parseDouble(config.get("threshold"));
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, String> getConfig() {
        Map<String, String> config = new HashMap<>();
        config.put("threshold", Double.toString(_threshold));
        return config;
    }

    /** {@inheritDoc} */
    @Override
    public String getConfiguratorClassName() {
        return "se.bergqvist.jmri_newlogix_plugin.Configurator";
    }
    
}
