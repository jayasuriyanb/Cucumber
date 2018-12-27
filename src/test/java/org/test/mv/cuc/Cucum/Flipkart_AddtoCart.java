package org.test.mv.cuc.Cucum;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Flipkart_AddtoCart {
	static WebDriver driver;
	@Given("the user is in flipkart home page")
	public void the_user_is_in_flipkart_home_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Cucum\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	}

	@When("user navigate to electroic->mobile menu")
	public void user_navigate_to_electroic_mobile_menu() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Mi']")).click();
		Thread.sleep(4000);
	}

	@When("selecting the product and add to cart {string}")
	public void selecting_the_product_and_add_to_cart(String mob) throws InterruptedException {
		//WebElement mobile = null;
		WebElement head = driver.findElement(By.xpath("(//div[@class='_1HmYoV _35HD7C'])[2]"));
		List<WebElement> product = head.findElements(By.xpath("//div[@class='_3O0U0u']"));
		Integer valueOf = Integer.valueOf(mob);
		product.get(valueOf).click();
		Thread.sleep(2000);
		Set<String> allwin = driver.getWindowHandles();
		List<String> a=new ArrayList<String>();
		a.addAll(allwin);
		driver.switchTo().window(a.get(1));
		driver.findElement(By.id("pincodeInputId")).sendKeys("625016");
		driver.findElement(By.xpath("//span[text()='Check']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
		Thread.sleep(2000);
		}
	
	//random number
	@When("selecting random product and add to card")
	public void selecting_random_product_and_add_to_card() throws InterruptedException {
		WebElement head = driver.findElement(By.xpath("(//div[@class='_1HmYoV _35HD7C'])[2]"));
		List<WebElement> product = head.findElements(By.xpath("//div[@class='_3O0U0u']"));
		Random r =new Random();
		int a=r.nextInt(10)+1;
		System.out.println(a);
		product.get(a).click();
		Thread.sleep(2000);
		Set<String> allwin = driver.getWindowHandles();
		List<String> w=new ArrayList<String>();
		w.addAll(allwin);
		driver.switchTo().window(w.get(1));
		driver.findElement(By.id("pincodeInputId")).sendKeys("625016");
		driver.findElement(By.xpath("//span[text()='Check']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
		Thread.sleep(2000);
	}

	@Then("verift the cart weather the product is availabe")
	public void verift_the_cart_weather_the_product_is_availabe() {
		Assert.assertEquals("REMOVE", driver.findElement(By.xpath("//span[text()='Remove']")).getText());
	}
}
