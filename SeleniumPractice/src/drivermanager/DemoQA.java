package drivermanager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQA {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\Workspace\\SeleniumPractice\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.cssSelector("svg[stroke='currentColor']")).click();
		driver.findElement(By.xpath("//*[@id=\"item-0\"]")).click();
		driver.findElement(By.cssSelector("#userName")).sendKeys("Ketan Dhende",Keys.TAB);
		driver.findElement(By.cssSelector("#userEmail")).sendKeys("dhendeketan@gmail.com",Keys.TAB);
		driver.findElement(By.cssSelector("#currentAddress")).sendKeys("Pune,Kharadi",Keys.TAB);
		driver.findElement(By.cssSelector("#permanentAddress")).sendKeys("Pune,Kharadi",Keys.TAB);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#submit")).click();
//		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ENTER);
	
	
		
	}

}
