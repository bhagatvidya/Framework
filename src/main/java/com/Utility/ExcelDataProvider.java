package com.Utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;

	public ExcelDataProvider() throws Exception {
		String filepath="C:\\Users\\vidya\\eclipse-workspace\\Framework\\TestData\\Data.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		wb=new XSSFWorkbook(fis);
		
	}
	public String getStringData(String Sheetname,int row,int cell)
	{
		return wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
}
