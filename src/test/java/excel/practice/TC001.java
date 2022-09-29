package excel.practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TC001 {

	public static void main(String[] args) throws IOException {	
		FileInputStream fis = new FileInputStream("./data/Credentials.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Login");
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		System.out.println("Total Number of columns in the sheet is: "+colCount);
		int rowCount = sheet.getLastRowNum() + 1;
		System.out.println("Total Number of rows in the sheet is: "+rowCount);
		for (int i = 1; i < rowCount; i++) {
			row = sheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				System.out.print(row.getCell(j).getStringCellValue()+" | ");
			}
			System.out.println();
		}
		workbook.close();
		fis.close();
	}

}
