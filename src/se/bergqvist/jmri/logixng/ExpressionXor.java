package se.bergqvist.jmri.logixng;

import java.util.Locale;
import java.util.Map;
import jmri.JmriException;
import jmri.jmrit.logixng.Base;
//import jmri.jmrit.logixng.NewLogixExpressionPlugin;
import jmri.jmrit.logixng.Category;
import jmri.jmrit.logixng.expressions.AbstractDigitalExpression;
import jmri.jmrit.logixng.FemaleSocket;

/**
 * XOR of two expressions.
 * 
 * @author Daniel Bergqvist Copyright(C) 2018
 */
public class ExpressionXor extends AbstractDigitalExpression {
//        implements NewLogixExpressionPlugin {

    public ExpressionXor() {
        super("Daniel", null);
        System.out.format("Test%n");
    }

    public ExpressionXor(String systemName) {
        super(systemName, null);
        System.out.format("Test%n");
    }

    @Override
    public Category getCategory() {
        return Category.OTHER;
    }

    @Override
    public boolean isExternal() {
        return false;
    }

    @Override
    public boolean evaluate() {
        return true;
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
        return "Xor";
    }

    @Override
    public String getLongDescription(Locale locale) {
        return "Xor";
    }

    @Override
    public void setup() {
        // Do nothing
    }

}
