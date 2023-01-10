package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features = ".//Feature/Feature.feature",
	glue = "stepdefinitions",
	dryRun = false
	)

public class testRunner  {
	
}