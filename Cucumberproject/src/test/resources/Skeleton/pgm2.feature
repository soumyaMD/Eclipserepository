Feature:Demo Web Shop Login feature file
@valid
Scenario Outline:Valid login for Demo Web Shop
Given The URL of the demo WebShop "http://demowebshop.tricentis.com/login"
When User enters "askmail@gmail.com" as uSername
And User enters "abc123" as pAssword
And User clicks on login bUtton
Then User is in a Valid Page
 
 
 Examples:
  |username| password|
  |askmail@gmail.com|abc123|
 