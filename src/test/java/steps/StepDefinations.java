package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinations {
	
	public ChromeDriver driver;
	@Given("Launch Chrome Browser and Load URL")
	public void launch_Chrome_Browser_and_Load_URL() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Given("enter Username as (.*)")
	public void enter_Username_as_DemoSalesManager(String uname) {
		driver.findElementById("username").sendKeys(uname);
	}

	@Given("enter Password as (.*)")
	public void enter_Password_as_crmsfa(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
	}

	@When("click the Login button")
	public void click_the_Login_button() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("its navigated Homepage")
	public void its_navigated_Homepage() {
	    System.out.println(driver.getTitle());
	}

	@Then("click the Logout button")
	public void click_the_Logout_button() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("close the browser")
	public void close_the_browser() {
	   driver.quit();
	}

	
	@Given("enter username as ssssss")
	public void enter_username_as_ssssss() {
		driver.findElementById("username").sendKeys("ssssss");
	}

	@Given("enter password as crmsfa")
	public void enter_password_as_crmsfa() {
		driver.findElementById("password").sendKeys("crmsfa");
	}

	@Then("its navigate same Page")
	public void its_navigate_same_Page() {
		System.out.println(driver.getTitle());
	}

	@Then("verify error msg")
	public void verify_error_msg() {
			   String text = driver.findElementById("errorDiv").getText();
			   System.out.println(text);
			   if(text.contains("The Following Errors Occurred:")) {
				   System.out.println("The error msg is matched");
				   
			   }else {
				   System.out.println("The error msg not matched");  
			   }
	}
	
	@Given("enter username as DemoSalesManager")
	public void enter_username_as_DemoSalesManager() {
		driver.findElementById("username").sendKeys("DemoSalesManager");
	}

	@When("Click CRM\\/SFA link")
	public void click_CRM_SFA_link() {
		 driver.findElementByLinkText("CRM/SFA").click();
	}

	@When("Click Creat Lead link")
	public void click_Creat_Lead_link() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@When("Enter company name as (.*)")
	public void enter_company_name_as_ABC(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}

	@When("Enter first name as (.*)")
	public void enter_first_name_as_Hema(String fName) {
		driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys(fName);
	}

	@When("Enter last name as (.*)")
	public void enter_last_name_as_Ma(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}

	@When("click Create Lead button")
	public void click_Create_Lead_button() {
		driver.findElementByXPath("//input[@name='submitButton']").click();
	}
	
}
