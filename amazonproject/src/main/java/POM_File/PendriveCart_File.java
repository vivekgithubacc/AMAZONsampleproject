package POM_File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PendriveCart_File {

	public PendriveCart_File(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement AddtoCartDELETEPENDRIVEElink;
	
	//GETTER
	public WebElement getAddtoCartDELETEPENDRIVEElink() {
		return AddtoCartDELETEPENDRIVEElink;
	}
	//METHOD
	public void ClickToAddtoCartDELETEPRNDRIVElink() {
		AddtoCartDELETEPENDRIVEElink.click();
	}
}
