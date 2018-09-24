package stepDefination2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	public WebDriver driver;
	
	@Given("^open browser and start application$")
	public void open_browser_and_start_application()  {
		
		System.setProperty("webdriver.chrome.driver","D:\\sel_jar18\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.google.com");
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password () {
		System.out.println("x xxxxxxxxx");
	}
	
	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully () {
		System.out.println("x  xxxxxxxxx");
		driver.quit();
	}


}
