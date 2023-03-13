package POM_File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MANYSandalANDFloater_Page {

	public MANYSandalANDFloater_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//span[@class='a-size-base a-color-base']")
private WebElement MANYSandalANDFloaterLink;

//GETTER
public WebElement getMANYSandalANDFloaterLink() {
	return MANYSandalANDFloaterLink;
}

//METHOD
public void ClickToMANYSandalANDFloaterLink()
{
	MANYSandalANDFloaterLink.click();
	}

}
