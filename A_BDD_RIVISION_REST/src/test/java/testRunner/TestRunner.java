package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/bddFeatureFile",
		glue= "stepDefination",
		dryRun=true
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
