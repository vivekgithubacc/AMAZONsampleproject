package POM_File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Utility.Web_Utility;

public class LaptopACC_File {
	public LaptopACC_File(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//span[@class='nav-a-content'])[3]")
	private WebElement LaptopandACCpageLink;

	//GETTER
	public WebElement getLaptopandACCpageLink() {
		return LaptopandACCpageLink;
	}
	//METHOD
	public void ClickToLaptopandACCpageLink(WebDriver driver)
	{
		Web_Utility wlib= new Web_Utility();
		wlib.AMZAmouseOverOnElement(driver, LaptopandACCpageLink);	
	}
	
}
