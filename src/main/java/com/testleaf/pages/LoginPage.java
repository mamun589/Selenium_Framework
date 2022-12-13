package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	// this is call reference variable
	
		//By is a class and id is a static method , will return only By
		By username = By.id("username");
		By password = By.id("password");
		By loginbutton = By.className("decorativeSubmit");
		// here By is the format and which is class
		// username, password or loginbutton is the variable we can add the name as per we want
		// By.id is like driver.findelement

		//constructor
		public LoginPage(WebDriver driver){
			this.driver=driver;		
		}
		// we create constructor which should be public and same name as Class name
		// the we pass Webdriver driver as an argument
		// this.driver=driver; is a format which means driver from this page
		
		//three methods for three elements or locator
		public void typeUsername() {
			driver.findElement(username).sendKeys("DemoCSR");
		}
		
		public void typePassword() {
			driver.findElement(password).sendKeys("crmsfa");
		}
		
		public void clickLoginBtn() {
			driver.findElement(loginbutton).click();
		}
		// we created three method because we have three element in the page
		// then we pass the variable
		// over here we did not use By because this is already used

}
