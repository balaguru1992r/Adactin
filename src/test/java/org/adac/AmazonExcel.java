package org.adac;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class AmazonExcel extends BaseClass{
public static void main(String[] args) throws IOException {
	browserLaunch("https://www.amazon.com/");
	WebElement locators = locators("id", "twotabsearchtextbox");
	enterText(locators, "Iphone"+Keys.ENTER);
	List<WebElement> findElements = findElements("//span[@class=\"a-size-medium a-color-base a-text-normal\"]");
	File f=new File("E:\\Guru Java Softwares\\amazontt.xlsx");
	Workbook w=new XSSFWorkbook();
	Sheet createSheet = w.createSheet("iphone");
	for (int i = 0; i < findElements.size(); i++) {
		WebElement webElement = findElements.get(i);
		
		Row createRow = createSheet.createRow(i);
		
		List<WebElement> findElements2 = driver.findElements(By.tagName("td"));
		for (int j = 0; j < findElements2.size(); j++) {
			WebElement webElement2 = findElements2.get(j);
			Cell createCell = createRow.createCell(j);
			String text = webElement2.getText();
			createCell.setCellValue(text);
			
		}
		
	}
	FileOutputStream stream=new FileOutputStream(f);
	w.write(stream);
	
}
}
