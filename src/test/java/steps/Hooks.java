package steps;

import com.google.inject.Inject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import support.Core;


public class Hooks {

    @Inject
    private Core core;

    @Before
    public void setUp() {
        core.setUp();
    }

    @After
    public void tearDown(){
        core.quitBrowser();
    }

}
