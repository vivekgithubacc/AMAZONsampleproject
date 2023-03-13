package POM_File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TVspecification_Page {

	public TVspecification_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='button']")
	private WebElement TVspecipageLink;
	
	@FindBy(id="attach-close_sideSheet-link")
	private WebElement TVclosesideSlideLink;
	
	//GETTER
	public WebElement getTVspecipageLink() {
		return TVspecipageLink;
	}
	
	public WebElement getTVclosesideSlideLink() {
		return TVclosesideSlideLink;
	}

	//METHOD
	public void ClickTotvspecipageLink()
	{
		TVspecipageLink.click();
	}
	public void ClickToTVclosesideSlideLinkLink()
	{
		TVclosesideSlideLink.click();
	}
}
