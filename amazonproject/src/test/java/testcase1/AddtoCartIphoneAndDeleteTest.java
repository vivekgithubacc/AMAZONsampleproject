package testcase1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Utility.BaseAmazonClass_File;
import Generic_Utility.Excel_File;
import Generic_Utility.Property_File;
import Generic_Utility.Web_Utility;
import POM_File.Home_Page;
import POM_File.Login_Page;
import POM_File.MobileCart_Page;
import POM_File.MobileSpecification_Page;

public class AddtoCartIphoneAndDeleteTest extends BaseAmazonClass_File {
//@Test(retryAnalyzer=Generic_Utility.RetryIMPamzClass.class)
	@Test
	    public void AddtoCartIphoneAndDeleteTest() throws Throwable {

	        Home_Page home= new Home_Page(driver); 
	        Property_File plib= new Property_File();
		    Web_Utility wlib= new Web_Utility();
	
		    wlib.AMZAwaitForPageToLoad(driver);
		    wlib.AMZAmaximizeScreen(driver);
	
			 home.ClickToSearchTextBox(driver);
			 home.ClickToSearchTextBoxData("iphone 13 pro max");	
			 home.ClickToSubmitButton();
				
			 String mobilespecification = "Apple iPhone 14 Pro Max (512 GB) - Space Black";
			 String price = "1,69,900";
				
			 driver.findElement(By.xpath("//span[text()='"+mobilespecification+"']/ancestor::div[@class='sg-col-inner']/descendant::span[text()='"+price+"']")).click();
				
			  wlib.AMZAswitchToWindow(driver);
			  MobileSpecification_Page RMpage= new MobileSpecification_Page(driver);
			  RMpage.ClickToAddtoCartMOBILElink();
			  RMpage.ClickToCloseTheSideWindow();
			
		        Thread.sleep(3000);
		        home.ClickToCartLinkImg();
		    
		        MobileCart_Page delMpage= new MobileCart_Page(driver);
		        delMpage.ClickToAddtoCartDELETEMOBILElink();
     
	}
}
