package Cucumber.CaseStudy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class scenario2 {
	WebDriver driver;
	
@Given("^open TestMeApp and click SignIn$")
public void open_TestMeApp_and_click_SignIn() throws Throwable {
	driver = UtilityClass.openBrowser("chrome");
	driver.get("http://10.232.237.143:443/TestMeApp/");
	driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
 
}

@When("^user performs login using \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_performs_login_using_and(String arg1, String arg2) throws Throwable {
	pageCS2 page= new pageCS2(driver);
	page.do_login(arg1, arg2);
}

@Then("^logged in Successfully$")
public void logged_in_Successfully() throws Throwable {
	Assert.assertEquals("Home", driver.getTitle());
	driver.close();
}



}
