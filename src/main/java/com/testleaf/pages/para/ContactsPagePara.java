package com.testleaf.pages.para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactsPagePara {
	
WebDriver driver;
	
	
	By createContactLink = By.linkText("Create Contact");
	//	By logoutBtn = By.className("decorativeSubmit");
	
	//constructor
	public ContactsPagePara(WebDriver driver){
		this.driver=driver;	
	}
	
	public void clickCreateContactLink() {
		driver.findElement(createContactLink).click();
	}

}
