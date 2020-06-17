package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//Copy Paste the below code
@RunWith(Cucumber.class)
//Configure Features & glue paths
@CucumberOptions(features="src/test/java/features",glue="stepDefinations")

public class TestRunner {

}
