package cucumber.casestudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class search {
	WebDriver driver;
	WebDriverWait wait;

	
	@Given("^user in the sign in page$")
	public void user_in_the_sign_in_page() throws Throwable {
		driver=UtilityDriver.openBrowser("Chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@When("^user enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_the_and(String arg1, String arg2) throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Login");
		driver.findElement(By.name("userName")).sendKeys(arg1);
		driver.findElement(By.name("password")).sendKeys(arg2);
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@Then("^user login successfull!!!$")
	public void user_login_successfull() throws Throwable {
		
		System.out.println("login successfull!!!");
			    
	}

	@Given("^user in the home page to search$")
	public void user_in_the_home_page_to_search() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Home");
		
	}

	@When("^user search the product as \"([^\"]*)\" in the search box$")
	public void user_search_the_product_as_in_the_search_box(String arg1) throws Throwable {
		
		driver.findElement(By.name("products")).sendKeys(arg1);
		driver.findElement(By.xpath("/html/body/div[1]/form/div[1]/input")).click();
		//WebDriverWait wait=new WebDriverWait(driver,10);
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/a[2]")).click();
		driver.findElement(By.xpath("/html/body/main/section/div[3]/table/tfoot/tr[2]/td[5]/a")).click();
		driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
		//payment gateway
		driver.get("http://10.232.237.143:443/PaymentGateway/getOrderDetails.htm");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div[1]/div[1]/div")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/a")).click();
		driver.findElement(By.name("username")).sendKeys("123456");
		driver.findElement(By.name("password")).sendKeys("Pass@456");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div/form/div/div[3]/input")).click();
		driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div/form/div/div[2]/input")).click();
		
		
	}

	@Then("^product description page is visible$")
	public void product_description_page_is_visible() throws Throwable {
		driver.findElement(By.xpath("/html/body/header/div/div/ul/b/a[2]")).click();
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.close();
		//Assert.assertEquals(driver.getTitle(), "Search");
		
	}
	
	@When("^user search the different product as \"([^\"]*)\" in the search box$")
	public void user_search_the_different_product_as_in_the_search_box(String arg1) throws Throwable {
		driver.findElement(By.name("products")).sendKeys(arg1);
		//driver.findElement(By.xpath("/html/body/div[1]/form/div[1]/input")).click();
		//WebDriverWait wait=new WebDriverWait(driver,10);
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("^product not available page is displayed$")
	public void product_not_available_page_is_displayed() throws Throwable {
		
	    Assert.assertEquals(driver.getTitle(),"Search");
	    driver.close();
	}
	@When("^user search for a product with blank text$")
	public void user_search_for_a_product_with_blank_text() throws Throwable {
		//Assert.assertEquals(driver.getTitle(), "Home");
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	   
	}

	@Then("^popup appears$")
	public void popup_appears() throws Throwable {
		Alert alert=driver.switchTo().alert();
		alert.accept();
	   driver.close();
	}

} 
