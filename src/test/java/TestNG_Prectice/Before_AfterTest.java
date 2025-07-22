package TestNG_Prectice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Before_AfterTest {
	WebDriver driver;
	@BeforeTest
	public void srtUP() { // Gas, Oil Change
		driver = WebDriverManager.chromedriver().create();
		driver.get("https://demowebshop.tricentis.com/"); // Launch application 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// Maximum Wait For Opening The Page
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));// Maximum Wait For Loading The Page
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	@Test // You are driving
	public void loginstep() throws Exception {
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();// Click Login link
		driver.findElement(By.id("Email")).sendKeys("dallas@test.com");//Enter user email
		driver.findElement(By.name("Password")).sendKeys("Dallas12354");//Enter password 
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();//Click login button
		
	}
	@Test // You are driving
	public void loginstep2() throws Exception {
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();// Click Login link
		driver.findElement(By.id("Email")).sendKeys("dallas@test.com");//Enter user email
		driver.findElement(By.name("Password")).sendKeys("Dallas12354");//Enter password 
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();//Click login button
		
	}
	@AfterTest // Wash car
	public void CloseTest() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

}
