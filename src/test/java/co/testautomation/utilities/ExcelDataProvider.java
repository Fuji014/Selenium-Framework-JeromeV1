package co.testautomation.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook wb;

	public ExcelDataProvider() {

		File src = new File("./TestData/TestData.xlsx");

		try {
			FileInputStream fileInputStream = new FileInputStream(src);

			wb = new XSSFWorkbook(fileInputStream);
		} catch (Exception e) {
			System.out.println("Unable to read Excel File " + e.getMessage());
		}
	}

	public String getStringData(int sheetIndex, int row, int column) {
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	}

	public String getStringData(String sheetName, int row, int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}

	public double getNumericData(String sheetName, int row, int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}
	
	public int getIntNumericData(String sheetName, int row, int column) {
		double result = wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
		int convertedToInt = (int) Math.round(result);
		return convertedToInt;
	}
}
