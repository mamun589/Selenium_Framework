package com.testleaf.pages.para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreatLeadPagePara {
	
	WebDriver driver;
	
	By companyname = By.id("createLeadForm_companyName");
	By firstname = By.id("createLeadForm_firstName");
	By lastname = By.id("createLeadForm_lastName");
	By sourcedd = By.id("createLeadForm_dataSourceId");
	By mktCampaignDD = By.id("createLeadForm_marketingCampaignId");
	By industryDD = By.id("createLeadForm_industryEnumId");
	By creatleadBtn = By.xpath("//input[@value='Create Lead']");
	
	
	//constructor
	public CreatLeadPagePara(WebDriver driver){
		this.driver=driver;
		
	}
	
	public void createLeadForm(String cName, String fName, String lName, String txt) {
		driver.findElement(companyname).sendKeys(cName);
		driver.findElement(firstname).sendKeys(fName);
		driver.findElement(lastname).sendKeys(lName);
		
		WebElement src = driver.findElement(sourcedd);
		Select dd1 = new Select(src);
		dd1.selectByVisibleText(txt);
		
		WebElement mktdd = driver.findElement(mktCampaignDD);
		Select dd2 = new Select(mktdd);
		dd2.selectByValue("CATRQ_CAMPAIGNS");
		
		WebElement indDD = driver.findElement(industryDD);
		Select dd3 = new Select(indDD);
		dd3.selectByIndex(2);
		
		
		driver.findElement(creatleadBtn).click();
	}
	
	/*public void typeCompanyname() {
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
	}*/		

}
