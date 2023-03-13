package testcase4;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Generic_Utility.BaseAmazonClass_File;
import Generic_Utility.Excel_File;
import Generic_Utility.Property_File;
import Generic_Utility.Web_Utility;
import POM_File.Home_Page;
import POM_File.LaptopACC_File;
import POM_File.MobileCart_Page;
import POM_File.MobileSpecification_Page;
import POM_File.PendriveCart_File;
import POM_File.PendriveSpeci_File;
import POM_File.TVCart_Page;
import POM_File.TVspecification_Page;

public class AddToCartRegionalRegression extends BaseAmazonClass_File{
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
	
				String mobilespecification = "Apple iPhone 14 Pro Max 128GB Deep Purple";
				String price = "1,27,999";
				
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
    @Test
	public void AddToCartByVariousMethodAndDeleteTest() throws Throwable {
		Web_Utility wlib=new Web_Utility();
		wlib.AMZAwaitForPageToLoad(driver);
				wlib.AMZAmaximizeScreen(driver); 
				Home_Page home= new Home_Page(driver);
				home.ClickToDropDownListELECTLink();
				Excel_File elib=new Excel_File();
				String AMAZEDATA= elib.getAMAZONExceldata2("productamz", 0, 0);
				home.ClickToTVserachTextBoxLink(AMAZEDATA);
				home.ClickToSubmitButton();
				
				String TVspecification = "VU 139 cm (55 inches) The GloLED Series 4K Smart LED Google TV 55GloLED (Grey)";
				String TVprice = "38,999";
				
				driver.findElement(By.xpath("//span[text()='"+TVspecification+"']/ancestor::div[@class='sg-col-inner']/descendant::span[text()='"+TVprice+"']")).click();

			//	wlib.AMZAswitchToWindow(driver);
				 Set<String> allId = driver.getWindowHandles();
				 Iterator<String> it = allId.iterator();
				 while(it.hasNext())
				 {
					 String wid = it.next();	
					 driver.switchTo().window(wid);
					String title = driver.getTitle();
					if(title.contains("keywords=lg+tv&qid"))
					{
						break;
					}
					 
					 }
				TVspecification_Page tvpage= new TVspecification_Page(driver);
				tvpage.ClickTotvspecipageLink();
				tvpage.ClickToTVclosesideSlideLinkLink();
			        Thread.sleep(3000);
			        home.ClickToCartLinkImg();
			        TVCart_Page tvcar= new TVCart_Page(driver);
			        tvcar.ClickToAddtoCartDELETEtvSETUPlink();
			         tvcar.ClickToAddtoCartDELETEtvlink();
	}

    @Test
	public  void AddToCartByVariousMethodAndDelete2Test() throws Throwable {

		Web_Utility wlib= new Web_Utility();
		wlib.AMZAwaitForPageToLoad(driver);
		Home_Page home=new Home_Page(driver);
		
				wlib.AMZAmaximizeScreen(driver);
	
				home.ClickToMobileLinkText();
			    LaptopACC_File acc=new LaptopACC_File(driver);
				acc.ClickToLaptopandACCpageLink(driver);

			   Excel_File elib=new Excel_File();
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
