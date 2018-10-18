package se.bergqvist.jmri_newlogix_plugin;

/**
 * This class is only here to demonstrate a class in the plugin jar file that
 * doesn't implement any known interface.
 */
public class AnotherClass implements Runnable {

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
