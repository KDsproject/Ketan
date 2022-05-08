package drivermanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\Workspace\\SeleniumPractice\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		
//		WebElement interactions=driver.findElement(By.cssSelector(".accordion>div:nth-child(5)>span>div>div"));
//		interactions.click();
//		WebElement droppable=driver.findElement(By.cssSelector(".menu-list>*:nth-child(4)>svg"));
//		droppable.click();
		
		Actions ac=new Actions(driver);
		
		WebElement from=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement to=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		ac.dragAndDrop(from, to).perform();
		Thread.sleep(2000);
		driver.quit();

	}

}
