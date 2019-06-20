package StepDefinitionPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SignUpStep {

	//Step definition with list 
	WebDriver driver;
	
	@Given("^user is already on signUp page$")
	public void user_is_already_on_signUp_page(){
		System.setProperty("webdriver.chrome.driver", "E:\\BDDFramework\\BDDFramework\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https:\\www.facebook.com");
	}

	@Then("^user enters firstname and lastname and mobno and password$")
	public void user_enters_firstname_and_lastname_and_mobno_and_password(DataTable signupdata){
		List<List<String>>data=signupdata.raw();
	    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(data.get(1).get(0));
	    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(data.get(1).get(1));
	    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(data.get(1).get(2));
	    driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(data.get(1).get(3));
	    
	}

	@Then("^user click on submit button$")
	public void user_click_on_submit_button(){
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
