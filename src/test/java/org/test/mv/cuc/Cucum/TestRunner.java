package org.test.mv.cuc.Cucum;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\feature\\Flipkart_Arguments.feature",tags= {"@tag2"},
	glue= {"org\\test\\mv\\cuc\\Cucum"} ,dryRun=false,plugin={"html:target"},monochrome=true)
public class TestRunner {

}
