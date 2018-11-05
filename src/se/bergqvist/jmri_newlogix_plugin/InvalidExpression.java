package se.bergqvist.jmri_newlogix_plugin;

import jmri.jmrit.newlogix.Category;
import jmri.jmrit.newlogix.AbstractExpression;
import jmri.jmrit.newlogix.FemaleSocket;

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
    public Category getCategory() {
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

    @Override
    public FemaleSocket getChild(int i) throws IllegalArgumentException, UnsupportedOperationException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getChildCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
