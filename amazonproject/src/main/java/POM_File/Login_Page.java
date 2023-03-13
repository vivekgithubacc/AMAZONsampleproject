package POM_File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="ap_email")
	private WebElement UserTextField;
	
	@FindBy(id="continue")
	private WebElement LoginButton;
	
	@FindBy(xpath="//i[@role='img']")
	private WebElement AmazoneSignInImg;

	//GETTER
	public WebElement getUserTextField()
	{
		return UserTextField;
	}

	public WebElement getLoginButton() 
	{
		return LoginButton;
	}
	public WebElement getAmazoneSignInImg() {
		return AmazoneSignInImg;
	}
	//METHOD
	public void LoginToApp(String userName)
	{
		UserTextField.sendKeys(userName);
		LoginButton.click();
		AmazoneSignInImg.click();
	}
	
	
}
