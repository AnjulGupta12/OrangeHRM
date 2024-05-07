package com.OrangeHRM.pages;

import com.OrangeHRM.base.TestBase;

import org.openqa.selenium.By;

public class LogOut extends TestBase{
	
	By ProfileClick = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p");
	By LogOutClick = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a");
	
	public void logout()
	{
		wait(300);
		driver.findElement(ProfileClick).click();
		wait(1000);
		driver.findElement(LogOutClick).click();
		wait(2000);
	}
}