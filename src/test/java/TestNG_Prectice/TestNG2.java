package TestNG_Prectice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG2 {
	
	
	@Test
	public void test2() throws Exception {
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://demowebshop.tricentis.com/"); // Launch application 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// Maximum Wait For Opening The Page
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));// Maximum Wait For Loading The Page
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.linkText("Register")).click();// Click Register link
		driver.findElement(By.id("gender-male")).click();// Select Gender
		driver.findElement(By.name("FirstName")).sendKeys("Tom");// Enter First Name
		driver.findElement(By.id("LastName")).sendKeys("Adams");// Enter Last Name
		driver.findElement(By.id("Email")).sendKeys("tomadam14@test.com");// Enter Email
		driver.findElement(By.name("Password")).sendKeys("Tom@12345");// Enter Password
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Tom@12345");// Enter Confirm Password
		driver.findElement(By.id("register-button")).click();//Click Register
		// Verify register complete
		Thread.sleep(4000);
		boolean Y = driver.findElement(By.xpath("//div[contains(text(), ' completed')]")).isDisplayed();
		Assert.assertTrue(Y);
	}

}
