package org.global;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class  BaseClass {
public static WebDriver driver;

public static WebDriver getDriver() 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Thevan\\eclipse-workspace\\mvnproject\\libraries\\chromedriver.exe");
	 driver=new ChromeDriver();
	return driver;
	}
public static void loadUrl(String url)
	{
	driver.get(url);
	}
public static void type(WebElement element,String name)
{
	element.sendKeys(name);
}
public static void btnclick(WebElement element) {
	element.click();
	}
public static void quitBrowser() {
	driver.quit();
}
public static void title() {
	driver.getTitle();
}
public static void  retriveUrl() {
	driver.getCurrentUrl();
}
public static void  useThread() throws InterruptedException {
	Thread.sleep(3000);
}
public static void  insertText(WebElement element) {
	element.getText();
}
public static void  retriveText(WebElement element, String name) {
	element.getAttribute(name);
}
public static void  dragandDrop(WebElement E1,WebElement E2) {
	new Actions(driver).dragAndDrop(E1,E2).build().perform();
}
public static void  contxtClick(WebElement cc) {
	new Actions(driver).contextClick(cc).perform();
}
public static void  moveElement(WebElement btn) {
	new Actions(driver).moveToElement(btn).perform();
}
public static void  doubleClik(WebElement btn) {
	new Actions(driver).doubleClick(btn).perform();
}
public static void  alert() {
//	new Alert(driver).switchTo().accept();
}
}
