Feature: Post feature of facebook
	This will test the post functionality at the user wall
	
Scenario: Post a text on user wall
Given User should be logged in 
And should be present at its own wall
When I type the text in the text box
And Click on POST button
Then The message should be posted

Scenario: Post a video on user wall
Given User should be logged in 
And should be present at its own wall
When User supply the youtube link in the text box
And Click on POST button
Then The Video should be posted