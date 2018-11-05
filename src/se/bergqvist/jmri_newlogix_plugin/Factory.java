package se.bergqvist.jmri_newlogix_plugin;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import jmri.jmrit.newlogix.NewLogixActionPlugin;
import jmri.jmrit.newlogix.NewLogixExpressionPlugin;
import jmri.jmrit.newlogix.Category;
import jmri.jmrit.newlogix.AbstractExpression;
import jmri.jmrit.newlogix.FemaleSocket;
import jmri.jmrit.newlogix.NewLogixPluginFactory;
import org.openide.util.lookup.ServiceProvider;

/**
 * This factory tells JMRI which expression plugins and action plugins this
 * jar file has. By having a factory class in the jar file, JMRI can load it
 * automaticly if it's in the JMRI classpath.
 * For jar files not intended to be placed in the JMRI classpath, this class
 * is not needed.
 * 
 * In order to use the @ServiceProvider annotation, the project needs to
 * include the org-openide-util-lookup-RELEASE82.jar file or a later version.
 * See the lib folder.
 */
@ServiceProvider(service = NewLogixPluginFactory.class)
public class Factory implements NewLogixPluginFactory {

    @Override
    public Set<Map.Entry<Category, Class<? extends NewLogixExpressionPlugin>>> getExpressionClasses() {
        Set<Map.Entry<Category, Class<? extends NewLogixExpressionPlugin>>> expressionClasses = new HashSet<>();
        expressionClasses.add(new AbstractMap.SimpleEntry<>(Category.OTHER, ExpressionCpuLoad.class));
        expressionClasses.add(new AbstractMap.SimpleEntry<>(Category.COMMON, ExpressionXor.class));
        return expressionClasses;
    }

    @Override
    public Set<Map.Entry<Category, Class<? extends NewLogixActionPlugin>>> getActionClasses() {
        Set<Map.Entry<Category, Class<? extends NewLogixActionPlugin>>> actionClasses = new HashSet<>();
        actionClasses.add(new AbstractMap.SimpleEntry<>(Category.OTHER, ActionHideAndShowPanel.class));
        return actionClasses;
    }

}
