package org.test.mv.cuc.Cucum;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"D:\\selenium\\Cucum\\feature\\PaymentGateWay.feature"},glue= {"org\\test\\mv\\cuc\\Cucum"},tags= {"@gcd"},
	dryRun=false,monochrome=true)
public class PayTestRunner {
	
}
