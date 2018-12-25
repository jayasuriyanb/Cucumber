package org.test.mv.cuc.Cucum;

import java.util.Map;
import java.lang.String;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomer {
	static WebDriver driver;
	@Given("user is in guru telecom user page")
	public void user_is_in_guru_telecom_user_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Cucum\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize();
	}

	@Given("the customer navigate to add customer")
	public void the_customer_navigate_to_add_customer() {
	   driver.findElement(By.xpath("//section[@id='one']//a[text()='Add Customer']")).click();
	}

	@When("fill the registeration form")
	public void fill_the_registeration_form(DataTable dataTable) {
	/*	List<String> asList = dataTable.asList();
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(asList.get(1));
		driver.findElement(By.id("lname")).sendKeys(asList.get(2));
		driver.findElement(By.id("email")).sendKeys(asList.get(3));
		driver.findElement(By.name("addr")).sendKeys(asList.get(4));
		driver.findElement(By.id("telephoneno")).sendKeys(asList.get(5)); */
		driver.findElement(By.xpath("//label[text()='Done']")).click();	
	/*	List<List<String>> asLists = dataTable.asLists();
		driver.findElement(By.id("fname")).sendKeys(asLists.get(1).get(1));
		driver.findElement(By.id("lname")).sendKeys(asLists.get(1).get(2));
		driver.findElement(By.id("email")).sendKeys(asLists.get(1).get(3));
		driver.findElement(By.name("addr")).sendKeys(asLists.get(1).get(4));
		driver.findElement(By.id("telephoneno")).sendKeys(asLists.get(1).get(5)); */
		Map<String, String> asMap = dataTable.asMap(String.class, String.class);
		//System.out.println(asMap);
		driver.findElement(By.id("fname")).sendKeys(asMap.get("fisrtname"));
		driver.findElement(By.id("lname")).sendKeys(asMap.get("lastname"));
		driver.findElement(By.id("email")).sendKeys(asMap.get("email1"));
		driver.findElement(By.name("addr")).sendKeys(asMap.get("address1"));
		driver.findElement(By.id("telephoneno")).sendKeys(asMap.get("phnum1"));
	/*	List<Map<String, String>> asMaps = dataTable.asMaps();
		System.out.println(asMaps);
		driver.findElement(By.id("fname")).sendKeys(asMaps.get(1).get("fname"));
		driver.findElement(By.id("lname")).sendKeys(asMaps.get(1).get("lname"));
		driver.findElement(By.id("email")).sendKeys(asMaps.get(1).get("email"));
		driver.findElement(By.name("addr")).sendKeys(asMaps.get(1).get("address"));
		driver.findElement(By.id("telephoneno")).sendKeys(asMaps.get(1).get("phnum"));*/	
	}

	@When("Submit the form")
	public void submit_the_form() {
	   driver.findElement(By.xpath("//input[@name='submit']")).click();
	   // driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[9]/ul/li[1]/input")).click();
	}

	@Then("Verify the customer ID")
	public void verify_the_customer_ID() {
		Assert.assertEquals("Please Note Down Your CustomerID", driver.findElement(By.xpath("(//section[@id='main']//b)[2]")).getText());
	}
}
