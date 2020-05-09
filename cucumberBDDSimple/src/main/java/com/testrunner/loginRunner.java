package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions
		(
				features = {"src/main/java/com/api/cucumber/featurefile/LoginPage.feature"},
				glue = {"demo"},
		//glue = {"com.api.cucumber.stepdfn"}
				dryRun = false,
				monochrome = true
				)

public class loginRunner {

}
