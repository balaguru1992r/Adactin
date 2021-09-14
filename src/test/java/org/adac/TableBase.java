package org.adac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TableBase {
	static WebDriver driver;
	static Select select;
	static JavascriptExecutor js;

	public static void browserLaunch(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Adactin\\driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(url);
	}
	public static String findElements(String rowvalue, String columnvalue) {
		String text;
		 List<WebElement> rows= driver.findElements(By.xpath(rowvalue));
		for (int i = 0; i <rows.size(); i++) {
			WebElement row = rows.get(i);
			List<WebElement> columns = row.findElements(By.xpath(columnvalue));
			for (int j = 0; j < columns.size(); j++) {
				
				WebElement column = columns.get(j);
				return text = column.getAttribute("value");
				
			}
		}
		
}
}
