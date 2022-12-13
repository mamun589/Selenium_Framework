package com.testleaf.pages.para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyHomePagePara {
	
	WebDriver driver;
	
	
	By CreateLeadLink = By.linkText("Create Lead");
	
	//constructor
	public MyHomePagePara(WebDriver driver){
		this.driver=driver;
		
	}
	
	public void clickCreateleadLink() {
		driver.findElement(CreateLeadLink).click();
	}

}
