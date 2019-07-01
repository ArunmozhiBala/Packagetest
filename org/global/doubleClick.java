package org.global;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thevan\\eclipse-workspace\\UST Global\\Lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement uname=driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("pass"));
		WebElement btngmail=driver.findElement(By.xpath("//input[@value='Log In']"));
		uname.sendKeys("arunmozhi");
		password.sendKeys("password");
		
		Actions acc=new Actions(driver);
		acc.doubleClick(btngmail).perform();
		
	}
}
