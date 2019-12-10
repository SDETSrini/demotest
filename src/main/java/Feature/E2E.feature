Feature: Sanity Test

Background: 
	Given User is on home page 
	And Close cookie policy and deny notification 
	
	
Scenario Outline: Guest User checkout 
	When User click on "<category>"  and select  "<subcategory>" 
	And Select the first product 
	And Select the quantity size and proceed to cart 
	And User lands on cart page and proceed 
	Then User lands on Welcome page 
	And user enter "<EmailID>" and proceed as guest user 
	And User lands on billing address page 
	And User enters billing address and proceed 
	Then User lands on payment page 
	And User pay using "<PaymentMethod>" 
	Then Verify order confirmation page 
	
	Examples: 
	
		|category|subcategory|PaymentMethod|EmailID|
		| Men	| Tshirt	|CC				|Test@gmail.com|


Scenario Outline: Registered User checkout 
	When User click on "<category>"  and select  "<subcategory>" 
	And Select the Second product 
	And Select the quantity size and proceed to cart 
	And User lands on cart page and proceed 
	Then User lands on Welcome page 
	And User proceed as Reg User with "<emailid>" and "<password>"
	And User lands on billing address page 
	And User enters billing address and proceed 
	Then User lands on payment page 
	And User pay using "<PaymentMethod>" 
	Then Verify order confirmation page 
	
	Examples: 
		|category	|subcategory	|PaymentMethod	|EmailID		|
		|Women		| shirt			|Paypal			|Test@gmail.com	|
		
