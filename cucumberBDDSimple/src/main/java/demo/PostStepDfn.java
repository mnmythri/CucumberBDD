package demo;

import com.api.cucumber.BaseClass;

import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import transformerDataAtRuntime.TransformData;

public class PostStepDfn {

	//1. To create a reference variable in the department class
	//2. To initialize the reference variable via cons
	
	private BaseClass baseClass;
	public PostStepDfn(BaseClass baseClass) {
		this.baseClass = baseClass;
	}
	
	@Given("^User should be logged in$")
    public void user_should_be_logged_in() throws Throwable {
		 System.out.println("1" + baseClass.getFeatureName());
		 System.out.println("1" + baseClass.getScenarioName());
    }

    @When("^I type the text in the text box$")
    public void i_type_the_text_in_the_text_box() throws Throwable {
    	 System.out.println("2");
    }

    @When("^User supply the youtube link in the text box$")
    public void user_supply_the_youtube_link_in_the_text_box() throws Throwable {
    	 System.out.println("3");
    }

    @Then("^The message should be posted$")
    public void the_message_should_be_posted() throws Throwable {
    	 System.out.println("4");
    }

    @Then("^The Video should be posted$")
    public void the_video_should_be_posted() throws Throwable {
    	 System.out.println("5");
    }

    @And("^should be present at its own wall$")
    public void should_be_present_at_its_own_wall() throws Throwable {
    	 System.out.println("6");
    }

    @And("^Click on POST button$")
    public void click_on_post_button() throws Throwable {
        System.out.println("7");
    }

    @When("^I type the text as \"([^\"]*)\" in the text box$")
    public void i_type_the_text_as_something_in_the_text_box(String strArg1) throws Throwable {
    	System.out.println("Value : " +strArg1);
    }
    
    @When("^User supply the youtube link as \"([^\"]*)\" in the text box$")
    public void user_supply_the_youtube_link_as_something_in_the_text_box(@Transform(TransformData.class) String strArg1) throws Throwable {
    	System.out.println("Value : " +strArg1); //+ 1/0);
    }
}