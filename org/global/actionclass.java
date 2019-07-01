package org.global;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thevan\\eclipse-workspace\\UST Global\\Lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement btngmail=driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions acc=new Actions(driver);
		acc.contextClick(btngmail).perform();
		
		Robot r= new Robot();
		//Key Press
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
