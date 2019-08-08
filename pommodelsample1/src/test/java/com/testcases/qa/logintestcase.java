package com.testcases.qa;

import java.io.IOException;

import org.junit.Before;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
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
	
	@Test (dataProvider="amazonlogindata")
     public  void logintestcase(String username1,String password1) throws IOException {
			
			loginpage.loginp(username1, password1);
			
		}
	@Test(priority=2)
	public void verify() throws IOException {
		String Title=loginpage.verifytile();
		Assert.assertEquals(Title, "Amazon Sign-In");
		 
	}

	@DataProvider(name="amazonlogindata")
	public Object[][] logindata(){
		Object[][] data= new Object[3][2];
		
		data[0][0]="9606188565";
		data[0][1]="9606188565";
		data[1][0]="9606188565@";
		data[1][1]="9606188565";
		data[2][0]="9606188565";
		data[2][1]="96061885-5";
		return data;				
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
