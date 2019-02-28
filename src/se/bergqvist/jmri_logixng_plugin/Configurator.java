package se.bergqvist.jmri_logixng_plugin;

import java.util.Map;
import javax.swing.JPanel;
import jmri.jmrit.logixng.swing.PluginConfiguratorInterface;

/**
 * A configurator for the plugins in this class.
 * 
 * @author Daniel Bergqvist Copyright 2018
 */
public class Configurator implements PluginConfiguratorInterface {

    @Override
    public JPanel getConfigPanel(String string) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JPanel getConfigPanel(String string, Map<String, String> map) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map<String, String> getConfigFromPanel(JPanel pnl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
