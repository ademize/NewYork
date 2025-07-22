package CrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	
	WebDriver driver;
	//ChromeOptions chrome= new ChromeOptions();
	//FirefoxOptions firefoxOptions = new FirefoxOptions();
	//EdgeOptions edgeOptions = new EdgeOptions();
  
	
	@Parameters("browser")
	@BeforeTest
  public void init(String browser) {
	  if(browser.equalsIgnoreCase("firefox")) {
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
		  System.out.println("Luanching Firefox Browser");
		  
	  }
	  else if(browser.equalsIgnoreCase("chrome")){
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  System.out.println("Luanching Chrome Browser");
		  
	  }
	  else if(browser.equalsIgnoreCase("edge")){
		  WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		  System.out.println("Luanching Edge Browser");
		  
	  }
	  
	  
  }
	
	
	@Test
	public void Login() {
		driver.get("https://demowebshop.tricentis.com/");
		String actual = driver.getTitle();
		String expected = "Demo Web Shop";
		Assert.assertEquals(actual, expected);
  }
	@AfterTest
	public void closeT() {
		driver.close();
	}
}
