Feature: Usedr login Feature 


Scenario: User login scenario 
	Given User is at the login page at the application 
	When User login with following Username and password 
		| username1 | password1 |
		| username2 | password2 |
		| username3 | password3 |
		| username4 | password4 |
	Then user should be able to login with correct username and password
	
	