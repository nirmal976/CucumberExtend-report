Feature: Login function validations
@LoginTest
Scenario Outline:Login with data table

Given As a user i can open any browser
And As a user i can enter the  "https://admin-demo.nopcommerce.com/" and go to the login features
When As a user i can enter as "<userName>" and password "<passWord>"
And clik on login
And Homepage title should be "Dashboard/nonCommerce administration"
And As a user i can click on Logout Link
Then Login page title should be "Your store.Login"  
And close the browser

	Examples: 
	|userName			|passWord|
	|admin@yourstore.com|admin|
