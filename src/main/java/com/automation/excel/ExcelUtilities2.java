package com.automation.excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.automation.utilities.Utilities;

public class ExcelUtilities2 {

/*	private ExcelParser excelWorkBook;
	
	

	public ExcelUtilities2(ExcelParser workbook) {
		this.excelWorkBook = workbook;
		getWorkBook();
	}

	private Workbook getWorkBook() {
		return excelWorkBook.getWorkbook();
	}
	
//	private boolean isSheetExists(String filePath,String sheetName) throws IOException {
//
//		Sheet sheet = workBook.getSheet(sheetName);
//		Iterator<Sheet> sheetIterator = workBook.iterator();
//		boolean foundSheet = false;
//		while (sheetIterator.hasNext()) {
//			Sheet validSheet = sheetIterator.next();
//			if (validSheet.equals(sheet)) {
//				foundSheet = true;
//				break;
//			}
//		}
//		return foundSheet;
//	}

	public String getValue(String filePath, String sheetName, String column, String testCaseName)
			throws IOException {
		
		excelWorkBook.getExcelSheet(sheetName);
		boolean sheetExists = Utilities.isSheetExists(workBook, sheetName);
		if (sheetExists) {
			String specificData = null;
			
			Sheet sheet = workBook.getSheet(sheetName);
			int lastRowNumber = sheet.getLastRowNum();
			Row columnData = sheet.getRow(0);
			for (int j = 0; j <= lastRowNumber; j++) {
				Row testCasesRow = sheet.getRow(j);
				String y = testCasesRow.getCell(0).getStringCellValue();
				System.out.println(y);
				if (testCasesRow.getCell(0).getStringCellValue().equals(testCaseName)) {
					for (int i = 1; i < columnData.getLastCellNum(); i++) {
						System.out.println("no of cells in row" + columnData.getLastCellNum());
						String x = columnData.getCell(i).getStringCellValue();
						if (columnData.getCell(i).getStringCellValue().equals(column)) {
							DataFormatter formatter = new DataFormatter();
							specificData = formatter.formatCellValue(testCasesRow.getCell(i));
							return specificData;
						}
					}
				}
			}
		}
		return null;
	}

	public HashMap<String,HashMap<String,String>> getAllTestCasesData(String filePath, String sheetName) throws IOException {
		
		HashMap<String, HashMap<String, String>> allTestData = new HashMap<String, HashMap<String, String>>();
		boolean sheetExists = Utilities.isSheetExists(workBook, sheetName);
		if (sheetExists) {
			String specificData = null;
			Sheet sheet = workBook.getSheet(sheetName);
			int lastRowNumber = sheet.getLastRowNum();
			Row columnData = sheet.getRow(0);
			for (int j = 1; j <= lastRowNumber; j++) {
				Row testCasesRow = sheet.getRow(j);
				String y = testCasesRow.getCell(0).getStringCellValue();
				System.out.println(y);
				HashMap<String, String> myMap = new HashMap<String, String>();
				for (int i = 1; i < columnData.getLastCellNum(); i++) {
					System.out.println("no of cells in row" + columnData.getLastCellNum());
					String x = columnData.getCell(i).getStringCellValue();
					String a = columnData.getCell(i).getStringCellValue();
					System.out.println("a= " + a + " x=" + x);
					DataFormatter formatter = new DataFormatter();
					specificData = formatter.formatCellValue(testCasesRow.getCell(i));
					System.out.println(specificData);
					myMap.put(x, specificData);
				}
				allTestData.put(testCasesRow.getCell(0).getStringCellValue(), myMap);
			}
			return allTestData;
		}
		return null;
	}

	public ArrayList<String> getAllTestDataInList(String filePath, String sheetName, String testCaseName)
			throws IOException {

		ArrayList<String> data = new ArrayList<String>();
		boolean sheetExists = Utilities.isSheetExists(workBook, sheetName);
		if (sheetExists) {
			String specificData = null;
			Sheet sheet = workBook.getSheet(sheetName);
			int lastRowNumber = sheet.getLastRowNum();
			Row columnData = sheet.getRow(0);
			for (int j = 0; j <= lastRowNumber; j++) {
				Row testCasesRow = sheet.getRow(j);
				String y = testCasesRow.getCell(0).getStringCellValue();
				System.out.println(y);

				if (testCasesRow.getCell(0).getStringCellValue().equals(testCaseName)) {
					for (int i = 1; i < columnData.getLastCellNum(); i++) {
						System.out.println("no of cells in row" + columnData.getLastCellNum());
						String x = columnData.getCell(i).getStringCellValue();
						String a = columnData.getCell(i).getStringCellValue();
						DataFormatter formatter = new DataFormatter();
						specificData = formatter.formatCellValue(testCasesRow.getCell(i));
						System.out.println("a= " + a + " x=" + x);
						data.add(specificData);
					}
					return data;
				}
			}
		}

		return null;
	}

	public HashMap<String, String> getTestCaseData(String filePath, String sheetName, String testCaseName)
			throws IOException {
		HashMap<String, String> map = new HashMap<String, String>();
		// ArrayList<String> testCaseData = new ArrayList<String>();
		boolean sheetExists = Utilities.isSheetExists(workBook, sheetName);
		if (sheetExists) {
			String specificData = null;
			Sheet sheet = workBook.getSheet(sheetName);
			int lastRowNumber = sheet.getLastRowNum();
			Row columnData = sheet.getRow(0);
			for (int j = 0; j <= lastRowNumber; j++) {
				Row testCasesRow = sheet.getRow(j);
				String y = testCasesRow.getCell(0).getStringCellValue();
				System.out.println(y);

				if (testCasesRow.getCell(0).getStringCellValue().equals(testCaseName)) {
					for (int i = 1; i < columnData.getLastCellNum(); i++) {
						System.out.println("no of cells in row" + columnData.getLastCellNum());
						String x = columnData.getCell(i).getStringCellValue();
						String a = columnData.getCell(i).getStringCellValue();
						DataFormatter formatter = new DataFormatter();
						specificData = formatter.formatCellValue(testCasesRow.getCell(i));
						System.out.println("a= " + a + " x=" + x);
						map.put(x, specificData);
					}
					return map;
				}
			}
		}
		return null;
	}
	*/
}
