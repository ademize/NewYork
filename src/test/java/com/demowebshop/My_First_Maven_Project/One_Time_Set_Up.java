package com.demowebshop.My_First_Maven_Project;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class One_Time_Set_Up {

	public static void main(String[] args)throws Exception {
		One_Time_Set_Up.SetUp();

	}
	
	public static void SetUp() throws Exception {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// Maximum Wait For Opening The Page
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));// Maximum Wait For Loading The Page
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		
	}

}
