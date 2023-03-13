package POM_File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Generic_Utility.Web_Utility;

public class Home_Page 
{

public Home_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//span[text()='Hello, sign in']")
private WebElement SignInIMG;

@FindBy(id="twotabsearchtextbox")
private WebElement SearchTextBox;

@FindBy(id="twotabsearchtextbox")
private WebElement SearchTextBoxData;

@FindBy(id="nav-search-submit-button")
private WebElement SubmitButton;

@FindBy(xpath="//a[text()='Mobiles']")
private WebElement MobileLinkText;

@FindBy(xpath="//a[@id='nav-cart']")
private WebElement CartLinkImg;

@FindBy(id="nav-logo-sprites")
private WebElement AmazonIMG;

@FindBy(xpath="//a[text()='Best Sellers'])[1]")
private WebElement BestSellerLink;

@FindBy(xpath="searchDropdownBox")
private WebElement DropDownList;

@FindBy(xpath="(//a[text()='Best Sellers'])[1]")
private WebElement BestSellerTEXTLink;

@FindBy(id="searchDropdownBox")
private WebElement DropDownListLink;

@FindBy(id="twotabsearchtextbox")
private WebElement TVserachTextBoxLink;

//GETTER
public WebElement getSignInIMG() {
	return SignInIMG;
}
public WebElement getSearchTextBox() {
	return SearchTextBox;
}

public WebElement getSubmitButton() {
	return SubmitButton;
}

public WebElement getMobileLinkText() {
	return MobileLinkText;
}

public WebElement getCartLinkImg() {
	return CartLinkImg;
}

public WebElement getAmazonIMG() {
	return AmazonIMG;
}

public WebElement getBestSellerLink() {
	return BestSellerLink;
}

public WebElement getDropDownList() {
	return DropDownList;
}

public WebElement getSearchTextBoxData() {
	return SearchTextBoxData;
}

public WebElement getBestSellerTEXTLink() {
	return BestSellerTEXTLink;
}

public WebElement getDropDownListLink() {
	return DropDownListLink;
}


public WebElement getTVserachTextBoxLink() {
	return TVserachTextBoxLink;
}
//METHOD
public void ClickToSignInIMG()
{
	SignInIMG.click();
	}
public void ClickToSearchTextBox(WebDriver driver)
{
	Web_Utility wlib= new Web_Utility();
	wlib.AMZAmouseOverOnElement(driver, SearchTextBox);

	}
public void ClickToSubmitButton()
{
	SubmitButton.click();
	}
public void ClickToMobileLinkText()
{
	MobileLinkText.click();
	}
public void ClickToCartLinkImg()
{
	CartLinkImg.click();
	}
public void ClickToAmazonIMG()
{
	AmazonIMG.click();
	}
public void ClickToBestSellerLink()
{
	BestSellerLink.click();
	}
public void ClickToDropDownList()
{
	DropDownList.click();
	}
public void ClickToSearchTextBoxData(String iphonedata)
{
	SearchTextBoxData.sendKeys(iphonedata);
	}
public void ClickToBestSellerTEXTLink()
{
	BestSellerTEXTLink.click();
	}
public void ClickToDropDownListELECTLink()
{
	Select s= new Select(DropDownListLink);
	s.selectByVisibleText("Electronics");
	}
public void ClickToTVserachTextBoxLink(String AMAZEDATA)
{
	TVserachTextBoxLink.sendKeys(AMAZEDATA);
	}
}
