package dataDriverFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	//non static method
	public String readExcelData(String excelPath, String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb1 = WorkbookFactory.create(fis);
		Sheet sheet1 = wb1.getSheet(sheetName);
		//to read the row
		Row row1 = sheet1.getRow(rowNo);//to get into perticular row
		//to read the cell/column
		Cell cell1 = row1.getCell(cellNo);//to get into perticular column
		String data = cell1.getStringCellValue();//to read specific data from a perticular cell

		return data;

	}

}
