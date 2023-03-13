package POM_File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestSeller_Page {

	public BestSeller_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//a[text()='Clothing & Accessories']")
private WebElement clothandAccessoriesLink;

//GETTER
public WebElement getClothandAccessoriesLink() {
	return clothandAccessoriesLink;
}
//METHOD
public void ClickToclothandAccessoriesLink()
{
	clothandAccessoriesLink.click();
	}

}
