package readExcelData_Package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToSeeRowCont {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//read the multiple data from TestData.xlsx file
		//provide the path of excel file
		FileInputStream fis = new FileInputStream("./src/main/resources/TestData.xlsx");
		//call the workbookfactory
		//to make the file ready to read
		Workbook wb = WorkbookFactory.create(fis);
		//make the file ready to read
		Sheet sheet = wb.getSheet("IPL");//tp get into perticular sheet
		int rc = sheet.getLastRowNum();//to get the no. of rows
		System.out.println(rc);

	}

}
