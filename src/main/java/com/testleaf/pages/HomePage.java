package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	
	By crmsfaLink = By.linkText("CRM/SFA");
	//	By logoutBtn = By.className("decorativeSubmit");
	
	//constructor
	public HomePage(WebDriver driver){
		this.driver=driver;	
	}
	
	public void clickCrmsfaLink() {
		driver.findElement(crmsfaLink).click();
	}
	
	/*	public void clickLogoutBtn() {
		driver.findElement(logoutBtn).click();
	}*/	

}
