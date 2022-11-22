package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nick PCG\\selenium\\1st_Selenium\\drivers\\chromedriver.exe");
		// Object create of WebDriver
		WebDriver driver = new ChromeDriver(); // object variable 
		// go to web site
		driver.get("https://www.google.com/");
		//Stop execution
		//Thread.sleep(3000);
		//go to web site
		//driver.get("https://www.amazon.com/");
		//maximize the browser
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("selenium ");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		
		//Stop execution
		Thread.sleep(3000);
		//close browser
		driver.close();
		
		
		
		
		
		
		
	}
	
}
