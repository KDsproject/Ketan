package drivermanager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyboardOperationFlipkart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\Workspace\\SeleniumPractice\\Webdrivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,20);
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("Mobiles",Keys.ENTER);

		WebElement mobiles=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[6]/div[1]/div[2]/a/div[1]/div"));
		wait.until(ExpectedConditions.elementToBeClickable(mobiles));
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_UP);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_UP);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.chord(Keys.ALT,"F4"));
		
	}

}
