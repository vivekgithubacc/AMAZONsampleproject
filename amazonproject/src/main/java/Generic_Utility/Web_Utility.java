package Generic_Utility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Web_Utility {

	public void AMZAmaximizeScreen(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public void  AMZAwaitForPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void AMZAswitchToWindow(WebDriver driver)
	{
		 Set<String> ids = driver.getWindowHandles();
	        Iterator<String> it = ids.iterator();
	        String parentId = it.next();
	        String childId= it.next();
	        driver.switchTo().window(childId);
	}
	
	public void  AMZAswitchToAlertAndAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
		
	}
	
	public void  AMZAswitchToAlertAndDismss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();		
	}
	
	public void AMZAswitchToFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	
	public void  AMZAswitchToFrame(WebDriver driver,String id_name_Attributes)
	{
		driver.switchTo().frame(id_name_Attributes);
	}
	
	
	public void  AMZAselect(WebElement element,int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	public void  AMZAselect(WebElement element,String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void  AMZAmouseOverOnElement(WebDriver driver,WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public void  AMZArightClickOnElement(WebDriver driver,WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public void  AMZAmoveByOffset(WebDriver driver,int x,int y)
	{
		Actions act = new Actions(driver);
		act.moveByOffset(x, y).click().perform();
	}
	
}
