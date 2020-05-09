package demo;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginDemoSd {

	@Given("^User is at the login page at the application$")
	public void user_is_at_the_login_page_at_the_application() throws Throwable {
	    
	}

	@When("^User login with following Username and password$")
	public void user_login_with_following_Username_and_password(DataTable table) throws Throwable {
		
		// Use of Data table
	  /*  List<List<String>> data = table.raw();
	    for(List<String> str : data) {
	    	for(String str1 : str) {
	    		System.out.println("Data :" +str1);
	    	}
	    }*/
	    
	// DATA table to Map data structured
//	Map<String, String> data = table.asMap(String.class, String.class);
//	for(String key : data.keySet()) {
//		System.out.println(String.format("key : %s , value : %s", key,data.get(key)));
//	}
		// Data table to List data structured
		
		List<String> datalist = table.asList(String.class);
		for(String key : datalist ) {
			System.out.println(String.format("value of key"+ key));
		}
	}

	@Then("^user should be able to login with correct username and password$")
	public void user_should_be_able_to_login_with_correct_username_and_password() throws Throwable {
	    }



}