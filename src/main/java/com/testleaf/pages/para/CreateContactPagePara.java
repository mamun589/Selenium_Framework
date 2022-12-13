package com.testleaf.pages.para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateContactPagePara {
	
WebDriver driver;
	
	
	By firstName = By.id("firstNameField");
	By lastName = By.id("lastNameField");
	By createContactButton = By.name("submitButton");
	//	By logoutBtn = By.className("decorativeSubmit");
	
	//constructor
	public CreateContactPagePara(WebDriver driver){
		this.driver=driver;	
	}
	
	public void varifyCreateContactForm(String fname, String lName) {
		driver.findElement(firstName).sendKeys(fname);
		driver.findElement(lastName).sendKeys(lName);
		driver.findElement(createContactButton).click();
	}

}
