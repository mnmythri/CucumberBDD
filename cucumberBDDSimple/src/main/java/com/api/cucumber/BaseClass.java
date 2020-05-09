package com.api.cucumber;

public class BaseClass {
	
	private String featureName;
	
	public String getFeatureName() {
		return featureName;
	}


	private String ScenarioName;
	
	public String getScenarioName() {
		return ScenarioName;
	}
	
	public BaseClass() {
	featureName = "BDD";
	ScenarioName = "DI";
	}

}
