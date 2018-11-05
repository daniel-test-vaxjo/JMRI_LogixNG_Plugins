package se.bergqvist.jmri_newlogix_plugin;

import java.util.Map;
import jmri.jmrit.newlogix.NewLogixActionPlugin;
import jmri.jmrit.newlogix.Category;
import jmri.jmrit.newlogix.AbstractAction;
import jmri.jmrit.newlogix.FemaleSocket;

/**
 * Hides and shows a panel
 * 
 * @author Daniel Bergqvist Copyright(C) 2018
 */
public class ActionHideAndShowPanel extends AbstractAction
        implements NewLogixActionPlugin {

    public ActionHideAndShowPanel() throws BadSystemNameException {
        super("Daniel");
    }

    @Override
    public Category getCategory() {
        return Category.OTHER;
    }

    @Override
    public boolean isExternal() {
        return true;
    }

    @Override
    public boolean executeStart() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean executeContinue() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean executeRestart() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void abort() {
        throw new UnsupportedOperationException("Not supported yet.");
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
    public FemaleSocket getChild(int i) throws IllegalArgumentException, UnsupportedOperationException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getChildCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
