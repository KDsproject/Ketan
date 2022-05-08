package drivermanager;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import utilities.SeleniumUtility;
public class GlobalSQAmouseOperation {

	public static void main(String[] args) throws InterruptedException {
//		SeleniumUtility s1=new SeleniumUtility();
//		WebDriver driver=s1.setUp("Chrome","D:\\Acceleration\\Workspace\\SeleniumPractice\\Webdrivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\\\Acceleration\\\\Workspace\\\\SeleniumPractice\\\\Webdrivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions a1=new Actions(driver);
		driver.get("http://www.globalsqa.com/demo-site/");
		//identify all the elements of main menu
		List<WebElement> mainMenu=driver.findElements(By.cssSelector("div[id='menu']"));
//		System.out.println(mainMenu.size());
		for(int i=0;i<mainMenu.size();i++) {
//			System.out.println(mainMenu.get(i).getText();
			a1.moveToElement(mainMenu.get(i)).perform();
			Thread.sleep(2000);
		}
		
		
	}

}
