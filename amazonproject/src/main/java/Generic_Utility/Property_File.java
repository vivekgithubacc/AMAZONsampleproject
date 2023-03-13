package Generic_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property_File {

	public String getpropertykeyvalue(String key) throws Throwable 
	{
		FileInputStream fis= new FileInputStream("./src/test/resources/commonamazondata.properties.txt");
		Properties pro=new Properties();
		pro.load(fis);
		String value = pro.getProperty(key);
		return value;
	}
}
