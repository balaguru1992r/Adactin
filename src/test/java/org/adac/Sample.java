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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample  {
public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Adactin\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.iplt20.com/points-table/men/2021");
File f=new File("E:\\Guru Java Softwares\\pointstable.xlsx");

Workbook workbook=new XSSFWorkbook();
Sheet createSheet = workbook.createSheet("ipl");
List<WebElement> rows = driver.findElements(By.tagName("tr"));
for (int i = 0; i < rows.size(); i++) {
	WebElement row = rows.get(i);
	Row createRow = createSheet.createRow(i);
	//System.out.println();
	List<WebElement> data = row.findElements(By.tagName("td"));
	for (int j = 0; j < data.size(); j++) {
		WebElement cell = data.get(j);
		String text = cell.getText();
		//System.out.print(text +" ");
		Cell createCell = createRow.createCell(j);
		createCell.setCellValue(text);
	}
	FileOutputStream stream=new FileOutputStream(f);
	workbook.write(stream);
}
}
		
}
		
	
	
	

 

	

	


