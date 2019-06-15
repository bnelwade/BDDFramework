package StepDefinitionPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition {

	WebDriver driver=null;
	@Given("^user is alreay on login page$")
	public void user_is_alreay_on_login_page() throws Throwable {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bhagu");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("nelwade");
		
	}

	@Then("^user clicks on submit button$")
	public void user_clicks_on_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("^user get the title$")
	public void user_get_the_title(){
		String title=driver.getTitle();
		System.out.println("User title is="+title);
	 }

	@Then("^user close the browser$")
	public void user_close_the_browser(){
		driver.close();
	}

}
