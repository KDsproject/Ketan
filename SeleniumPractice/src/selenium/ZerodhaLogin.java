package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ZerodhaLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\Workspace\\SeleniumPractice\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		
		WebElement user=driver.findElement(By.xpath("//*[@id=\"userid\"]"));
		user.sendKeys("LF5728");
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		pass.sendKeys("Ketan@9767");
		WebElement login=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[4]/button"));
		login.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement pin=driver.findElement(By.xpath("//*[@id=\"pin\"]"));
		pin.sendKeys("959767");
		WebElement next=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[3]/button"));
		next.click();

	}

}
