package selenium;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.lang.Iterable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\Workspace\\SeleniumPractice\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		List<WebElement> kd = driver.findElements(By.name("q"));
				
		
		List<WebElement> search1 = driver.findElements(By.cssSelector("div.mkHrUc>ul>div>ul>li"));
		
		System.out.println("Selenium search count is: "+search1.size());
		
		for(WebElement searchoption:search1) {
			String option = searchoption.getText();
			System.out.println("suggested selenium option is: "+option);
		}
	
	}

}
