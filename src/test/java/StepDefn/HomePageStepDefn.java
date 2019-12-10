package StepDefn;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageStepDefn extends Base{
	
	
	
	String HomepageExpTitle  = "Free CRM #1 cloud software for any business large or small";
	
	@Given("^User is on HomePage$")
	public void user_is_on_HomePage() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srinaika\\Desktop\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://freecrm.com/");	
	  
	}

	@Then("^Verify the title of the Homepage$")
	public void verify_the_title_of_the_Homepage() throws Exception {
		String pageTitle  = driver.getTitle();
		Assert.assertEquals(HomepageExpTitle, pageTitle);
		
	    
	}
	
	@Given("^User Click on Login Btn$")
	public void user_Click_on_Login_Btn() throws Exception {
	  driver.findElement(By.xpath("//span[@class='icon icon-xs mdi-chart-bar']")).click();
	}

	@Then("^User is navigated to LoginPage$")
	public void user_is_navigated_to_LoginPage() throws Exception {
		String LoginPageTitle  = driver.getTitle();
		Assert.assertEquals("Cogmento CRM", LoginPageTitle);
		
	  
	}
	
	@Then("^Close the browser$")
	public void close_the_browser() throws Exception {
	   driver.quit();
	}

	

	@Given("^User is on NewHomePage$")
	public void user_is_on_NewHomePage() throws Exception {
	   System.out.println("User is on home page");
	}

	@Given("^User Click on NewLogin Btn$")
	public void user_Click_on_NewLogin_Btn() throws Exception {
		 System.out.println("User click on newlogin btn");
	}


}
