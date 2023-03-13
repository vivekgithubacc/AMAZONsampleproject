package testcase1;

import java.io.FileInputStream;
import java.io.IOException;
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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Generic_Utility.BaseAmazonClass_File;
import Generic_Utility.Excel_File;
import Generic_Utility.Property_File;
import Generic_Utility.Web_Utility;
import POM_File.Home_Page;
import POM_File.Login_Page;
import POM_File.TVCart_Page;
import POM_File.TVspecification_Page;

public class AddToCartByVariousMethodAndDeleteTest extends BaseAmazonClass_File{
@Test(groups="smoke")
	public void AddToCartByVariousMethodAndDeleteTest() throws Throwable {

		    Web_Utility wlib=new Web_Utility();
		    Home_Page home= new Home_Page(driver);
		    Excel_File elib=new Excel_File();
		    
		    wlib.AMZAwaitForPageToLoad(driver);
		    wlib.AMZAmaximizeScreen(driver); 
				
			home.ClickToDropDownListELECTLink();
		
				
			String AMAZEDATA= elib.getAMAZONExceldata2("productamz", 0, 0);
			home.ClickToTVserachTextBoxLink(AMAZEDATA);
			home.ClickToSubmitButton();
			
			String TVspecification = "LG 139 cm (55 inches) 4K Ultra HD Smart LED TV 55UQ7500PSF (Ceramic Black)";
			String TVprice = "45,990";
				
			driver.findElement(By.xpath("//span[text()='"+TVspecification+"']/ancestor::div[@class='sg-col-inner']/descendant::span[text()='"+TVprice+"']")).click();


			wlib.AMZAswitchToWindow(driver);
			
			TVspecification_Page tvpage= new TVspecification_Page(driver);
			tvpage.ClickTotvspecipageLink();
			tvpage.ClickToTVclosesideSlideLinkLink();
			     
			 Thread.sleep(3000);
			  home.ClickToCartLinkImg();
			   
			   TVCart_Page tvcar= new TVCart_Page(driver);
			    tvcar.ClickToAddtoCartDELETEtvSETUPlink();
			    tvcar.ClickToAddtoCartDELETEtvlink();
			         
	}

}
