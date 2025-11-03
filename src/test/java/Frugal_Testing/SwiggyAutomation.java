package Frugal_Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwiggyAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();

		//1. Login to Swiggy (Manual OTP Entry Required)
		driver.get("https://www.swiggy.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/ul/li[2]/div")).click();
		driver.findElement(By.id("mobile")).sendKeys("7317746213");
		driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/form/div[2]/a")).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/div[2]/form/div[2]/div[2]/a")).click();
		
		
		
		//2. Validate Page Title and URL
		System.out.println("Page Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        
        
        
        //3. Enter Location for Delivery
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div[2]/div[2]/div/input")).sendKeys("LPU");
        driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div[3]/div/div/div[1]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div[3]/a[2]"))).click();
            
        
        
       //4. Search for a Restaurant
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/ul/li[5]/div")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div[1]/div/form/div/div[1]/input"))).sendKeys("Domino’s Pizza");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/div/button[1]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/div/div[3]/div[1]"))).click();
        
      
        
        //5. Select a Food Item
        WebElement menu = wait.until(
        	    ExpectedConditions.elementToBeClickable(By.cssSelector("#browse-menu-btn"))
        	);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", menu);

        
        WebElement pizzaMania = wait.until(
        	    ExpectedConditions.elementToBeClickable(
        	        By.xpath("//div[@data-testid='nav-cid-PIZZA_MANIA']")
        	    )
        	);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", pizzaMania);

        WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(
        	    By.xpath("//*[@id=\"cid-PIZZA_MANIA\"]/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div/div[1]/div/button[2]/div"))
        	);
        
        // Use JS click to avoid interception
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addButton);
        
        
        WebElement continueBtn = wait.until(
        	    ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-testid='menu-customize-continue-button']"))
        	);
        	Actions actions = new Actions(driver);
        	actions.moveToElement(continueBtn).click().perform(); // single click
        	
        	
        	WebElement addItemBtn = wait.until(
        	        ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-cy='customize-footer-add-button']"))
        	);

        	// Option 1: normal click
        	Actions actions1 = new Actions(driver);
        	actions1.moveToElement(addItemBtn).click().perform();
        	
        	WebElement viewCartBtn = wait.until(ExpectedConditions.presenceOfElementLocated(
        	        By.id("view-cart-btn"))
        	);

        	// Use JS click to avoid interception / hidden issues
        	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", viewCartBtn);
        	((JavascriptExecutor) driver).executeScript("arguments[0].click();", viewCartBtn);


        	//6. Increase the Quantity of the Item
        	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.BbiqG"))).click();
        	wait.until(ExpectedConditions.elementToBeClickable(By.className("hoJL8"))).click();

        	
        	System.out.println("Page Title: " + driver.getTitle());
        	//7. Enter Delivery Address
        	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div[3]")).click();
         	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"building\"]"))).sendKeys("123A, Green View Apartments");
         	driver.findElement(By.xpath("//*[@id=\"area\"]")).sendKeys("Low gates");
         	driver.findElement(By.xpath("//*[@id=\"landmark\"]")).sendKeys("Near City Mall");
         	driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div[3]/div[3]/div[5]/div[1]")).click();
         	driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div[4]/div/div/a")).click();


         	
         	//8.Proceed to Payment Page
         	WebElement loginBtn = wait.until(
         		    ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/ul/li[2]/div"))
         		);
         	((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginBtn);
         	
         	WebElement paymentHeader = wait.until(
         		    ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h4[data-testid='header_title']"))
         		);

         		System.out.println("Payment page loaded successfully: " + paymentHeader.getText());
         		System.out.println("Current URL: " + driver.getCurrentUrl());
         
        

	}

}
