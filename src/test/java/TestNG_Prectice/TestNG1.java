package TestNG_Prectice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG1 {
	
	@Test
	public void test1() throws Exception {
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://demowebshop.tricentis.com/"); // Launch application 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// Maximum Wait For Opening The Page
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));// Maximum Wait For Loading The Page
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();// Click Login link
		driver.findElement(By.id("Email")).sendKeys("dallas@test.com");//Enter user email
		driver.findElement(By.name("Password")).sendKeys("Dallas12354");//Enter password 
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();//Click login button
		Thread.sleep(5000);
		// Verify user login successfully 
		boolean t = driver.findElement(By.xpath("//a[text()='dallas@test.com']")).isDisplayed();
		Assert.assertTrue(t);
		
	}

}
