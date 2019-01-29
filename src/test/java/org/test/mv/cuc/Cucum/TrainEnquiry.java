package org.test.mv.cuc.Cucum;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TrainEnquiry {
	static WebDriver driver;
	@Given("The user is in home page")
	public void the_user_is_in_home_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Cucu\\Cucumber\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://enquiry.indianrail.gov.in/ntes/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
	}

	@Given("User navigating to train b\\/w station")
	public void user_navigating_to_train_b_w_station() {
		WebElement findElement = driver.findElement(By.xpath("(//a[@class='ui-tabs-anchor'])[3]"));
		FluentWait<WebDriver> f=new FluentWait<WebDriver>(driver).withTimeout(100, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS);
		WebElement until = f.until(ExpectedConditions.elementToBeClickable(findElement));
		until.click();

	}

	@When("User entering from, to and searching")
	public void user_entering_from_to_and_searching() {
		driver.findElement(By.xpath("//input[@id='station1']")).sendKeys("chennai");
		driver.findElement(By.xpath("//a[text()='CHENNAI CENTRAL']")).click();
		driver.findElement(By.xpath("//input[@id='station2']")).sendKeys("coim");
		driver.findElement(By.xpath("(//a[text()='COIMBATORE JN'])[1]")).click();
		
		List<WebElement> tableRow = driver.findElements(By.xpath("//table[@style=\"margin-top:2px;\"]//tr"));
		bb:
		for(int i=0;i<tableRow.size();i++) {
			List<WebElement> tableData = tableRow.get(i).findElements(By.tagName("td"));
			for(int j=0;j<tableData.size();j++) {
				String text = tableData.get(j).getText();	
				if(text.equals("22637")) {
					System.out.println(text);
					tableData.get(j).click(); 
					break bb;
				}
			}
		}
	}

	@Then("Verify the correct train is visiable")
	public void verify_the_correct_train_is_visiable() {
		WebElement locator = driver.findElement(By.xpath("span[class=trnInputLabel]"));
		FluentWait<WebDriver> fluent=new FluentWait<WebDriver>(driver).withTimeout(100, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS);
		fluent.until(ExpectedConditions.visibilityOf(locator));
		Assert.assertEquals("Schedule of train 22637 (WEST COAST EXP) ",locator.getText());
 	}

}
