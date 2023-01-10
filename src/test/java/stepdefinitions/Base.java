package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.login;

public class Base {
	public static WebDriver driver;
	login lp;

	@Given("launch chrome browser")
	public void launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		lp = new login(driver);
		driver.manage().window().maximize();
	}

	@Given("open URL {string}")
	public void open_url(String string) {
		driver.get(string);
	}

	@When("login with username {string} & password {string}")
	public void login_with_username_password(String user, String pass) {
		lp.login(user, pass);
	}

	@Then("The Page Tile should display {string}")
	public void the_page_tile_should_display(String string) {
		lp.the_page_tile_should_display_or(string);
	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();
	}
}
