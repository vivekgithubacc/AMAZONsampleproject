package POM_File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PendriveSpeci_File {

		public PendriveSpeci_File(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//input[@value='Add to Cart']")
		private WebElement PENDRIVEspecipageLink;
		//GETTER
		public WebElement getPENDRIVEspecipageLink() {
			return PENDRIVEspecipageLink;
		}
		//METHOD
		public void ClickToPENDRIVEspecipageLink()
		{
			PENDRIVEspecipageLink.click();
		}

}
