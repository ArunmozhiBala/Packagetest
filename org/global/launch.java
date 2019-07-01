package org.global;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class launch {
	
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Thevan\\eclipse-workspace\\UST Global\\Lib\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.greenstechnologys.com/");
Thread.sleep(3000);
WebElement textusername=driver.findElement(By.xpath("//a[@href='contact.php']"));
textusername.click();
Thread.sleep(3000);
WebElement name=driver.findElement(By.id("InputName"));
name.sendKeys("arunmozhi");
WebElement email=driver.findElement(By.name("email"));
email.sendKeys("arunmozhi@gmail");
WebElement mobNo=driver.findElement(By.name("phone"));
mobNo.sendKeys("9840660161");
WebElement coursedropbox=driver.findElement(By.name("courses"));
coursedropbox.click();
Thread.sleep(3000);
WebElement course=driver.findElement(By.xpath("//option[@value='JAVA/J2EE']"));
course.click();
Thread.sleep(3000);
WebElement branchdrpbox=driver.findElement(By.name("branch"));
branchdrpbox.click();
Thread.sleep(3000);
WebElement branch=driver.findElement(By.xpath("//option[@value='OMR']"));
branch.click();
Thread.sleep(3000);
WebElement timingdrp=driver.findElement(By.name("time"));
timingdrp.click();
Thread.sleep(3000);
WebElement time=driver.findElement(By.xpath("//option[@value='In a Month']"));
time.click();
Thread.sleep(3000);
WebElement comments=driver.findElement(By.xpath("//textarea[@name='comments']"));
comments.sendKeys("intrestes in java j2ee course and like to know the details reachout me @ 9840660161");
WebElement submitbtn=driver.findElement(By.xpath("//button[@id='submit']"));
submitbtn.click();

String url=driver.getCurrentUrl();
System.out.println(url);
String ti=driver.getTitle();
System.out.println(ti);
//added code for quit browser
driver.quit();
}
}


