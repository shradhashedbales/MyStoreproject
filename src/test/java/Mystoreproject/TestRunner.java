package Mystoreproject;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by SHRADHA on 23/01/2018.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Mystoreproject/features/",
        tags ={"@smoke1"},
        // format = {"pretty:target/pretty-reports.pretty","html:target/html-reports.html", "json:target/json-reports.json"},
        dryRun = false,strict = true)
public class TestRunner {


   }
