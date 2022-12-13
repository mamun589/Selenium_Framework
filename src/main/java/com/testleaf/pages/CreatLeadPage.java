package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreatLeadPage {
	
	WebDriver driver;
	
	By companyname = By.id("createLeadForm_companyName");
	By firstname = By.id("createLeadForm_firstName");
	By lastname = By.id("createLeadForm_lastName");
	By sourcedd = By.id("createLeadForm_dataSourceId");
	By creatleadBtn = By.xpath("//input[@value='Create Lead']");
	
	
	//constructor
	public CreatLeadPage(WebDriver driver){
		this.driver=driver;
		
	}
	
	public void typeCompanyname() {
		driver.findElement(companyname).sendKeys("ABC");
	}
	public void typefirstname() {
		driver.findElement(firstname).sendKeys("Hema");
	}
	public void typelastname() {
		driver.findElement(lastname).sendKeys("Mali");
	}
	public void selectSourcedd() {
		WebElement src = driver.findElement(sourcedd);
		Select dd1 = new Select(src);
		dd1.selectByVisibleText("Direct Mail");
	}
	public void clickCreatleadBtn() {
		driver.findElement(creatleadBtn).click();
	}		

}
