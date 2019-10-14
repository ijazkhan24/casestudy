package cucumber.casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.casestudy.UtilityDriver;
import cucumber.casestudy.pages;

public class login {
	WebDriver driver;
	@Given("^user enter the credentials$")
	public void user_is_on_the_home_page() throws Throwable {
		driver = UtilityDriver.openBrowser("Chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/");
		
	}

	@When("^user enter the \"username\" and \"password\"$")
	public void user_enter_the_valid_credentials() throws Throwable {
		pages page= new pages(driver);
		page.do_login("lalitha", "Password123");
	}

	@Then("^login successfull!!!$")
	public void user_must_in_home_page_and_display_success_message() throws Throwable {
		WebDriverWait wait= new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("products")));
		Assert.assertEquals(driver.getTitle(), "Home");
		System.out.println("Logged in Successfully !!");
		driver.close();
	}


 }
