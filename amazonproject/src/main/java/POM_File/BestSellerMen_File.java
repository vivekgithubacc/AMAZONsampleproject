package POM_File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestSellerMen_File {

	public BestSellerMen_File(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="(//span[@class='nav-a-content'])[3]")
private WebElement clothandAccessoriesMENSLink;

@FindBy(xpath="//span[text()='Shoes']")
private WebElement ShoesLinkText;

public WebElement getClothandAccessoriesMENSLink() {
	return clothandAccessoriesMENSLink;
}


public WebElement getShoesLinkText() {
	return ShoesLinkText;
}


public void ClickToclothandAccessoriesMENLink()
{
	clothandAccessoriesMENSLink.click();
	}
public void ClickToShoesLinkText()
{
	ShoesLinkText.click();
	}
}
