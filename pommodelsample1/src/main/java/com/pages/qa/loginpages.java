package com.pages.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.google.common.collect.ObjectArrays;
import com.read.qa.read;

public class loginpages extends read {
	
	
	@FindBy(xpath="//input[@name='email']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement loginbtn;

	
public loginpages() {
	PageFactory.initElements(driver, this);
}


	public   void loginp(String username1 ,String password1){
	username.sendKeys(username1);
		password.sendKeys(password1);
		loginbtn.click();
		Assert.assertTrue(driver.getTitle().contains("Online Shopping"), "Provided invalid credentials");
		System.out.println("user able to login succesfully");
		}
	
	
	
	public  String verifytile() {
		return driver.getTitle();
	}
}
