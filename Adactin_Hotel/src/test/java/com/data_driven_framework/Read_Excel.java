package com.data_driven_framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel {
	
	public static void main(String[] args) throws IOException {
		
		
		File F = new File("E:\\Tutorial\\Project\\DataDriven\\Data.xlsx");
		FileInputStream Fis = new FileInputStream(F);
		
		Workbook wb = new XSSFWorkbook(Fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(0);
		Cell cell = row.getCell(1);;
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(cellType.STRING)) {
			
			
			String stringCellValue = cell.getStringCellValue();
			System.out.println("string:" + stringCellValue);
			
			
		}
		else if (cellType.equals(cellType.NUMERIC)) {
			
			double numericCellValue = cell.getNumericCellValue();
			System.out.println("number" +numericCellValue);
			
		}
	//all data
	
		 int size = sheetAt.getPhysicalNumberOfRows();
		 //System.out.println(size);
		 
		for (int i = 0; i < size; i++) {
			
			Row row2 = sheetAt.getRow(i);
			int cellcount = row2.getPhysicalNumberOfCells();
			
			for (int j = 0; j < cellcount; j++) {
				
				Cell cell2 = row2.getCell(j);
			String str =	 cell2.getStringCellValue();
				System.out.println(str);
				
				
			}
		}
		
	}
	

}
