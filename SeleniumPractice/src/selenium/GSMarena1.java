package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GSMarena1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\Workspace\\SeleniumPractice\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/");
		
		WebElement element = driver.findElement(By.cssSelector(".pad-single.pad-finder"));
		String l1 = element.getText();
		System.out.println(l1);
		String l2= driver.getTitle();
		System.out.println(l2);
		System.out.println(l2.equals("GSMArena.com - mobile phone reviews, news, specifications and more..."));
		
		List<WebElement> BrandName = driver.findElements(By.cssSelector("div.brandmenu-v2.light.l-box.clearfix>ul>li"));
		System.out.println(BrandName.size());
		for(int i=0;i<BrandName.size();i++) {
			System.out.println(BrandName.get(i).getText());
		}
		
		WebElement Apple = driver.findElement(By.xpath("//*[@id=\"body\"]/aside/div[1]/ul/li[2]/a"));
		Apple.click();
		
//		List<WebElement> applect = driver.findElements(By.xpath("//*[@id=\"review-body\"]/div[1]/ul/li"));
//		System.out.println(applect.size());
//		for(int i=0;i<applect.size();i++) {
//			System.out.println(applect.get(i).getText());
//		}
		
	}
}
