package org.adac;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
public static void main(String[] args) {
	File f=new File("E:\\Guru Java Softwares\\New folder\\write.xlsx");
	Workbook w=new XSSFWorkbook();
	Sheet createSheet = w.createSheet("abcd");
	Row createRow = createSheet.createRow(4);
	for (int i = 0; i < 4; i++) {
		Cell createCell = createRow.createCell(4);
		for (int j = 0; j < 4; j++) {
			createCell.setCellType();
			
		}
		
	}
	
}
}