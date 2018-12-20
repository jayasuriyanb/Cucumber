package org.test.mv.cuc.Cucum;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Google {
	static WebDriver driver;
	@Given("User is in google home page")
	public void user_is_in_google_home_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Cucum\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@When("User search for text")
	public void user_search_for_text() {
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
	}

	@Then("User should be in search results page")
	public void user_should_be_in_search_results_page() {
		Assert.assertTrue(driver.getCurrentUrl().contains("search"));
	}
}
