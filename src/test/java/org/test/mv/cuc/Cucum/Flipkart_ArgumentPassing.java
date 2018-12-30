package org.test.mv.cuc.Cucum;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Flipkart_ArgumentPassing {
	static WebDriver driver;
	@Given("user is in flipkart home page")
	public void user_is_in_flipkart_home_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Cucu\\Cucumber\\driver\\chromedriver.exe");
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
	
	//filter
	
	@When("user enter the product {string}")
	public void user_enter_the_product(String mobile) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(mobile);
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
	}
	@When("using filters user selecting product {string},{string},{string},{string},{string}")
	public void using_filters_user_selecting_product(String RAM, String RATING, String SIM, String min, String max) {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//option[text()='Min']")).click();
		WebElement minimum = driver.findElement(By.xpath("(//select[@class='fPjUPw'])[1]"));
		Select select=new Select(minimum);
		select.selectByVisibleText(min);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//option[text()='₹50000+']")).click();
		WebElement maximum = driver.findElement(By.xpath("(//select[@class='fPjUPw'])[2]"));
		Select select_max=new Select(maximum);
		select_max.selectByVisibleText(max);
		String locator="//div[contains(text(),'$')]";
		locator=locator.replace("$", RAM);
		driver.findElement(By.xpath(locator)).click();
		String rating="//div[contains(text(),'@★')]";
		rating=rating.replace("@", RATING);
		driver.findElement(By.xpath(rating)).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[@class='_3xglSm _1iMC4O'])[9]")).click();
		String sim="//div[text()='$ Sim']";
		sim=sim.replace("$", SIM);
		driver.findElement(By.xpath(sim)).click();
		
	}
	

	@Then("verify weather the user get the product")
	public void verify_weather_the_user_get_the_product() {
		Assert.assertEquals("CLEAR ALL", driver.findElement(By.xpath("(//span[text()='Clear all'])[1]")).getText());
	/*	Assert.assertEquals("Dual Sim", driver.findElement(By.xpath("(//div[@class='_3UZZGt'])[1]")).getText());
		Assert.assertEquals("4★ & above", driver.findElement(By.xpath("(//div[@class='_3UZZGt'])[2]")).getText());
		Assert.assertEquals("Less than 512 MB", driver.findElement(By.xpath("(//div[@class='_3UZZGt'])[3]")).getText()); */
	}

}
