package org.test.mv.cuc.Cucum;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/java/feature/"},glue="org\\test\\mv\\cuc\\Cucum",tags= {"@shopping"},dryRun=true,monochrome=true)
public class Flipkart_Runner {


}
