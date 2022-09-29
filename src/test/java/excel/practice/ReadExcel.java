package excel.practice;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static Object[][] getTestData(String fileName, String sheetName) {	
		Object[][] data = null;		
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook("./data/"+fileName+".xlsx");
			XSSFSheet sheet = workbook.getSheet(sheetName);					
			data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			for (int i = 1; i <= sheet.getLastRowNum(); i++) {			
				for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {				
					data[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
				}			
			}
			workbook.close();
		} catch (IOException e) {			
			e.printStackTrace();
		}		
		return data;		
	}

}
