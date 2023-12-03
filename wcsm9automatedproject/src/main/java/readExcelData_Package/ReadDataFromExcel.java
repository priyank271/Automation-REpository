package readExcelData_Package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//read the data from TestData.xlsx file
		FileInputStream fis = new FileInputStream("./src/main/resources/TestData.xlsx");
		//call the class workbookfactory
		Workbook wb = WorkbookFactory.create(fis);
		//make the file ready to read
		Sheet sheet = wb.getSheet("IPL");
		//to read the row
		Row row = sheet.getRow(3);
		//to read the cell/column
		Cell cell = row.getCell(1);
		String data = cell.getStringCellValue();
		System.out.println(data);
		
		}

}
