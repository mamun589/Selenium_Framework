package com.testleaf.pages.para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePagePara {
	
	WebDriver driver;
	
	
	By crmsfaLink = By.linkText("CRM/SFA");
	//	By logoutBtn = By.className("decorativeSubmit");
	
	//constructor
	public HomePagePara(WebDriver driver){
		this.driver=driver;	
	}
	
	public void clickCrmsfaLink() {
		driver.findElement(crmsfaLink).click();
	}
	
	/*	public void clickLogoutBtn() {
		driver.findElement(logoutBtn).click();
	}*/	

}
