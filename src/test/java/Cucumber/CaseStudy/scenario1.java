package Cucumber.CaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class scenario1 {
	WebDriver driver;
	WebDriverWait wait;

	@Given("^Open browser and proceed to TestMe App$")
	public void open_browser_and_proceed_to_TestMe_App() throws Throwable {
		driver = UtilityClass.openBrowser("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	 
	}

	@When("^User enters User Name as \"([^\"]*)\"$")
	public void user_enters_User_Name_as(String arg1) throws Throwable {
	  driver.findElement(By.name("userName")).sendKeys(arg1);
	}

	@When("^User enters First Name as \"([^\"]*)\"$")
	public void user_enters_First_Name_as(String arg1) throws Throwable {
		driver.findElement(By.name("firstName")).sendKeys(arg1);
	}

	@When("^User enters Last Name as \"([^\"]*)\"$")
	public void user_enters_Last_Name_as(String arg1) throws Throwable {
		 driver.findElement(By.name("lastName")).sendKeys(arg1);
	}

	@When("^User enters Password as \"([^\"]*)\"$")
	public void user_enters_Password_as(String arg1) throws Throwable {
		 driver.findElement(By.name("password")).sendKeys(arg1);
	}

	@When("^User enters Confirm Password as \"([^\"]*)\"$")
	public void user_enters_Confirm_Password_as(String arg1) throws Throwable {
		 driver.findElement(By.name("confirmPassword")).sendKeys(arg1);
	}

	@When("^User select gender as \"([^\"]*)\"$")
	public void user_select_gender(String arg1) throws Throwable {
		 driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
	}

	@When("^User enters E -Mail as \"([^\"]*)\"$")
	public void user_enters_E_Mail_as(String arg1) throws Throwable {
		 driver.findElement(By.name("emailAddress")).sendKeys(arg1);
	}

	@When("^User enters Mobile Number as \"([^\"]*)\"$")
	public void user_enters_Mobile_Number_as(String arg1) throws Throwable {
		 driver.findElement(By.name("mobileNumber")).sendKeys(arg1);
	}

	@When("^User enters DOB as \"([^\"]*)\"$")
	public void user_enters_DOB_as(String arg1) throws Throwable {
		 driver.findElement(By.name("dob")).sendKeys(arg1);
	}

	@When("^User enters Address as \"([^\"]*)\"$")
	public void user_enters_Address_as(String arg1) throws Throwable {
		 driver.findElement(By.name("address")).sendKeys(arg1);
	}
	

	@When("^Select the Security question$")
	public void select_the_Security_question() throws Throwable {
		Select secqu= new Select(driver.findElement(By.name("securityQuestion")));
		secqu.selectByVisibleText("What is your Birth Place?");
	}

	@When("^User enters Answer as \"([^\"]*)\"$")
	public void user_enters_Answer_as(String arg1) throws Throwable {
		 driver.findElement(By.name("answer")).sendKeys(arg1);
	}

	@When("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.name("Submit")).click();
	}

	@Then("^Check if TestMe App login page is displayed$")
	public void check_if_application_homepage_is_displayed() throws Throwable {
		WebDriverWait wait= new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Login")));
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Login");
		System.out.println("Logged in Successfully !!");
		driver.close();
	}


}
