package pageobject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;

public class login {
	WebDriver ldriver;

	public login(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id = "user")
	WebElement userName;
	
	@FindBy(id = "pass")
	WebElement password;
	
	@FindBy(className = "btn_log")
	WebElement button_login;
	
	public void login(String UserName,String pass) {
		userName.click();
		userName.sendKeys(UserName);
		password.click();
		password.sendKeys(pass);
		button_login.click();
	}
	
	@Then("The Page Tile should display {string}")
	public void the_page_tile_should_display_or(String Title) {
			Assert.assertEquals(Title, ldriver.getTitle());
	}
}