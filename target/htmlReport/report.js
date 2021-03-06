$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Scenario1/SampleScenario.feature");
formatter.feature({
  "name": "Login functionality",
  "description": "Description: Registered user login to the application by entering valid credentials\nMapping: John would like to access the online shopping page. He should be registered and use the registerd credentials to get logged in to the application",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "login with valid data",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user opens chrome browser and opens application",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.user_opens_chrome_browser_and_opens_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user entering username as \"mercury\" And password in field",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.user_entering_username_as_And_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on signin button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.user_clicks_on_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify login result",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.verify_login_result()"
});
formatter.result({
  "status": "passed"
});
});