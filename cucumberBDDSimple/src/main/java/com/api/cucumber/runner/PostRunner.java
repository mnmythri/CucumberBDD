package com.api.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/main/java/com/api/cucumber/featurefile/PostFeature.feature"},
		glue = {"src/main/java/com/api/cucumber/stepdfn"}
//glue = {"com.api.cucumber.stepdfn"}
		)



public class PostRunner {

}


