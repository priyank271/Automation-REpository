package readExcelData_Package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		//read the multiple data from TestData.xlsx file
				//provide the path of excel file
				FileInputStream fis = new FileInputStream("./src/main/resources/TestData.xlsx");
				//call the workbookfactory
				//to make the file ready to read
				Workbook wb = WorkbookFactory.create(fis);
				//make the file ready to read
				Sheet sheet = wb.getSheet("IPL");//tp get into perticular sheet
				int rc = sheet.getLastRowNum();//to get the no. of rows
				for(int i=1;i<=rc;i++)
				{
					//read the multiple data from TestData.xlsx file
					FileInputStream fis1 = new FileInputStream("./src/main/resources/TestData.xlsx");
					//call the workbookfactory
					Workbook wb1 = WorkbookFactory.create(fis1);
					//make the file ready to read
					Sheet sheet1 = wb1.getSheet("IPL");
					//to read the row
					Row row1 = sheet1.getRow(i);//to get into perticular row
					//to read the cell/column
					Cell cell1 = row1.getCell(1);//to get into perticular column
					String data = cell1.getStringCellValue();//to read specific data from a perticular cell
				    Thread.sleep(2000);
				    System.out.println(data);
				}

	}

	
}
