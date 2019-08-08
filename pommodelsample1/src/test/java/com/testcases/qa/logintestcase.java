package com.testcases.qa;

import java.io.IOException;

import org.junit.Before;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import com.amazon.qa.pages.LoginPage;
import com.pages.qa.loginpages;
import com.qa.utility.screenshots;
import com.read.qa.read;

public class logintestcase extends read {
	screenshots screen= new screenshots();
	loginpages loginpage;
	public   logintestcase() {
		super();
	}
@BeforeMethod
	public void setup() throws IOException {
		// TODO Auto-generated method stub
		initialsetup();
		loginpage= new loginpages();
	}
	
	@Test(priority=1)
     public void logintestcase() throws IOException {
			
			loginpage.loginp();
			
		}
	@Test(priority=2)
	public void verify() throws IOException {
		String Title=loginpage.verifytile();
		Assert.assertEquals(Title, "Amazon Sign-I");
		 
	}
	
	
	@AfterMethod
	public void screenShot(ITestResult result) throws IOException{
		 //using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
		 if(ITestResult.FAILURE==result.getStatus()){
			 screenshots.capturescreenshots(result);
		 }
	
		driver.quit();
	

	}

}
