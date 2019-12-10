package StepDefn;

import org.openqa.selenium.By;

import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class LoginStepDefn extends Base {
	
	@Then("^Verify the title of LoginPage$")
	public void verify_the_title_of_LoginPage() throws Exception {
		
		String LoginPageActTitle  = driver.getTitle();
		System.out.println(LoginPageActTitle);
		Assert.assertEquals("Cogmento CRM", LoginPageActTitle);
	    
	}
	
	@Then("^User enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String arg1, String arg2)  {
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(arg1);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(arg2);
		
		
	  
	}

	@Then("^Click Login$")
	public void click_Login() throws Exception {
		
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//*[@class='ui fluid large blue submit button']")).click();
	
	}

	@Then("^User is Logged in Successfully$")
	public void user_is_Logged_in_Successfully() throws Exception {
		
		Thread.sleep(5000);	
		Assert.assertTrue(driver.findElement(By.xpath("//span[@class='user-display']")).isDisplayed());
			
	 
	}
	
	


}
