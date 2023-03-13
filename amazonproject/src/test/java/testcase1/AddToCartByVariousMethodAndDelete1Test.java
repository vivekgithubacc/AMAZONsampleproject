package testcase1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Generic_Utility.BaseAmazonClass_File;
import Generic_Utility.Property_File;
import Generic_Utility.Web_Utility;
import POM_File.BestSellerMen_File;
import POM_File.BestSeller_Page;
import POM_File.Home_Page;
import POM_File.Login_Page;
import POM_File.MANYSandalANDFloater_Page;
import POM_File.SandalAndFloater_Page;
import POM_File.SandalCart_Page;
import POM_File.SandalSpecification_Page;

public class AddToCartByVariousMethodAndDelete1Test extends BaseAmazonClass_File{
@Test(groups="regression")
	public void AddToCartByVariousMethodAndDelete1Test() throws Throwable {

		  Web_Utility wlib= new Web_Utility();
		  Home_Page home=new Home_Page(driver);
		  
		  wlib.AMZAwaitForPageToLoad(driver);
		  wlib.AMZAmaximizeScreen(driver);
         
          home.ClickToBestSellerTEXTLink();
			
		   BestSeller_Page bPpage= new BestSeller_Page(driver);
		   bPpage.ClickToclothandAccessoriesLink();
			
		    BestSellerMen_File MENPAGE=new BestSellerMen_File(driver);
		    MENPAGE.ClickToclothandAccessoriesMENLink();
		     
	
		    MENPAGE.ClickToShoesLinkText();
			
		    SandalAndFloater_Page sandal=new SandalAndFloater_Page(driver);
		    sandal.ClickToSandalAndFloaterTextLink();
			
		    MANYSandalANDFloater_Page many=new MANYSandalANDFloater_Page(driver);
		    many.ClickToMANYSandalANDFloaterLink();
	
		     SandalSpecification_Page scart= new SandalSpecification_Page(driver);
		     scart.ClickToAddtoCartSANDALLink();
	
		    Thread.sleep(3000);
		    home.ClickToCartLinkImg();
		
		    SandalCart_Page CART=new SandalCart_Page(driver);
		    CART.ClickToAddtoCartDELETESANDALlink();		
	}

}
