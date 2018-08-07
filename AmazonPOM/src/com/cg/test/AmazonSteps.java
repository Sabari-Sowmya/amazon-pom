package com.cg.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;

public class AmazonSteps {

	WebDriver driver = null;
	HomePage homepage;

	@Given("^User visits amazon page$")
	public void user_visits_amazon_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "D:\\Sabari\\chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		homepage = PageFactory.initElements(driver, HomePage.class);
	}

	@Given("^user searches for product$")
	public void user_searches_for_product() throws Throwable {

		homepage.searchprd.sendKeys("watches for womens latest");
		homepage.searchbutton.click();
	}

	@Given("^the user selects the product$")
	public void the_user_selects_the_product() throws Throwable {

		homepage.product.click();

	}

	@Given("^the user adds the product to cart$")
	public void the_user_adds_the_product_to_cart() throws Throwable {

		homepage.cart.click();
	}

	@Given("^the user searches for another product and select it and adds to cart$")
	public void the_user_searches_for_another_product_and_select_it_and_adds_to_cart() throws Throwable {

		WebElement searchprd1 = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		searchprd1.sendKeys("lap watch sport");

		WebElement searchbutton1 = driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input"));
		searchbutton1.click();

		WebElement product1 = driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div[2]/div/a/img"));
		product1.click();

		WebElement cart1 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		cart1.click();

		WebElement searchprd2 = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		searchprd2.sendKeys("handbags for womens stylish");

		WebElement searchbutton2 = driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input"));
		searchbutton2.click();

		WebElement product2 = driver.findElement(By.xpath("//*[@id=\"result_4\"]/div/div[2]/div/a/img"));
		product2.click();

		String winhandleBefore = driver.getWindowHandle();
		for (String winhandle : driver.getWindowHandles()) {
			driver.switchTo().window(winhandle);
		}

		WebElement cart2 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		cart2.click();
	}

	@Given("^the user searches for mobile sling bag$")
	public void the_user_searches_for_mobile_sling_bag() throws Throwable {

		WebElement searchprd3 = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		searchprd3.sendKeys("mobile sling bag");

		WebElement searchbutton3 = driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input"));
		searchbutton3.click();

		WebElement product3 = driver.findElement(By.xpath("//*[@id=\"result_8\"]/div/div[2]/div/a/img"));
		product3.click();

		String winhandleBefore = driver.getWindowHandle();
		for (String winhandle : driver.getWindowHandles()) {
			driver.switchTo().window(winhandle);
		}

		WebElement cart3 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		cart3.click();
	}

	@Given("^the user searches for car perfumes$")
	public void the_user_searches_for_car_perfumes() throws Throwable {

		WebElement searchprd4 = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		searchprd4.sendKeys("car perfumes");

		WebElement searchbutton4 = driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input"));
		searchbutton4.click();

		WebElement product4 = driver.findElement(By.xpath("//*[@id=\"result_5\"]/div/div[2]/div/div/a/img"));
		product4.click();

		String winhandleBefore = driver.getWindowHandle();
		for (String winhandle : driver.getWindowHandles()) {
			driver.switchTo().window(winhandle);
		}

		WebElement cart4 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		cart4.click();
	}

	@Given("^the user proceed to payment$")
	public void the_user_proceed_to_payment() throws Throwable {
		WebElement payment = driver.findElement(By.xpath("//*[@id=\"hlb-ptc-btn-native\"]"));
		payment.click();
	}

}
