package com.mavenTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenDemo1 {
@Test
public void login() {
	System.setProperty("webdriver.chrome.driver", "C:/TestData/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");
	
	driver.findElement(By.xpath("//button")).click();
}
}
