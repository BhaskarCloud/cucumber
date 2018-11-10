package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SmokeTest {
	public WebDriver driver;
	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver","D:\\sel_jar18\\chromedriver.exe");
	    driver=new ChromeDriver();
	}
	
	@After
	public void teatDown(){
		driver.close();
	}
	
	@Given("^open browser and start applications$")
		public void open_browser_and_start_application()  {
		
	    driver.get("https://www.freecrm.com");//https://www.google.com");

	}

	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$") 
		public void I_enter_valid_username_and_valid_password (String Uname, String pass) {
		driver.findElement(By.name("username")).sendKeys(Uname);
		driver.findElement(By.name("password")).sendKeys(pass);
		wait(4);
		 //WebDriverWait wait = new WebDriverWait(driver, 10);
		 //WebElement element;// = new WebElement(); //driver.findElement(By.xpath("//input[@type='submit']"));
		  //element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='submit']")));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("Login clicked "+Uname);
		wait(5);

	}

	@Then("^users should be able to login successfully$")
		public void user_should_be_able_to_login_successfully () {
		driver.switchTo().frame("mainpanel");
			Assert.assertTrue(driver.findElement(By.xpath("//td[contains(text(), 'User: bhaskar khimania')]")).isDisplayed());
			System.out.println("loged In Username verified");
		}
	protected static boolean wait(int timeInSec) //LINE 597
	{
		boolean stepStatus;
		try
		{
			Thread.sleep(timeInSec*1000);
			stepStatus = true;
		}
		catch (Exception e) 
		{
			stepStatus=false;
		}
		return stepStatus;
	}

}
