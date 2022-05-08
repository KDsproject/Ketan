package selenium;

import java.util.List;
import java.awt.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\Workspace\\SeleniumPractice\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		
		WebElement element = driver.findElement(By.id("src"));
		element.sendKeys("Pune");
		
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"dest\"]"));
		element1.sendKeys("Goa");
		
		WebElement element3 = driver.findElement(By.cssSelector(".db.text-trans-uc"));
		element3.click();
		
		WebElement element4 = driver.findElement(By.cssSelector(".next"));
		element4.click();
		
		WebElement element5 = driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[5]/td[1]"));
		element5.click();
		
		WebElement element6 = driver.findElement(By.cssSelector(".selected"));
		element6.click();
		
		WebElement element7 = driver.findElement(By.cssSelector(".fl.button"));
		element7.click();
		
		WebElement element8 = driver.findElement(By.xpath("//*[@id=\"filter-block\"]/div/div[2]/ul[2]/li[4]/label[1]"));
		element8.click();
		
		WebElement element9 = driver.findElement(By.xpath("//*[@id=\"filter-block\"]/div/div[2]/ul[3]/li[3]/label[1]"));
		element9.click();
		
		List<WebElement> BusName = driver.findElements(By.xpath("//*[@id=\"result-section\"]/div/ul"));
		System.out.println(BusName.size());
		for(int i=0;i<BusName.size();i++) {
			System.out.println(BusName.get(i).getText());
		}
	}

}
