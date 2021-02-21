package se.bergqvist.jmri.logixng;

import java.util.Locale;
import java.util.Map;
import jmri.JmriException;
import jmri.jmrit.logixng.Base;
//import jmri.jmrit.logixng.NewLogixActionPlugin;
import jmri.jmrit.logixng.Category;
import jmri.jmrit.logixng.actions.AbstractDigitalAction;
import jmri.jmrit.logixng.FemaleSocket;

/**
 * Hides and shows a panel
 * 
 * @author Daniel Bergqvist Copyright(C) 2018
 */
public class ActionHideAndShowPanel extends AbstractDigitalAction {
//        implements NewLogixActionPlugin {

    public ActionHideAndShowPanel(String sys, String user) throws BadSystemNameException {
        super(sys, user);
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
    public void execute() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public FemaleSocket getChild(int i) throws IllegalArgumentException, UnsupportedOperationException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getChildCount() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected void registerListenersForThisClass() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected void unregisterListenersForThisClass() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected void disposeMe() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Base getDeepCopy(Map<String, String> map, Map<String, String> map1) throws JmriException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getShortDescription(Locale locale) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getLongDescription(Locale locale) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setup() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
