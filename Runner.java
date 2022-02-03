package runner;

import java.text.Format;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
import step.BaseClass;

@CucumberOptions(features="src/test/java/features"
				  ,glue = "step"
				  ,monochrome=true
				  ,dryRun = false
				  ,snippets = SnippetType.CAMELCASE
				  ,tags="@LeadScenarios"
				  ,publish=true)
public class Runner extends BaseClass {

}
