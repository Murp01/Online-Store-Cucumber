Feature: Login Action

Scenario Outline: Successful login with valid credentials
	Given the user is on the homepage
	When navigating to the login page
	And the user enters "<username>" and "<password>"
	Then login successful will be displayed
	
Examples:
	| username   | password |
	| test123321 | welcome1 | 
	| test123322 | welcome2 |	
	
Scenario: Successful logout
	When the user logs out of the application
	Then logout successful will be displayed

