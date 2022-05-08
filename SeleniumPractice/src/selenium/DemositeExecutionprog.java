//not working through type

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemositeExecutionprog {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Acceleration\\Workspace\\SeleniumPractice\\Webdrivers\\chromedriver.exe");
		WebDriver driver4=new ChromeDriver();
		driver4.get("https://demosite.executeautomation.com/Login.html");
		System.out.println(driver4.getTitle());
		System.out.println(driver4.getCurrentUrl());
		
//		if(driver4.getCurrentUrl()equals("https://demosite.executeautomation.com/Login.html")) {
//			System.out.println("The URL is correct & opened in chrome");
//		}else {
//			System.out.println("the URL is wrong");
//		}
		
		WebElement usernameinput = driver4.findElement(By.name("Username"));
		usernameinput.sendKeys("");
		WebElement passwordinput = driver4.findElement(By.id("Password"));
		passwordinput.sendKeys("");
		WebElement loginbutton = driver4.findElement(By.name("Login"));
		loginbutton.click();
		driver4.manage().window().maximize();
		Thread.sleep(5000);
		driver4.close();


	}

}
