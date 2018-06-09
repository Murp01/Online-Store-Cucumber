Feature: Login Action

Scenario: Successful login with valid credentials
	Given the user is on the homepage
	When navigating to the login page
	And the user enters the login name and password
	Then login successful will be displayed
	
Scenario: Successful logout
	When the user logs out of the application
	Then logout successful will be displayed
