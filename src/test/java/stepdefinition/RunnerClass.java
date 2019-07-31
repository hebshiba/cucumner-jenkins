package stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Scenario1/SampleScenario4.feature",
//glue="com.Demo",
plugin="json:target\\jsonreport.json",tags={"@login or @regression"})

public class RunnerClass {

}
