Feature: Automate Test Leaf Application

@FUNCTIONAL
Scenario Outline: TC001_Login and Logout

	Given Launch Chrome Browser and Load URL
	Given enter Username as <username>
	Given enter Password as <password>
	When click the Login button
	Then its navigated Homepage
	Then click the Logout button
	Then close the browser
	
	Examples:
	
			|username|password|
			|DemoSalesManager|crmsfa|
			|DemoCSR|crmsfa|

@WIP
Scenario:  TC002_Login and Logout for failure

	Given Launch Chrome Browser and Load URL 
	And enter username as ssssss 
	And enter password as crmsfa 
	When click the Login button 
	Then its navigate same Page
	But verify error msg
	And close the browser

@FUNCTIONAL	
Scenario Outline: TC003_CreatLead

	Given Launch Chrome Browser and Load URL
	Given enter username as DemoSalesManager
	Given enter password as crmsfa
	When click the Login button
	And Click CRM/SFA link
	And Click Creat Lead link
	And Enter company name as <companyname>
	And Enter first name as <firstname>
	And Enter last name as <lastname>
	And click Create Lead button
	Then close the browser

Examples: 
         |companyname|firstname|lastname|
         |ABC|Hema|Ma|
         |XYZ|He|Mali|
         |CBC|Gopi|Raj|