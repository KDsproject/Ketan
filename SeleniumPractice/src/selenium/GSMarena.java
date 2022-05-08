package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GSMarena {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Acceleration\\\\Workspace\\\\SeleniumPractice\\\\Webdrivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/");
		
		WebElement Menu = driver.findElement(By.cssSelector("a.pad-single.pad-finder"));
		System.out.println(Menu.getText());
		List<WebElement> BrandName = driver.findElements(By.cssSelector("ul>li"));
		System.out.println(BrandName.size());
		
		for(int i=0; i<BrandName.size();i++) {
			System.out.println(BrandName.get(i).getText());
			
		}
	}

}
