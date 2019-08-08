package com.read.qa;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

//import com.amazon.qa.util.TestUtil;

public class read {
public static WebDriver driver;
	public static void initialsetup() throws IOException {
		
		Properties prop= new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Reddy\\eclipse-workspace\\pommodelsample1"
				+"\\src\\main\\java\\config.properties");
		// TODO Auto-generated method stub
		prop.load(ip);
			String browsername=prop.getProperty("browser");
			if(browsername.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Reddy\\eclipse-workspace\\firstapptesting\\Firefox\\chromedriver.exe");
				//	System.setProperty("webdriver.chrome.driver","C:\\Users\\Reddy\\eclipse-workspace\\firstapptesting\\Firefox\\geckodriver.exe");
					 driver=new ChromeDriver();
			}
			else if (browsername.equals("FF")){
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Reddy\\eclipse-workspace\\firstapptesting\\Firefox\\geckodriver.exe");
				//	System.setProperty("webdriver.chrome.driver","C:\\Users\\Reddy\\eclipse-workspace\\firstapptesting\\Firefox\\geckodriver.exe");
					//WebDriver driver=new FirefoxDriver();
					 driver= new FirefoxDriver();
					 
					 
			}
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			WebElement signpage=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
			Actions builder = new Actions(driver);
			Action mouseoversignin= builder.moveToElement(signpage).click().build();
			mouseoversignin.perform();
			// driver.manage().deleteAllCookies();
			 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("Successfully opened browser");
		}

	}

