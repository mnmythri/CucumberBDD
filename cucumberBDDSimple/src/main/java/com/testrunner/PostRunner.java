package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions
		(
				features = {"src/main/java/com/api/cucumber/featurefile/PostFeature.feature"},
				glue = {"demo", "CucumberHooks"}
						)

public class PostRunner {

}
