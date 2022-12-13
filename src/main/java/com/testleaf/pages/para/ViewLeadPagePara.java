package com.testleaf.pages.para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewLeadPagePara {
	
WebDriver driver;
	
	
	By contactLink = By.linkText("Contacts");
	//	By logoutBtn = By.className("decorativeSubmit");
	
	//constructor
	public ViewLeadPagePara(WebDriver driver){
		this.driver=driver;	
	}
	
	public void clickContactLink() {
		driver.findElement(contactLink).click();
	}

}
