package com.data_driven_framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Excel {
	
	public static void main(String[] args) throws IOException {
		
		
		File F = new File("E:\\Tutorial\\Project\\DataDriven\\Data.xlsx");
		FileInputStream fis =new FileInputStream(F);
		
		Workbook wb = new XSSFWorkbook();
		 org.apache.poi.ss.usermodel.Sheet createSheet = wb.createSheet("Data");
		 Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Name");
		Cell createCell1 = createRow.createCell(1);
		createCell1.setCellValue("Score");
		wb.getSheet("Data").createRow(1);
		wb.getSheet("Data").createRow(2);
		wb.getSheet("Data").createRow(3);
		wb.getSheet("Data").createRow(4);
		
		wb.getSheet("Data").getRow(1).createCell(0).setCellValue("Raj");
		wb.getSheet("Data").getRow(1).createCell(1).setCellValue("90%");
		wb.getSheet("Data").getRow(2).createCell(0).setCellValue("santhosh");
		wb.getSheet("Data").getRow(2).createCell(1).setCellValue("75%");
		wb.getSheet("Data").getRow(3).createCell(0).setCellValue("Ganesh");
		wb.getSheet("Data").getRow(3).createCell(1).setCellValue("85%");
		
		wb.getSheet("Data").getRow(4).createCell(0).setCellValue("gokul");
		wb.getSheet("Data").getRow(4).createCell(1).setCellValue("55%");
		
		FileOutputStream fos = new FileOutputStream(F);
		wb.write(fos);
		System.out.println("Inserted");
				
		

		
	}

}
