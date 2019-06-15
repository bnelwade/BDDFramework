package Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "E:\\BDDFramework\\BDDFramework\\src\\main\\java\\Features\\Login.feature" }, glue = {
		"StepDefinitionPack" }, format = { "pretty", "html:test-output",
				"json:json-output" }, strict = true, monochrome = true, dryRun = false)

public class MyTestCaseRunner {

}
