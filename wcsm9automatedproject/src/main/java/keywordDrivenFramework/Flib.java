package keywordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
		//non static method
		//1st method to read the data from excel
		public String readExcelData(String excelPath, String sheetName, int rowCount, int cellCount) throws EncryptedDocumentException, IOException {
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);
			//to read the row
			Row row = sheet.getRow(rowCount);//to get into perticular row
			//to read the cell/column
			Cell cell = row.getCell(cellCount);//to get into perticular column
			//to get only string data
			//String data = cell.getStringCellValue();//to read specific data from a perticular cell
			String data = null;
			if (cell.getStringCellValue().equals(cell.getCellType().STRING))
			{
				data=cell.getStringCellValue();
			}
			else if(cell.getCellType()==cell.getCellType().NUMERIC)
			{
				data=cell.getStringCellValue().valueOf(cell.getNumericCellValue());
			}	
			return data;

		}
		//2nd method to write the data into the excel
		public void writeDataToExcel(String excelPath,String sheetName,int cellCount,int rowCount,String data) throws EncryptedDocumentException, IOException {
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);
			Row row = sheet.createRow(rowCount);
			Cell cell = row.createCell(cellCount);
			cell.setCellValue(data);
			
			FileOutputStream fos = new FileOutputStream(excelPath);
			wb.write(fos);
		}
		//3rd method to count row count
		public int rowCount (String excelPath,String sheetName) throws EncryptedDocumentException, IOException {
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);
			int rc = sheet.getLastRowNum();
			return rc;
		}
		//4th method to read data from propertirs file
		public String readDataFromProperty(String propPath,String key) throws IOException {
			FileInputStream fis = new FileInputStream(propPath);
			Properties prop = new Properties();
			prop.load(fis);
			String data = prop.getProperty(key);
			return data;
			
			
		}
		

	}



