package POM_File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SandalAndFloater_Page {

	public SandalAndFloater_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="(//span[text()='Sandals & Floaters'])[2]")
private WebElement SandalAndFloater;

//GETTER
public WebElement getSandalAndFloater() {
	return SandalAndFloater;
}

//METHOD
public void ClickToSandalAndFloaterTextLink()
{
	SandalAndFloater.click();
	}
}
