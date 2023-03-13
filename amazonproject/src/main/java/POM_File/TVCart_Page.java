package POM_File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TVCart_Page {

	public TVCart_Page(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@value='Delete'])[1]")
	private WebElement AddtoCartDELETEtvSETUPlink;
	
	@FindBy(xpath="(//input[@value='Delete'])[2]")
	private WebElement AddtoCartDELETEtvlink;
	
	//GETTER
	public WebElement getAddtoCartDELETEtvSETUPlink() {
		return AddtoCartDELETEtvSETUPlink;
	}
	public WebElement getAddtoCartDELETEtvlink() {
		return AddtoCartDELETEtvlink;
	}
	//METHOD
	public void ClickToAddtoCartDELETEtvSETUPlink() {
		AddtoCartDELETEtvSETUPlink.click();
	}
	public void ClickToAddtoCartDELETEtvlink() {
		AddtoCartDELETEtvlink.click();
	}
}
