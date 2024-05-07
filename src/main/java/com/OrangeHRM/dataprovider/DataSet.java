package com.OrangeHRM.dataprovider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.OrangeHRM.base.TestBase;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataSet extends TestBase{
	
	
	 String filepath=System.getProperty("user.dir")+"\\src\\main\\resources\\TestData\\EmpDetail.xlsx";

	
	@DataProvider(name = "testData")
	
	public String[][] getExcelData() {
		
		
//		String[][] data = new String[1][3];
//        FileInputStream fis = new FileInputStream(filePath);
//        XSSFWorkbook workbook = new XSSFWorkbook(fis);
//        XSSFSheet sheet = workbook.getSheet("Sheet1");
//        XSSFRow row;
//		  XSSFCell cell;
        
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rw=sheet.getPhysicalNumberOfRows();
		System.out.print(rw);
		XSSFRow row;
		XSSFCell cell;
		

		String[][] data = new String[1][22];
		
		for(int i=0; i<1; i++)
		{
			for(int j=0; j<22; j++)
			{
				row = sheet.getRow(1);
				cell = row.getCell(j);
				data[i][j] = cell.getStringCellValue();
			}
		}
		System.out.print(data);
		return data;
		
	}
}