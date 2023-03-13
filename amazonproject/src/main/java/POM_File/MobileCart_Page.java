package POM_File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileCart_Page {
	public MobileCart_Page(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement AddtoCartDELETEMOBILElink;
	
	//GETTER
	public WebElement getAddtoCartDELETEMOBILElink() {
		return AddtoCartDELETEMOBILElink;
	}
	//METHOD
	public void ClickToAddtoCartDELETEMOBILElink() {
		AddtoCartDELETEMOBILElink.click();
	}
	
	
}
