Feature: Login invalid functionality
Description: Registered user login to the application by entering invalid credentials
Mapping: John would like to access the online shopping page. He should be registered and use the registerd credentials to get logged in to the application
 
Scenario: login with invalid data
When user opens chrome browser and opens application
When user entering invalid username as 1234 And password in field
And user clicks on signin button
Then verify login result