package se.bergqvist.jmri_newlogix_plugin;

import jmri.jmrit.newlogix.Category;
import jmri.jmrit.newlogix.AbstractAction;
import jmri.jmrit.newlogix.FemaleSocket;

/**
 * This class implements Action but not ActionPluginInterface
 * and is therefore not a valid plugin.
 * 
 * @author Daniel Bergqvist Copyright(C) 2018
 */
public class InvalidAction extends AbstractAction {

    public InvalidAction(String sys) throws BadSystemNameException {
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
    public boolean executeStart() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean executeContinue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean executeRestart() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void abort() {
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
