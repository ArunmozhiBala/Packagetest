package org.global;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thevan\\eclipse-workspace\\UST Global\\Lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement textusername=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		textusername.sendKeys("Greens Velmurugan");
		Thread.sleep(3000);
		String name=textusername.getAttribute("value");
		System.out.println(name);
		WebElement srchbtn=driver.findElement(By.xpath("//input[contains(text(),'Google Search']"));
		srchbtn.click();
		Thread.sleep(3000);
		//WebElement textpassword=driver.findElement(By.id("password"));
		//textpassword.sendKeys("password");
		//String pass=textpassword.getAttribute("value");
		//System.out.println(pass);
			String url=driver.getCurrentUrl();
		System.out.println(url);
		String ti=driver.getTitle();
		System.out.println(ti);
	}

}



