package com.testleaf.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.testleaf.pages.CreatLeadPage;
import com.testleaf.pages.HomePage;
import com.testleaf.pages.LoginPage;
import com.testleaf.pages.MyHomePage;

public class TestRunner {
	
	@Test
	public void verifyValidLoginPage() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//up to here is belong to every page
		
		LoginPage lp= new LoginPage(driver);
		lp.typeUsername();
		lp.typePassword();
		lp.clickLoginBtn();
		// we create object of the Login page 
		// with the object we call all the methods from those particular page
		// make sure to import from exactly the same package it belongs
		// here lp means login page
		
		HomePage hp = new HomePage(driver);
		hp.clickCrmsfaLink();
		
		MyHomePage mhp= new MyHomePage(driver);
		mhp.clickCreateleadLink();
		
		CreatLeadPage clp = new CreatLeadPage(driver);
		clp.typeCompanyname();
		clp.typefirstname();
		clp.typelastname();
		clp.selectSourcedd();
		clp.clickCreatleadBtn();
		
		
		driver.quit();
	
	}

}
