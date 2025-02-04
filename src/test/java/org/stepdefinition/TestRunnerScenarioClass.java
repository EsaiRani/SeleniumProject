package org.stepdefinition;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
glue = "org.stepdefinition",
monochrome = true, 
dryRun=false,
snippets= SnippetType.UNDERSCORE,
plugin= {"html:Report\\report.html","junit:Report\\junitreport.xml","json:Report\\jsonreport.json"})

public class TestRunnerScenarioClass {


}
