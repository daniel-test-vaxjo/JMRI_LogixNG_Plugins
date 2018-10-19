package se.bergqvist.jmri_newlogix_plugin;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import jmri.NewLogixCategory;
import jmri.jmrit.newlogix.ActionPluginFactory;
import jmri.jmrit.newlogix.ActionPluginInterface;
import jmri.jmrit.newlogix.ExpressionPluginFactory;
import jmri.jmrit.newlogix.ExpressionPluginInterface;

/**
 * This factory tells JMRI which expression plugins and action plugins this
 * jar file has. By having a factory class in the jar file, JMRI can load it
 * automaticly if it's in the JMRI classpath.
 * For jar files not intended to be placed in the JMRI classpath, this class
 * is not needed.
 */
public class Factory implements ExpressionPluginFactory, ActionPluginFactory {

    @Override
    public Set<Map.Entry<NewLogixCategory, Class<? extends ExpressionPluginInterface>>> getExpressionClasses() {
        Set<Map.Entry<NewLogixCategory, Class<? extends ExpressionPluginInterface>>> expressionClasses = new HashSet<>();
        expressionClasses.add(new AbstractMap.SimpleEntry<>(NewLogixCategory.OTHER, ExpressionCpuLoad.class));
        expressionClasses.add(new AbstractMap.SimpleEntry<>(NewLogixCategory.COMMON, ExpressionXor.class));
        return expressionClasses;
    }

    @Override
    public Set<Map.Entry<NewLogixCategory, Class<? extends ActionPluginInterface>>> getActionClasses() {
        Set<Map.Entry<NewLogixCategory, Class<? extends ActionPluginInterface>>> actionClasses = new HashSet<>();
        actionClasses.add(new AbstractMap.SimpleEntry<>(NewLogixCategory.OTHER, ActionHideAndShowPanel.class));
        return actionClasses;
    }

}
