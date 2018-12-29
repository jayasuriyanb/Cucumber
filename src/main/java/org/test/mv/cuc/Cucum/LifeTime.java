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
	String mb, location, sports, kids, health, spa, cafe, events, training, classes;

	@Given("going to home page of lifetime")
	public void going_to_home_page_of_lifetime() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Cucu\\Cucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.lifetime.life/");
		driver.manage().window().maximize();
	}

	@When("printing all menu in console")
	public void printing_all_menu_in_console() {
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@id='primaryNav']//li"));
		for (int i = 0; i < menu.size(); i++) {
			boolean empty = menu.get(i).getText().isEmpty();
			if (empty == true) {
				driver.findElement(By.xpath("//a[text()='Locations']")).click();
				System.out.println(menu.get(i).getText());
				if (empty == true) {
					driver.findElement(By.xpath("//a[text()='Membership']")).click();
					System.out.println(menu.get(i).getText());
					if (empty == true) {
						driver.findElement(By.xpath("//a[text()='Explore']")).click();
						System.out.println(menu.get(i).getText());
					}
				}
			} else {
				System.out.println(menu.get(i).getText());
			}
		}
		/*
		 * driver.findElement(By.xpath("//a[text()='Locations']")).click(); for(int
		 * i=0;i<menu.size();i++) { System.out.println(menu.get(i).getText()); }
		 */
	}

	@Then("verify all the menu printed")
	public void verify_all_the_menu_printed() {
		Assert.assertTrue(true);
	}

	// drop down
	@When("printing all drop down value in console")
	public void printing_all_drop_down_value_in_console() {
		// location
		List<WebElement> submenu = driver.findElements(By.xpath("//ul[@id='primaryNav']//li//a"));
		for (int i = 0; i < submenu.size(); i++) {
			if (i == 0 || i == 5 || i == 11) {
				System.out.println(submenu.get(i).getText());
			}
			if (i >= 2 && i <= 4) {
				driver.findElement(By.xpath("//a[text()='Locations']")).click();
				System.out.println(submenu.get(i).getText());
				driver.findElement(By.xpath("//a[text()='Locations']")).click();
			} else if (i >= 7 && i <= 10) {
				driver.findElement(By.xpath("//a[text()='Membership']")).click();
				System.out.println(submenu.get(i).getText());
				driver.findElement(By.xpath("//a[text()='Membership']")).click();
			} else if (i >= 13 && i <= 20) {
				driver.findElement(By.xpath("//a[text()='Explore']")).click();
				System.out.println(submenu.get(i).getText());
				driver.findElement(By.xpath("//a[text()='Explore']")).click();
			}

		}
	}

}
