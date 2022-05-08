package selenium;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoblazeAuto {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\Workspace\\SeleniumPractice\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/");
		
		List<WebElement> element = driver.findElements(By.cssSelector(".list-group>a"));
		System.out.println("The option count is :"+element.size());
		List l2 = new ArrayList();
		l2.add("CATEGORIES");
		l2.add("Phones");
		l2.add("Laptops");
		l2.add("Monitors");
		
		for(int i=0;i<element.size();i++ ) {
			WebElement kd =element.get(i);
			System.out.println(kd.getText());
			System.out.println(kd.isDisplayed());
			System.out.println(kd.isEnabled());
			System.out.println(kd.getText().equals(l2.get(i)));
		}
		

	}

}
