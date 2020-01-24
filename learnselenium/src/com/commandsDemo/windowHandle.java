package com.commandsDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Windows.html");
	driver.manage().window().maximize();
	System.out.println("the title of main window is:"+driver.getTitle());
	//WebElement tabWindow=driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]"));
	//tabwindow.click(); or
	driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")).click();
	Set<String>windowids=driver.getWindowHandles();
	Iterator<String>iter=windowids.iterator();
	String mainWindow=iter.next();
	String childWindow=iter.next();
	driver.switchTo().window(childWindow);
	System.out.println("title of child window is :"+driver.getTitle());
	driver.close();
	driver.switchTo().window(mainWindow);
	System.out.println("title of main window is :"+driver.getTitle());
	
		}

}
