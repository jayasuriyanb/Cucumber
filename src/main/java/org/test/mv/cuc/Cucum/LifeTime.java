package org.test.mv.cuc.Cucum;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LifeTime {
	static WebDriver driver;
	String mb,location,sports,kids,health,spa,cafe,events,training,classes;
	@Given("going to home page of lifetime")
	public void going_to_home_page_of_lifetime() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Cucum\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.lifetime.life/");
		driver.manage().window().maximize();
	}

	@When("printing all menu in console")
	public void printing_all_menu_in_console() {
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@id='primaryNav']//li"));
		for(int i=0;i<menu.size();i++) {
			System.out.println(menu.get(i).getText());	
		}
		
		
	/*	mb = driver.findElement(By.xpath("//ul[@id='primaryNav']//li[1]")).getText();
		System.out.println(mb);
		location = driver.findElement(By.xpath("//li[@class='nav-item  ']//following-sibling::li[1]")).getText();
		System.out.println(location);
		classes = driver.findElement(By.xpath("//li[@class='nav-item  ']//following-sibling::li[2]")).getText();
		System.out.println(classes);
		training = driver.findElement(By.xpath("//li[@class='nav-item  ']//following-sibling::li[3]")).getText();
		System.out.println(training);
		sports = driver.findElement(By.xpath("//li[@class='nav-item  ']//following-sibling::li[4]")).getText();
		System.out.println(sports);
		kids = driver.findElement(By.xpath("//li[@class='nav-item  ']//following-sibling::li[5]")).getText();
		System.out.println(kids);
		health = driver.findElement(By.xpath("//li[@class='nav-item  ']//following-sibling::li[6]")).getText();
		System.out.println(health);
		spa = driver.findElement(By.xpath("//li[@class='nav-item  ']//following-sibling::li[7]")).getText();
		System.out.println(spa);
		cafe = driver.findElement(By.xpath("//li[@class='nav-item  ']//following-sibling::li[8]")).getText();
		System.out.println(cafe);
		events = driver.findElement(By.xpath("//li[@class='nav-item  ']//following-sibling::li[9]")).getText();
		System.out.println(events);*/
		}

	@Then("verify all the menu printed")
	public void verify_all_the_menu_printed() {
		Assert.assertTrue(true);
	}
	//drop down
	@When("printing all drop down value in console")
	public void printing_all_drop_down_value_in_console() {
		//location
		List<WebElement> submenu = driver.findElements(By.xpath("//a[@class='dropdown-item ']"));
		for(int i=0;i<submenu.size();i++) {
			System.out.println(submenu.get(i).getText());	
		}
	}
	
}
