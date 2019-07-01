package org.global;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshanlding {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thevan\\eclipse-workspace\\UST Global\\Lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		WebElement type=driver.findElement(By.xpath("//"))

}
}
