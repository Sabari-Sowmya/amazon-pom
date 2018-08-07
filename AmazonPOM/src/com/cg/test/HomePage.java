package com.cg.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	 WebElement searchprd;
	
	@FindBy(xpath="//*[@id=\"nav-search\"]/form/div[2]/div/input")
	 WebElement searchbutton;
	
	@FindBy(xpath="//*[@id=\"result_1\"]/div/div[2]/div/a/img")
	 WebElement product;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	 WebElement cart;
}
