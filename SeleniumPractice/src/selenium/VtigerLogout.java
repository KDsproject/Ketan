package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VtigerLogout {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\Workspace\\SeleniumPractice\\Webdrivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver5 = new ChromeDriver();
		
		driver5.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		System.out.println(driver5.getCurrentUrl());
		
		WebElement userField = driver5.findElement(By.id("username"));
		userField.sendKeys("admin");
		WebElement passField = driver5.findElement(By.id("password"));
		passField.sendKeys("Test@123");
		WebElement login = driver5.findElement(By.className("buttonblue"));
		login.click();
	
	}

}
