package com.demowebshop.My_First_Maven_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation2 {

	public static void main(String[] args) {
		Automation2.register();

	}
	
	public static void register() {
		
		WebDriver driver = WebDriverManager.edgedriver().create();
		driver.get("https://demowebshop.tricentis.com/"); // Launch application 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// Maximum Wait For Opening The Page
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));// Maximum Wait For Loading The Page
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.linkText("Register")).click();// Click Register link
		driver.findElement(By.id("gender-male")).click();// Select Gender
		driver.findElement(By.name("FirstName")).sendKeys("Tom");// Enter First Name
		driver.findElement(By.id("LastName")).sendKeys("Adams");// Enter Last Name
		driver.findElement(By.id("Email")).sendKeys("tomadam@test.com");// Enter Email
		driver.findElement(By.name("Password")).sendKeys("Tom@12345");// Enter Password
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Tom@12345");// Enter Confirm Password
		driver.findElement(By.id("register-button")).click();//Click Register
	}

}
