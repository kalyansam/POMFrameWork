package com.qa.utility;

import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;

import com.read.qa.read;
import com.relevantcodes.extentreports.ExtentReports;

public class extentrepodemo extends read {
	
@BeforeSuite
	public static void main(String[] args, String logintestcase) {
		// TODO Auto-generated method stub
 ExtentReports reporter= new ExtentReports("C:\\Users\\Reddy\\eclipse-workspace\\pommodelsample1\\Reports\\demoreports");
 
 reporter.startTest(logintestcase);


 
	}

}
