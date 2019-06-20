package StepDefinitionPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FBLoginSetpDef {
	WebDriver driver;
	@Given("^User is already on login page$")
	public void user_is_already_on_login_page() {
	    System.setProperty("webdriver.chrome.driver", "E:\\BDDFramework\\BDDFramework\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https:\\www.facebook.com");
	    
	}

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_bala_and_bala(String username,String password){
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
	}

	@Then("^user clicks on sumbit button$")
	public void user_clicks_on_sumbit_button(){
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}

}
