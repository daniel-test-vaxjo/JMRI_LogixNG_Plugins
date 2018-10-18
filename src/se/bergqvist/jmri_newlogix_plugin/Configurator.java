package se.bergqvist.jmri_newlogix_plugin;

import java.util.Map;
import javax.swing.JPanel;
import jmri.jmrit.newlogix.swing.PluginConfiguratorInterface;

/**
 * A configurator for the plugins in this project.
 * 
 * @author Daniel Bergqvist Copyright 2018
 */
public class Configurator implements PluginConfiguratorInterface {

    @Override
    public JPanel getConfigPanel(String className) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public JPanel getConfigPanel(String className, Map<String, String> config)
            throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Map<String, String> getConfigFromPanel(JPanel panel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
