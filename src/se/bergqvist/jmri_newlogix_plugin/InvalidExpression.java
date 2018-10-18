package se.bergqvist.jmri_newlogix_plugin;

import jmri.NewLogixCategory;
import jmri.implementation.AbstractExpression;

/**
 * This class implements NewLogixExpression but not ExpressionPluginInterface
 * and is therefore not a valid plugin.
 * 
 * @author Daniel Bergqvist Copyright(C) 2018
 */
public class InvalidExpression extends AbstractExpression {

    public InvalidExpression(String sys) throws BadSystemNameException {
        super(sys);
    }

    @Override
    public NewLogixCategory getCategory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isExternal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean evaluate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reset() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
