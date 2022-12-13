package com.testleaf.testcase.para;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.testleaf.pages.para.ContactsPagePara;
import com.testleaf.pages.para.CreatLeadPagePara;
import com.testleaf.pages.para.CreateContactPagePara;
import com.testleaf.pages.para.HomePagePara;
import com.testleaf.pages.para.LoginPagePara;
import com.testleaf.pages.para.MyHomePagePara;
import com.testleaf.pages.para.ViewLeadPagePara;

public class TestRunnerPara {
	
	@Test
	public void VerifyCreateLead() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//up to here is belong to every page
		
		LoginPagePara lpp = new LoginPagePara(driver);
		lpp.loginToTestLeaf("DemoCSR", "crmsfa");
		
		HomePagePara hpp = new HomePagePara(driver);
		hpp.clickCrmsfaLink();
		
		MyHomePagePara mhpp = new MyHomePagePara(driver);
		mhpp.clickCreateleadLink();
		
		CreatLeadPagePara clpp = new CreatLeadPagePara(driver);
		clpp.createLeadForm("ABC", "Hema", "Mali", "Direct Mail");
		Thread.sleep(3000);
		
		ViewLeadPagePara vlpp = new ViewLeadPagePara(driver);
		vlpp.clickContactLink();
		
		ContactsPagePara cpp = new ContactsPagePara(driver);
		cpp.clickCreateContactLink();
		
		CreateContactPagePara ccpp = new CreateContactPagePara(driver);
		ccpp.varifyCreateContactForm("Shafin", "Chy");
		Thread.sleep(3000);
		
		driver.quit();
	}

}
