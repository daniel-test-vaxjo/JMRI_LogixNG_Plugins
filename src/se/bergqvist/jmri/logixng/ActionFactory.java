package se.bergqvist.jmri.logixng;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//import jmri.jmrit.logixng.NewLogixActionPlugin;
//import jmri.jmrit.logixng.NewLogixExpressionPlugin;
import jmri.jmrit.logixng.Category;
import jmri.jmrit.logixng.DigitalActionBean;
import jmri.jmrit.logixng.DigitalActionFactory;
//import jmri.jmrit.logixng.NewLogixPluginFactory;
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
@ServiceProvider(service = DigitalActionFactory.class)
public class ActionFactory implements DigitalActionFactory {

    @Override
    public Set<Map.Entry<Category, Class<? extends DigitalActionBean>>> getActionClasses() {
        Set<Map.Entry<Category, Class<? extends DigitalActionBean>>> actionClasses = new HashSet<>();
        actionClasses.add(new AbstractMap.SimpleEntry<>(Category.OTHER, ActionHideAndShowPanel.class));
        return actionClasses;
    }

}
