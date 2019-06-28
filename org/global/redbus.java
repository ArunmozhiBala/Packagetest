package org.global;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thevan\\eclipse-workspace\\UST Global\\Lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		WebElement login=driver.findElement(By.xpath("//div[@id='signin-block']"));
		login.click();
		Thread.sleep(3000);
		
		WebElement mobileNo=driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		mobileNo.sendKeys("9840660161");
		Thread.sleep(3000);
	
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String ti=driver.getTitle();
		System.out.println(ti);
	}

}
