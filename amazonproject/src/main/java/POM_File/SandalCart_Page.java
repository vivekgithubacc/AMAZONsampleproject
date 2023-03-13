package POM_File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SandalCart_Page {

	public SandalCart_Page(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement AddtoCartDELETESANDALElink;
	
	//GETTER
	public WebElement getAddtoCartDELETESANDALElink() {
		return AddtoCartDELETESANDALElink;
	}

//METHOD
	public void ClickToAddtoCartDELETESANDALlink() {
		AddtoCartDELETESANDALElink.click();
	}
}
