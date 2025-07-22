package com.demowebshop.My_First_Maven_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EndToEnd {

	public static void main(String[] args) {
		EndToEnd.EndTOEnd_Test();

	}
	public static void EndTOEnd_Test() {
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://demowebshop.tricentis.com/"); // Launch application 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// Maximum Wait For Opening The Page
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));// Maximum Wait For Loading The Page
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		// This a Registration Script 
		driver.findElement(By.linkText("Register")).click();// Click Register link
		driver.findElement(By.id("gender-male")).click();// Select Gender
		driver.findElement(By.name("FirstName")).sendKeys("Tom");// Enter First Name
		driver.findElement(By.id("LastName")).sendKeys("Adams");// Enter Last Name
		driver.findElement(By.id("Email")).sendKeys("adamtom1@test.com");// Enter Email
		driver.findElement(By.name("Password")).sendKeys("Tom@12345");// Enter Password
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Tom@12345");// Enter Confirm Password
		driver.findElement(By.id("register-button")).click();//Click Register
		
		driver.findElement(By.xpath("//a[text()='Log out']")).click(); // Login out
		// This a Login Script
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();// Click Login link
		driver.findElement(By.id("Email")).sendKeys("adamtom1@test.com");//Enter user email
		driver.findElement(By.name("Password")).sendKeys("Tom@12345");//Enter password 
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();//Click login button
	}

}
