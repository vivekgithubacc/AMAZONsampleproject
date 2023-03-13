package Generic_Utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerImplementationAMZClass implements ITestListener {

	public void onTestFailure(ITestResult result) {
		
		String testName = result.getMethod().getMethodName();
		System.out.println("-------excuted----------");
		
		EventFiringWebDriver edriver= new EventFiringWebDriver(BaseAmazonClass_File.sdriver);
		File src = edriver.getScreenshotAs(OutputType.FILE);
		
		try
		{
			FileUtils.copyFile(src, new File("./screenshotAmz/"+testName+".png"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
