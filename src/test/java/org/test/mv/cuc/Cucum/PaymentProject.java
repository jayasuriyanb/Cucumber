package org.test.mv.cuc.Cucum;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PaymentProject {
	static WebDriver driver;
	static String text2;
	static String res="";
	static int creditlimit=100;
	static String cardn;
	static String cvvno;
	static String lmt;
	static String date;static String year;
	@Given("User is in guru payment project home page")
	public void user_is_in_guru_payment_project_home_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Cucum\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/payment-gateway/index.php");
		driver.manage().window().maximize();
	}

	@Given("User selecting the quantity and clicking BuyNow")
	public void user_selecting_the_quantity_and_clicking_BuyNow() {
		Select s=new Select(driver.findElement(By.xpath("//select[@name='quantity']")));
		s.selectByValue("3");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@When("user entering card details {string},{string},{string},{string}")
	public void user_entering_card_details(String cardnumber, String expmonth, String expyear, String cvvcode) {
		driver.findElement(By.xpath("//input[@id='card_nmuber']")).sendKeys(cardnumber);
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys(expmonth);
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys(expyear);
		driver.findElement(By.xpath("//input[@id='cvv_code']")).sendKeys(cvvcode);		
	}

	@When("User clicking pay button")
	public void user_clicking_pay_button() {
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@Then("check the payment done successfully")
	public void check_the_payment_done_successfully() {
		Assert.assertEquals("Payment successfull!", driver.findElement(By.xpath("//section[@id='three']//h2")).getText());
	}
	//buy-ends
	//credit
	@Given("User clicking chechk credit card limit")
	public void user_clicking_chechk_credit_card_limit() {
		driver.findElement(By.xpath("//a[text()='Check Credit Card Limit']")).click();
	}

	@When("user entering credit card number {string}")
	public void user_entering_credit_card_number(String cardnum) {
		driver.findElement(By.xpath("//input[@id='card_nmuber']")).sendKeys(cardnum);
	}

	@When("the user clciking submit button")
	public void the_user_clciking_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("user checks the credit balance")
	public void user_checks_the_credit_balance() {
		
		List<WebElement> tr = driver.findElements(By.tagName("tr"));
		for(int i=0;i<tr.size();i++) {
			List<WebElement> amt = tr.get(i).findElements(By.tagName("td"));
			for(int j=0;j<amt.size();j++) {
				String text = amt.get(j).getText();
				if(text.equals("4908951101630852")) {
					 text2 = amt.get(1).getText();
				}	
			}
		}
		for(int i=1;i<text2.length();i++) {
			char ch = text2.charAt(i);
			if(ch!='$') {
				res=res+ch;
			}
		}
		Integer paidamt = Integer.valueOf(res);
		System.out.println(paidamt);
		String balance = driver.findElement(By.xpath("//section[@id='three']//span")).getText();
		System.out.println(balance);
		Integer bal = Integer.valueOf(balance);
		int re=creditlimit-paidamt;
		if(re==bal) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	//generate card details
	@Given("user clicking generate card details")
	public void user_clicking_generate_card_details() {
		driver.findElement(By.xpath("//header//a[text()='Generate Card Number']")).click();
	}

	@When("user taking card details from new window")
	public void user_taking_card_details_from_new_window() throws InterruptedException {
		String parentwin = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		List<String> l=new ArrayList<String>();
		l.addAll(allwin);
		driver.switchTo().window(l.get(1));
		Thread.sleep(4000);
		String cardnum = driver.findElement(By.xpath("//section[@id='three']//h4[1]")).getText();
		System.out.println(cardnum);
		StringTokenizer st=new StringTokenizer(cardnum,"Card Number:-  ");
		Long cardno = Long.parseLong(st.nextToken());
		cardn = String.valueOf(cardno);
		System.out.println(cardno);
		String cvv = driver.findElement(By.xpath("//section[@id='three']//h4[2]")).getText();
		System.out.println(cvv);
		StringTokenizer st1=new StringTokenizer(cvv,"CVV:-  ");
		long cvvnum = Long.parseLong(st1.nextToken());
		cvvno = String.valueOf(cvvnum);
		System.out.println(cvvno);
		String exp = driver.findElement(By.xpath("//section[@id='three']//h4[3]")).getText();
		System.out.println(exp);
		date = exp.substring(6, 8);
		System.out.println(date);
		year = exp.substring(9, 13);
		System.out.println(year);
		String climit = driver.findElement(By.xpath("//section[@id='three']//h4//span")).getText();
		System.out.println(climit);
		StringTokenizer stk=new StringTokenizer(climit,"$");
		double limit = Double.parseDouble(stk.nextToken());
		lmt = String.valueOf(limit);
		System.out.println(lmt);
	}
	@Then("passing the details to cart")
	public void passing_the_details_to_cart() {
		driver.findElement(By.xpath("//header[@id='header']//a[text()='Cart']")).click();
		Select s=new Select(driver.findElement(By.xpath("//select[@name='quantity']")));
		s.selectByValue("3");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//input[@id='card_nmuber']")).sendKeys(cardn);
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys(date);
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys(year);
		driver.findElement(By.xpath("//input[@id='cvv_code']")).sendKeys(cvvno);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}	}
	
