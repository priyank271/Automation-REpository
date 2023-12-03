package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
		//create the obj of properties class
		Properties prop = new Properties();
		prop.load(fis);
		//pass the key as username
		String data = prop.getProperty("browser");
		System.out.println(data);
		
	}

}
