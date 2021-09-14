package org.adac;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class BlazedDemo extends BaseClass {
public static void main(String[] args) throws InterruptedException, IOException {
	browserLaunch("https://blazedemo.com/");
	maximize();
	WebElement fromport = locators("name", "fromPort");
	click(fromport);
	dropDownVisibleText(fromport, "Portland");
	
	WebElement toport = locators("name", "toPort");
	click(toport);
	dropDownVisibleText(toport, "Dublin");
	
	WebElement findflights = locators("xpath", "//input[@type='submit']");
	click(findflights);
	
	Thread.sleep(3000);
	WebElement chooseflights = locators("xpath", "(//input[@value='Choose This Flight'])[2]");
	click(chooseflights);
	
	Thread.sleep(3000);
	WebElement name = locators("id", "inputName");
	enterText(name, "Balaguru");
	
	WebElement address = locators("id", "address");
	enterText(address, "No;56, mariamman koil St.,");
	
	WebElement city = locators("id", "city");
	enterText(city, "Veemacoundampalayam");
	
	WebElement state = locators("id", "state");
	enterText(state, "Puducherry");
	
	WebElement zip = locators("id", "zipCode");
	enterText(zip, "605009");
	
	WebElement cardtype = locators("id", "cardType");
	click(cardtype);
	dropDownVisibleText(cardtype, "Visa");
	
	WebElement cardnum = locators("id", "creditCardNumber");
	enterText(cardnum, "6080239894006653");
	
	WebElement month = locators("id", "creditCardMonth");
	enterText(month, "08");
	
	WebElement year = locators("id", "creditCardYear");
	enterText(year, "2022");
	
	WebElement nameoncard = locators("id", "nameOnCard");
	enterText(nameoncard, "BALAGURU");
	
	WebElement purchaseflights = locators("xpath", "//input[@value='Purchase Flight']");
	click(purchaseflights);
	
	screenshot("E:\\Guru Java Softwares\\screenshot\\blazedemo.jpg");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
