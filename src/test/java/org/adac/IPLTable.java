package org.adac;

import java.io.File;
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

public class IPLTable extends BaseClass{
	public static void main(String[] args) throws IOException {
		browserLaunch("https://www.iplt20.com/points-table/men/2021");
		
		List<WebElement> findElements = driver.findElements(By.tagName("tr"));
		File f=new File("E:\\Guru Java Softwares\\amazontt.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet createSheet = w.createSheet("ipl");
		for (int i = 0; i < findElements.size(); i++) {
			WebElement webElement = findElements.get(i);
			Row createRow = createSheet.createRow(i);
			
				
			

				
			
			Cell createCell = createRow.createCell(0);
			String text = webElement.getText();
			createCell.setCellValue(text);
			
		}
		FileOutputStream stream=new FileOutputStream(f);
		w.write(stream);
		
}
}
