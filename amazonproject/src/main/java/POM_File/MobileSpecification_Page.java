package POM_File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileSpecification_Page {
public MobileSpecification_Page(WebDriver driver)
{
PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@type='button']")
private WebElement AddtoCartMOBILElink;

@FindBy(id="attach-close_sideSheet-link")
private WebElement CloseTheSideWindow;
//GETTER
public WebElement getAddtoCartMOBILElink() {
	return AddtoCartMOBILElink;
}

public WebElement getCloseTheSideWindow() {
	return CloseTheSideWindow;
}
//METHOD
public void ClickToAddtoCartMOBILElink()
{
	AddtoCartMOBILElink.click();
	}
public void ClickToCloseTheSideWindow()
{
	CloseTheSideWindow.click();
	}

}