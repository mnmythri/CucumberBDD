Feature: Post feature of facebook
	This will test the post functionality at the user wall
	
Background: Common Steps
Given User should be logged in
And should be present at its own wall

	
Scenario: Post a text on user wall

When I type the text as "This is a Sample text" in the text box
And Click on POST button
Then The message should be posted

Scenario: Post a video on user wall

When User supply the youtube link as "https://www.google.com" in the text box
And Click on POST button
Then The Video should be posted