package org.test.mv.cuc.Cucum;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Flipkart_ArgumentPassing {
	static WebDriver driver;
	@Given("user is in flipkart home page")
	public void user_is_in_flipkart_home_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Cucum\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	}

	@When("navigate through arguments {string},{string}")
	public void navigate_through_arguments(String menu, String product) throws InterruptedException {
		String locator="//span[text()='@']";
		locator=locator.replace("@", menu);
		WebElement m = driver.findElement(By.xpath(locator));
		m.click();
		Thread.sleep(2000);
		String locator2="//a[text()='#']";
		locator2=locator2.replace("#", product);
		WebElement pro = driver.findElement(By.xpath(locator2));
		pro.click();
	}

	@When("navigate through arguments {string},{string},{string}")
	public void navigate_through_arguments(String Men, String s, String ADIDAS) throws InterruptedException {
		String loca="//span[text()='@']";
		loca=loca.replace("@", Men);
		WebElement m = driver.findElement(By.xpath(loca));
		m.click();
		Thread.sleep(2000);
		s="Sports wear";
		String locator3="//a[text()='#']";
		locator3=locator3.replace("#", s);
		WebElement pro = driver.findElement(By.xpath(locator3));
		pro.click();
		Thread.sleep(4000);
		String l="//div[text()='%']";
		l=l.replace("%", ADIDAS);
		driver.findElement(By.xpath("l")).click();
	}

	@Then("verify user in selected product")
	public void verify_user_in_selected_product() {
		 Assert.assertEquals("mobile",driver.getCurrentUrl().contains("mobile"));

	}
}
