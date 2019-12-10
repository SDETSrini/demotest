Feature: Login Feature Test

@Sanity1 @Regression
Scenario: Verify Title of the LoginPage
	Given User is on HomePage
	And User Click on Login Btn
	And User is navigated to LoginPage
	Then Verify the title of LoginPage
	
	