package Mystoreproject;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by SHRADHA on 23/01/2018.
 */
public class Hooks {
    BasePage baseMain = new BasePage();

    @Before
    public void setUp() throws Throwable {
        baseMain.openbrowser();
    }

    @After
    public void teardown() {
        //  baseMain.closeBrowser();
    }
}



