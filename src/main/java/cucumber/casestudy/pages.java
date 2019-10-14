package cucumber.casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pages {
	WebDriver driver;
	By username = By.name("userName");
	By password = By.name("password");
	By loginbutton = By.name("Login");

	public pages(WebDriver driver) {
		this.driver = driver;
	}

	public void do_login(String uid, String pass) {
		driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		driver.findElement(username).sendKeys(uid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginbutton).click();	

}

}
//autocomplete-items


