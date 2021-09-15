package org.adac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {
public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Adactin\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");
        WebElement findElement = driver.findElement(By.tagName("(a)"));
        findElement.click();
        
        
        System.out.println("123");
        System.out.println("1233");
        
}
}
