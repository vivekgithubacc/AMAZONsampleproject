package POM_File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_Page {

	public Registration_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="ap_customer_name")
	private WebElement UserTextField;
	@FindBy(id="ap_phone_number")
	private WebElement PhoneTextField;
	@FindBy(id="ap_password")
	private WebElement PasswordTextField;
	@FindBy(id="continue")
	private WebElement Continuelink;
	@FindBy(xpath="//i[@role='img']")
	private WebElement RegistrationAmazonImg;
	
	public WebElement getUserTextField() {
		return UserTextField;
	}
	public WebElement getPhoneTextField() {
		return PhoneTextField;
	}
	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}
	
	public WebElement getContinuelink() {
		return Continuelink;
	}
	
	public WebElement getRegistrationAmazonImg() {
		return RegistrationAmazonImg;
	}
	public void ClickToRegistrationTextField(String Username,String PhoneNum,String Password)
	{
		UserTextField.sendKeys(Username);
		PhoneTextField.sendKeys(PhoneNum);
		PasswordTextField.sendKeys(Password);
		Continuelink.click();
		RegistrationAmazonImg.click();
	}
	
	
}
