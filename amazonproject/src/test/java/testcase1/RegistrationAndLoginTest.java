package testcase1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic_Utility.BaseAmazonClass_File;
import Generic_Utility.Property_File;
import Generic_Utility.Web_Utility;
import POM_File.Home_Page;
import POM_File.Login_Page;
import POM_File.Registration_Page;

public class RegistrationAndLoginTest extends  BaseAmazonClass_File{
@Test
	public void RegistrationAndLoginTest() throws Throwable {

	  Property_File plib=new Property_File();
		 Web_Utility wlib= new Web_Utility();
		 wlib.AMZAwaitForPageToLoad(driver);
		 
		String URL = plib.getpropertykeyvalue("url");
		driver.get(URL);
		wlib.AMZAmaximizeScreen(driver);
	
		 driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Create your Amazon account')]")).click();
		
		  String USERNAME = plib.getpropertykeyvalue("username");
		  String MOBILE = plib.getpropertykeyvalue("mobile");
		  String GMAIL = plib.getpropertykeyvalue("gmail");
		   String PASSWORD = plib.getpropertykeyvalue("password");
		 
		   Registration_Page rpage= new Registration_Page(driver);
           rpage.ClickToRegistrationTextField(USERNAME, GMAIL, PASSWORD);
		  
	}
}
