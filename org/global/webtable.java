package org.global;

import java.Util;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thevan\\eclipse-workspace\\mvnproject\\libraries\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		List<WebElement> trow = driver.findElements(By.tagName("tr"));
		int s =trow.size();
		System.out.println(s);
		for( int i=0;i<trow.size();i++) {
			WebElement row= trow.get(i);
			List<WebElement> tdata= row.findElements(By.tagName("td"));
			for(int j=0;j<tdata.size();j++) {
				WebElement data=tdata.get(j);
				String text =data.getText();
				System.out.println(text);
			}
		}
	}

}
