package org.global;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thevan\\eclipse-workspace\\UST Global\\Lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.gettyimages.in/");
		driver.manage().window().maximize();
		
		WebElement homeAppl=driver.findElement(By.xpath("//a[@class='text-link--sly action--with-emphasis is-selected']"));
		Actions acc2=new Actions(driver);
		acc2.moveToElement(homeAppl).perform();
		Thread.sleep(4000);
		
		
		//WebElement homeAppl1=driver.findElement(By.xpath("//a[@data-nav='nav_Editorial_EditorialPhotos']"));
		//Actions acc3=new Actions(driver);
		//acc3.moveToElement(homeAppl1).perform();
	
		
		//driver.quit();
	
	}

}
