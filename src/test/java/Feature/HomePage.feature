Feature: HomePage Feature Test

#@Smoke @Regression @E2E
#Scenario: Verify Title of the HomePage
#	Given User is on HomePage
#	Then Verify the title of the Homepage
#	And Close the browser
#
#@E2E
#Scenario: Verify Login Btn on the Homepage
#	Given User is on HomePage
#	And User Click on Login Btn
#	Then User is navigated to LoginPage
#	And Close the browser
	
@E2E1
Scenario: Verify the happy path of Login
	Given User is on HomePage
	And User Click on Login Btn
	Then User is navigated to LoginPage
	And User enter "Srinivas.Naika@gmail.com" and "Srini-123" 
	And Click Login
	Then User is Logged in Successfully

@E2E2	
Scenario Outline: Verify the happy path of Login using scenario outline
	Given User is on HomePage
	And User Click on Login Btn
	Then User is navigated to LoginPage
	And User enter "<username>" and "<password>"
	And Click Login
	Then User is Logged in Successfully	
	
	Examples: 
	|username | password |
	| Srinivas.Naika@gmail.com | Srini-123 |
    | Srinivas.Naika1@gmail.com | Srini-123 |
	

