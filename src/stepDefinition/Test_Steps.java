package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	
	private static WebDriver driver = null;
	
	@Given("^the user is on the homepage$")
	public void the_user_is_on_the_homepage() throws Throwable {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://www.store.demoqa.com");
	}

	@When("^navigating to the login page$")
	public void navigating_to_the_login_page() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	}
	
/*	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_and(String username, String password) throws Throwable {
        driver.findElement(By.id("log")).sendKeys(username);
        driver.findElement(By.id("pwd")).sendKeys(password);
		driver.findElement(By.id("login")).click();
	}*/
	
	
	@When("^the user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_and(String username, String password) throws Throwable {
        driver.findElement(By.id("log")).sendKeys(username);
        driver.findElement(By.id("pwd")).sendKeys(password);
		driver.findElement(By.id("login")).click();
	}

	@Then("^login successful will be displayed$")
	public void login_successful_will_be_displayed() throws Throwable {
		System.out.println("Login Successfully");
	}

	@When("^the user logs out of the application$")
	public void the_user_logs_out_of_the_application() throws Throwable {
		//driver.findElement (By.xpath("//*[@id='account_logout']/a")).click();
		driver.findElement(By.xpath("//*[@id='meta']/ul/li[2]/a")).click();
	}

	@Then("^logout successful will be displayed$")
	public void logout_successful_will_be_displayed() throws Throwable {
		System.out.println("LogOut Successfully");
		//driver.quit(); 
	}
}
