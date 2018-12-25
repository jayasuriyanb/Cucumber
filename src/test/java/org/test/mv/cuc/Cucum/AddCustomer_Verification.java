package org.test.mv.cuc.Cucum;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AddCustomer_Verification {
	static WebDriver driver; 
	@Given("the user is in guru{int} home page")
	public void the_user_is_in_guru_home_page(Integer int1) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Cucum\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize();
	}

	@Given("user navigate to Add Customer")
	public void user_navigate_to_Add_Customer() {
		 driver.findElement(By.xpath("//section[@id='one']//a[text()='Add Customer']")).click();
	}

	@When("user clicking sumbit button without data")
	public void user_clicking_sumbit_button_without_data() {
		 driver.findElement(By.xpath("//input[@name='submit']")).click();
	}
	
	@Then("Verify it show's an alert")
	public void verify_it_show_s_an_alert() {
		Alert a=driver.switchTo().alert();
		a.accept();
	}
	//message
	@When("if user enter invalid data {string},{string},{string},{string},{string}")
	public void if_user_enter_invalid_data(String fname, String lname, String email, String address, String phonenumber) {
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(fname);		
		driver.findElement(By.id("lname")).sendKeys(lname);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.name("addr")).sendKeys(address);
		driver.findElement(By.id("telephoneno")).sendKeys(phonenumber); 
	}

	@Then("the user should see the message")
	public void the_user_should_see_the_message() {
		Assert.assertEquals("Numbers are not allowed", driver.findElement(By.xpath("//label[@id='message']")).getText());
		Assert.assertEquals("Numbers are not allowed", driver.findElement(By.xpath("//label[@id='message50']")).getText());
		Assert.assertEquals("Email-ID is not valid", driver.findElement(By.xpath("//label[@id='message9']")).getText());
		Assert.assertEquals("Address Field must not be blank", driver.findElement(By.xpath("//label[@id='message3']")).getText());
		Assert.assertEquals("Special characters are not allowed", driver.findElement(By.xpath("//label[@id='message3']")).getText());
		Assert.assertEquals("Characters are not allowed", driver.findElement(By.xpath("//label[@id='message7']")).getText());
	}
	//message-end
	//reset-button
	@When("user enter the data in form {string},{string},{string},{string},{string}")
	public void user_enter_the_data_in_form(String fname, String lname, String email, String address, String phonenumber) {
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(fname);		
		driver.findElement(By.id("lname")).sendKeys(lname);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.name("addr")).sendKeys(address);
		driver.findElement(By.id("telephoneno")).sendKeys(phonenumber); 
	}

	@When("the user click reset button")
	public void the_user_click_reset_button() {
		driver.findElement(By.xpath("//input[@class='alt']")).click();
	}

	@Then("To check All the data removed")
	public void to_check_All_the_data_removed() {
	    Assert.assertEquals("", driver.findElement(By.id("fname")).getAttribute("value")); 
	    Assert.assertEquals("", driver.findElement(By.id("lname")).getAttribute("value"));
	    Assert.assertEquals("", driver.findElement(By.id("email")).getAttribute("value"));
	    Assert.assertEquals("", driver.findElement(By.name("addr")).getAttribute("value"));
	    Assert.assertEquals("", driver.findElement(By.id("telephoneno")).getAttribute("value"));
	}
}
