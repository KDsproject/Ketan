package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFacebook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				 "D:\\Acceleration\\Workspace\\SeleniumPractice\\Webdrivers\\chromedriver.exe");

		WebDriver  driver = new ChromeDriver();
		
		driver.get("http://WWW.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		
		
//		System.setProperty("webdriver.chrome.driver",
//				 "D:\\Acceleration\\Workspace\\SeleniumPractice\\Webdrivers\\chromedriver.exe");
		
		WebDriver  driver1 = new ChromeDriver();
		
		driver1.get("https://www.youtube.com");
		driver1.manage().window().maximize();
		Thread.sleep(5000);
		driver1.close();

	}

}
