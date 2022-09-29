package excel.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPractice {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(new File("./data/Data.xlsx"));	
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		System.out.println("Total number of Column in Excel sheet is: "+colCount);
		int rowCount = sheet.getLastRowNum() + 1;
		System.out.println("Total number of Row in Excel sheet is: "+rowCount);
		for (int i = 0; i < rowCount; i++) {
			System.out.println(sheet.getRow(i).getCell(0).getStringCellValue());			
		}
		workbook.close();
		fis.close();
	}

}