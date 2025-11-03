package Frugal_Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		//1. Login to Swiggy (Manual OTP Entry Required)
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[1]/div/div/div/a")).click();
		driver.findElement(By.id("mobile")).sendKeys("7317746213");
		driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/form/div[2]/a")).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/div[2]/form/div[2]/div[2]/a")).click();
		
		System.out.println("///////////////////////////////////////////////////////////////////");
		
		//2. Validate Page Title and URL
		System.out.println("Page Title: " + driver.getTitle());
		System.out.println("Current URL: " + driver.getCurrentUrl());
		        
		        System.out.println("///////////////////////////////////////////////////////////////////");
		        
		//3. Enter Location for Delivery
		        driver.findElement(By.xpath("//*[@id=\"location\"]")).sendKeys("Bengaluru");
		        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[2]/div[2]/div[1]/div/div[3]/div[2]/div[2]/div[2]")).click();
		        
		        System.out.println("///////////////////////////////////////////////////////////////////");

		        
		        
	}

}
