package drivermanager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GlobalSQA {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\Workspace\\SeleniumPractice\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.globalsqa.com/demo-site/");
		Actions act=new Actions(driver);
		List<WebElement> menu=driver.findElements(By.cssSelector("div[id='menu']"));
		System.out.println(menu.size());
		for(int i=0;i<menu.size();i++) {
			System.out.println(menu.get(i).getText());
//			act.moveToElement(option).perform();
		Thread.sleep(1000);
		}

	}

}
