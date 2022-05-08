package drivermanager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDropW3school {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\Workspace\\SeleniumPractice\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions act=new Actions(driver);
//		driver.switchTo().frame(0);
		WebElement drag=driver.findElement(By.cssSelector("#drag1"));
		WebElement drop=driver.findElement(By.cssSelector("div[id='div1']"));
		
		act.dragAndDrop(drag, drop).perform();
//		Thread.sleep(2000);
		driver.close();
	}

}
