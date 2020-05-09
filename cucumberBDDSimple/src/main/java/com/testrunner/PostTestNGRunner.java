package com.testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions
		(
				features = {"src/main/java/com/api/cucumber/featurefile/PostFeature.feature",
						"src/main/java/com/api/cucumber/featurefile/LoginPage.feature"},
				glue = {"demo"},
				monochrome = true
						)

public class PostTestNGRunner extends AbstractTestNGCucumberTests{

}
