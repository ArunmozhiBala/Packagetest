package org.global;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollUpdown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Thevan\\eclipse-workspace\\UST Global\\Lib\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
	
WebElement down=driver.findElement(By.xpath("//a[text()='Subscribe in a reader']"));

JavascriptExecutor js=(JavascriptExecutor)driver;

//down
js.executeScript("arguments[0].scrollIntoView(true)",down);


WebElement up=driver.findElement(By.xpath("//button[text()='Simple Alert']"));

//down
js.executeScript("arguments[0].scrollIntoView(false)",up);

}
}
