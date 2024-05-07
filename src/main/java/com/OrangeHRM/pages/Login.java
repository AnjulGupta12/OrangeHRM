package com.OrangeHRM.pages;

import com.OrangeHRM.base.TestBase;

import org.openqa.selenium.By;

public class Login extends TestBase{
	
	By username = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
	By password = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
	By loginbtn = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	
	
	public void login(String uName, String pwd)
	{
		wait(1000);
		driver.findElement(username).clear();
		wait(300);
		driver.findElement(username).sendKeys(uName);
		driver.findElement(password).clear();
		wait(300);
		driver.findElement(password).sendKeys(pwd);
		wait(1000);
		driver.findElement(loginbtn).click();
		System.out.println("LogIn Successful");
		wait(3000);
	}
	
}