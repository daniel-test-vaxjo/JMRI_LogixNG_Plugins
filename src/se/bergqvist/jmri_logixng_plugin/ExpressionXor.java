package se.bergqvist.jmri_logixng_plugin;

import java.util.Map;
import jmri.jmrit.logixng.Category;
import jmri.jmrit.logixng.expressions.AbstractExpression;
import jmri.jmrit.logixng.ExpressionPlugin;
import jmri.jmrit.logixng.FemaleSocket;

/**
 * XOR of two expressions.
 * 
 * @author Daniel Bergqvist Copyright(C) 2018
 */
public class ExpressionXor extends AbstractExpression
        implements ExpressionPlugin {

    public ExpressionXor() {
        super("Daniel");
        System.out.format("Test%n");
    }

    public ExpressionXor(String systemName) {
        super(systemName);
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
    public void reset() {
        // Call reset() on children.
    }

    @Override
    public void init(Map<String, String> map) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Map<String, String> getConfig() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getConfiguratorClassName() {
        return "se.bergqvist.jmri_newlogix_plugin.Configurator";
    }

    @Override
    public String getShortDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getLongDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FemaleSocket getChild(int i) throws IllegalArgumentException, UnsupportedOperationException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getChildCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
