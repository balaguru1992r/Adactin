package org.adac;

import org.openqa.selenium.WebElement;

public class Petstore extends BaseClass{
public static void main(String[] args) throws InterruptedException {
	browserLaunch("https://petstore.octoperf.com/actions/Catalog.action");
	WebElement signin = locators("xpath", "//a[text()='Sign In']");
	click(signin);
	
	WebElement username = locators("name", "username");
	enterText(username, "girisharan513");
	
	WebElement password = locators("name", "password");
	enterText(password, "7845751512");
	
	WebElement signon = locators("name", "signon");
	click(signon);
	
	
	
}
}
