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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Generic_Utility.BaseAmazonClass_File;
import Generic_Utility.Excel_File;
import Generic_Utility.Property_File;
import Generic_Utility.Web_Utility;
import POM_File.Home_Page;
import POM_File.LaptopACC_File;
import POM_File.Login_Page;
import POM_File.PendriveCart_File;
import POM_File.PendriveSpeci_File;

public class AddToCartByVariousMethodAndDelete2Test extends BaseAmazonClass_File{
@Test(groups="regression")
	public  void AddToCartByVariousMethodAndDelete2Test() throws Throwable {

		     Web_Utility wlib= new Web_Utility();
		     Home_Page home=new Home_Page(driver);
			 Excel_File elib=new Excel_File();
			   
		     wlib.AMZAwaitForPageToLoad(driver);
	         wlib.AMZAmaximizeScreen(driver);
	        
			 home.ClickToMobileLinkText();
			
			 LaptopACC_File acc=new LaptopACC_File(driver);
			 acc.ClickToLaptopandACCpageLink(driver);
	
		
			 String AMAZONEDATA = elib.getAMAZONExceldata1("amazproduct", 0, 0);
			   
			 driver.findElement(By.xpath("//a[text()='"+AMAZONEDATA+"']")).click();
             String PENDRIVE = "SanDisk Cruzer Blade 64GB USB 2.0 Flash Drive";
			 driver.findElement(By.xpath("//span[text()='"+PENDRIVE+"']")).click();
				
			 wlib.AMZAswitchToWindow(driver);
			 PendriveSpeci_File  ppage= new PendriveSpeci_File(driver);
			 ppage.ClickToPENDRIVEspecipageLink();
		
			  Thread.sleep(3000);
			  home.ClickToCartLinkImg();
			  driver.findElement(By.id("nav-cart")).click();
			       
			   PendriveCart_File PEN=new PendriveCart_File(driver);
			   PEN.ClickToAddtoCartDELETEPRNDRIVElink();
				
	}

}
