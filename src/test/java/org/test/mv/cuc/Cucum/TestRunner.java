package org.test.mv.cuc.Cucum;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\selenium\\Cucum\\feature\\AddCustomer_Verification.feature",tags= {"@reset"},
	glue= {"org\\test\\mv\\cuc\\Cucum"} ,dryRun=false,plugin={"html:target"},monochrome=true)
public class TestRunner {

}
