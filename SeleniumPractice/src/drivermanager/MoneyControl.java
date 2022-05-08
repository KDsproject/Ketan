package drivermanager;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoneyControl {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\Workspace\\SeleniumPractice\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.moneycontrol.com/stocksmarketsindia/");
		
		WebElement Mutualfund = driver.findElement(By.xpath("/html/body/header/div[1]/div[3]/nav/div/ul/li[8]/a"));
		Mutualfund.click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);

List<WebElement> largecapfund=driver.findElements(By.xpath("//*[@id=\"tbequity\"]/div/div/div[1]/div/table[1]/tbody"));
System.out.println("Larger cap fund list and rank:");
for(int i=0;i<largecapfund.size();i++)
{
	System.out.println(largecapfund.get(i).getText());
}

		
		
//		WebElement Mutualfund = driver.findElement(By.xpath("/html/body/header/div[1]/div[3]/nav/div/ul/li[8]/a"));
//		Mutualfund.click();
//		List<WebElement> cap = driver.findElement(By.xpath("//*[@id=\"tbequity\"]/div/div/div[1]/div/table[1]"));
//		cap.size();
//		System.out.println(driver.getCurrentUrl());
//		
//		List<WebElement> largecapfund=driver.findElements(By.xpath("//*[@id=\"tbequity\"]/div/div/div[1]/div/table[1]/tbody"));
//		largecapfund.size();
	}

}
