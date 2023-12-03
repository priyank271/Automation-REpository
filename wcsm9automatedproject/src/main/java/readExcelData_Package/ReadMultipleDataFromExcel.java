package readExcelData_Package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		//call the whole multiple data by using for loop
		for(int i=1;i<=4;i++)
		{
			//read the multiple data from TestData.xlsx file
			FileInputStream fis = new FileInputStream("./src/main/resources/TestData.xlsx");
			//call the workbookfactory
			Workbook wb = WorkbookFactory.create(fis);
			//make the file ready to read
			Sheet sheet = wb.getSheet("IPL");
			//to read the row
			Row row = sheet.getRow(i);
			//to read the cell/column
			Cell cell = row.getCell(1);
			String data = cell.getStringCellValue();
		    Thread.sleep(2000);
		    System.out.println(data);
		}
		
		

	}

}
