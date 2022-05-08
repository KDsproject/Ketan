package selenium;*

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class JustinMindallMenu {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Acceleration\\\\Workspace\\\\SeleniumPractice\\\\Webdrivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions a3=new Actions(driver);
		driver.get("https://www.justinmind.com/blog/drop-down-menu-examples/");
		
		List<WebElement> menu=driver.findElements(By.cssSelector(".nav.navbar-nav"));
		
		for(int i=0;i<menu.size();i++) {
			System.out.println("**********"+menu.get(i).getText()+"*********");
			a3.moveToElement(menu.get(i)).perform();
		
		List<WebElement> subMenu=driver.findElements(By.cssSelector(".nav.navbar-nav>li"));
		if(subMenu.size()>0) {
			for(int j=0;j<subMenu.size();j++) {
				System.out.println(subMenu.get(j).getText());
				}
			
			}
		}

	}

}
