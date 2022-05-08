package drivermanager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragndropJquery {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\Workspace\\SeleniumPractice\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		
		WebElement src=driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
		WebElement dst=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		act.dragAndDrop(src, dst).perform();

	}

}
