package readExcelData_Package;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {

	public String writeExcelData(String excelPath, String sheetName, int rowNo, int cellNo, String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelPath);//provide the path of excel file
		Workbook wb1 = WorkbookFactory.create(fis);//make the file ready to read
		Sheet sheet1 = wb1.getSheet(sheetName);//get into the sheet
		//to read the row
		Row row1 = sheet1.getRow(rowNo);//to get into perticular row
		Cell cell1 = row1.createCell(cellNo);//create the desired cell
		cell1.setCellValue(data);//enter the data in the created cell
		
		FileOutputStream fos = new FileOutputStream(excelPath);//provide the path of excel file
		wb1.write(fos);//write the data in the excel file
		return data;
		
		
	}
	public int rowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelPath);//provide the path of excel file
		Workbook wb = WorkbookFactory.create(fis);//make the file ready to read
		Sheet sheet = wb.getSheet(sheetName);//get into the sheet
		int rc = sheet.getLastRowNum();//get the no. of rows present in the sheet
		return rc;
		
	}

}
