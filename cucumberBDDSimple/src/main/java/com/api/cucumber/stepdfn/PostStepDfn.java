package com.api.cucumber.stepdfn;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

public class PostStepDfn {

	@Given("^User should be logged in $")
    public void user_should_be_logged_in() throws Throwable {
		 System.out.println("1");
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

    
}