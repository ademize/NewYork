package com.demowebshop.My_First_Maven_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation1 {

	public static void main(String[] args) throws Exception{
		Automation1 obj = new Automation1();
		obj.auto1();

	}
	
	public void auto1() throws Exception {
		
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
	}

}
