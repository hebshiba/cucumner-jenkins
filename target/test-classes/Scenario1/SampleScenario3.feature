Feature: Login testmeapp application

Scenario Outline: login with data credentials
When user opens chrome
When user entering valid username as "<username>" And password as "<password>"in field
And user clicks login
Then verify login 


Examples:
|username|password|
|mercury|mercury|
#|merry|mercury|