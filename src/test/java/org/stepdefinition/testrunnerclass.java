package org.stepdefinition;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue = "org.stepdefinition",monochrome=true,dryRun=false,strict=true)
public class testrunnerclass {
	
	

}
