package Cucumber.CaseStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class UtilityClass {
	static WebDriver driver;
	public static WebDriver openBrowser(String browsername)
	{
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\t.selvarajan\\New folder\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", 
					"C:\\t.selvarajan\\New folder\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("Ie"))
		{
			System.setProperty("webdriver.ie.driver",
					"C:\\t.selvarajan\\New folder\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		return driver;
	}

}
