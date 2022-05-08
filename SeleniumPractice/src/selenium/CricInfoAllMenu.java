package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CricInfoAllMenu {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\Workspace\\SeleniumPractice\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions a2=new Actions(driver);
		driver.get("https://www.espncricinfo.com/");
		
		List<WebElement> Menu = driver.findElements(By.xpath("//*[@id=\"main-container\"]/div[3]/div/nav/div/div/div/div[2]/div[1]"));
		System.out.println(Menu.size());
		for(int i=0; i<Menu.size();i++) {
			System.out.println(Menu.get(i).getText());
			a2.moveToElement(Menu.get(i)).perform();
			Thread.sleep(1000);
		List<WebElement> subMenu=driver.findElements(By.xpath("//*[@id=\"tippy-1\"]/div/div[1]/div/div/div/ul/li/a"));
		if(subMenu.size()>0) {
			for(int j=0; j<subMenu.size(); j++) {
				System.out.println(subMenu.get(j).getText());
				a2.moveToElement(subMenu.get(j)).perform();
			
			}
		}else {
			System.out.println("************No SubMenu***********");
			}
		}

	}

}
