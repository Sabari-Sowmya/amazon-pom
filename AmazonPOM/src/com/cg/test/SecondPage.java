package com.cg.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondPage {

	@FindBy(xpath="//*[@id=\\\"twotabsearchtextbox\\\"]")
	 WebElement searchprd1;
	
	@FindBy(xpath="//*[@id=\\\"nav-search\\\"]/form/div[2]/div/input")
	 WebElement searchbutton1;
	
	@FindBy(xpath="//*[@id=\\\"result_0\\\"]/div/div[2]/div/a/img")
	 WebElement product1;
	
	@FindBy(xpath="//*[@id=\\\"add-to-cart-button\\\"]")
	 WebElement cart1;
	
	@FindBy(xpath="//*[@id=\\\"twotabsearchtextbox\\\"]")
	 WebElement searchprd2;
	
	@FindBy(xpath="//*[@id=\\\"nav-search\\\"]/form/div[2]/div/input")
	 WebElement searchbutton2;
	
	@FindBy(xpath="//*[@id=\\\"result_4\\\"]/div/div[2]/div/a/img")
	 WebElement product2;
	
	@FindBy(xpath="//*[@id=\\\"add-to-cart-button\\\"]")
	 WebElement cart2;
}
