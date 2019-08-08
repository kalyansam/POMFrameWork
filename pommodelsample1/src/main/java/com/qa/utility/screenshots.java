package com.qa.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.runner.Result;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.testng.ITestResult;
import com.read.qa.read;

public class screenshots extends read{

	public static void capturescreenshots(ITestResult result) throws IOException {
		// TODO Auto-generated method stub
try {
	TakesScreenshot ts= (TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C:\\Users\\Reddy\\eclipse-workspace\\pommodelsample1\\screenshots\\"+result.getName()+".png"));
	System.out.println(" successfully taken screen shots");
} catch (WebDriverException e) {
	// TODO Auto-generated catch block
	System.out.println("exception while taking screen shot");
}
	}

}

