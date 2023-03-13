package POM_File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SandalSpecification_Page {

	public SandalSpecification_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
@FindBy(id="add-to-cart-button")
private WebElement  SandalSpecificationLink;

//GETTER
public WebElement getSandalSpecificationLink() {
	return SandalSpecificationLink;
}
//METHOD
public void ClickToAddtoCartSANDALLink()
{
	SandalSpecificationLink.click();
	}

}
