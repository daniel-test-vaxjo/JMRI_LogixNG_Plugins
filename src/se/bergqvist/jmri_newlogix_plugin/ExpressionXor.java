package se.bergqvist.jmri_newlogix_plugin;

import java.util.Map;
import jmri.NewLogixCategory;
import jmri.implementation.AbstractExpression;
import jmri.jmrit.newlogix.ExpressionPluginInterface;

/**
 * XOR of two expressions.
 * 
 * @author Daniel Bergqvist Copyright(C) 2018
 */
public class ExpressionXor extends AbstractExpression
        implements ExpressionPluginInterface {

    public ExpressionXor() {
        super("Daniel");
        System.out.format("Test%n");
    }

    public ExpressionXor(String systemName) {
        super(systemName);
        System.out.format("Test%n");
    }

    @Override
    public NewLogixCategory getCategory() {
        return NewLogixCategory.OTHER;
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

}
