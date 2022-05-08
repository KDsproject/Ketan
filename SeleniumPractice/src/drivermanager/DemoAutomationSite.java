package drivermanager;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoAutomationSite {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\Workspace\\SeleniumPractice\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.get("http://demo.automationtesting.in/Register.html");
		
		List<WebElement> mainMenu=driver.findElements(By.cssSelector(".navbar-nav>li>a"));
	
		for(int i=0; i<mainMenu.size();i++) {
			System.out.println("*****"+mainMenu.get(i).getText()+"******");
			act.moveToElement(mainMenu.get(i)).perform();
			
		List<WebElement> subMenu = driver.findElements(By.cssSelector(".navbar-nav>li:nth-child("+(i+1)+")>ul>li>a"));
		if(subMenu.size()>0) {
			for(int j=0; j<subMenu.size();j++) {
				System.out.println(subMenu.get(j).getText());
				}
			}else {
				System.out.println("*****************No submenu*****************");
			}
		}
		
	}

}
