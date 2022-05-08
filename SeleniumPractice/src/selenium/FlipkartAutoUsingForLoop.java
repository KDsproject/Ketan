package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutoUsingForLoop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\Workspace\\SeleniumPractice\\Webdrivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> flipkart = driver.findElements(By.cssSelector("._37M3Pb>div"));
		System.out.println("Option count is:"+flipkart.size());
		List l1 = new ArrayList();
		l1.add("Top Offers");
		l1.add("Grocery");
		l1.add("Mobiles");
		l1.add("Fashion");
		l1.add("Electronics");
		l1.add("Home");
		l1.add("Appliances");
		l1.add("Travel");
		l1.add("Beauty, Toys & More");
		
		for(int i=0;i<flipkart.size();i++) {
		WebElement Commerce= flipkart.get(i);
		System.out.println(Commerce.getText());
		System.out.println(Commerce.isDisplayed());
		System.out.println(Commerce.isEnabled());
		System.out.println(Commerce.getText().equals(l1.get(i)));
		
		}
	}	
}
