package com.pages.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

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

	public  void loginp() {
		username.sendKeys("username");
		password.sendKeys("password");
		loginbtn.click();
		}
	
	public  String verifytile() {
		return driver.getTitle();
	}
}
