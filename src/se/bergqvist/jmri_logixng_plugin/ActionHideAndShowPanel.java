package se.bergqvist.jmri_logixng_plugin;

import java.util.Map;
import jmri.jmrit.logixng.Category;
import jmri.jmrit.logixng.actions.AbstractAction;
import jmri.jmrit.logixng.ActionPlugin;
import jmri.jmrit.logixng.FemaleSocket;
// .ActionPluginInterface;

/**
 * Hides and shows a panel
 * 
 * @author Daniel Bergqvist Copyright(C) 2018
 */
public class ActionHideAndShowPanel extends AbstractAction implements ActionPlugin {

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
