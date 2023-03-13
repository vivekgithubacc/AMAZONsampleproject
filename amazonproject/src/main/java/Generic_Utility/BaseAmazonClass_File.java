package Generic_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import POM_File.Home_Page;
import POM_File.Login_Page;
import POM_File.Registration_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseAmazonClass_File {

	public WebDriver driver;
	public static WebDriver sdriver;
	@BeforeSuite(groups= {"smoke","regression"})
	public void BS()
	{
		System.out.println("Database Connection started");
	}
	@BeforeTest(groups= {"smoke","regression"})
	public void BT()
	{
		System.out.println("parallel execution");
	}
	//@Parameters("BROWSER")//crossbrowser
	@BeforeClass(groups= {"smoke","regression"})
	public void BC() throws Throwable //use string browser for crossbrowser
	{	
		  
			//for crossbrowser comment this 2 lines
			 Property_File plib=new Property_File();
			String BROWSER = plib.getpropertykeyvalue("browser");
			
			
					if(BROWSER.equalsIgnoreCase("chrome"))
				{
						WebDriverManager.chromedriver().setup();
						ChromeOptions options= new ChromeOptions();
						options.addArguments("--remote-allow-origins=*");
						driver=new ChromeDriver(options);
					}
					else if(BROWSER.equalsIgnoreCase("firefox"))
					{
						WebDriverManager.firefoxdriver().setup();
						driver=new FirefoxDriver();
					}
				else if(BROWSER.equalsIgnoreCase("edge"))
					{
						WebDriverManager.edgedriver().setup();
						driver=new EdgeDriver();
					}
					else
				{
					driver= new ChromeDriver();
					}
		System.out.println("launching browsering");	
		sdriver=driver;
	}
	
	@BeforeMethod(groups= {"smoke","regression"})
	public void BM() throws Throwable 
	{
		Property_File plib= new Property_File();
		String URL = plib.getpropertykeyvalue("url");
		String MOBILE = plib.getpropertykeyvalue("mobile");
		 driver.get(URL);
		 Home_Page home= new Home_Page(driver); 
		 home.ClickToSignInIMG();
		 Login_Page login=new Login_Page(driver);
			login.LoginToApp(MOBILE);
		System.out.println("login to application");
	}
	@AfterMethod(groups= {"smoke","regression"})
	public void AM() 
	{
		 Home_Page home= new Home_Page(driver); 
		 home.ClickToAmazonIMG();
		System.out.println("logout from application");
	}
	@AfterClass(groups= {"smoke","regression"})
	public void AC()
	{
		System.out.println("close the browser");
	}
	@AfterTest(groups= {"smoke","regression"})
	public void AT()
	{
		System.out.println("parallel execution");
	}
	@AfterSuite(groups= {"smoke","regression"})
	public void AS()
	{
		System.out.println("Database connection loss");
	}
}
