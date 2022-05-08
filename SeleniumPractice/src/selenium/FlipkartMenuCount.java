package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class FlipkartMenuCount {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\Workspace\\SeleniumPractice\\Webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions a1=new Actions(driver);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		
		List<WebElement> mainMenu=driver.findElements(By.cssSelector("._37M3Pb>div>a"));
		
		for(int i=0;i<mainMenu.size();i++) {
			System.out.println("*********"+mainMenu.get(i).getText()+"*********");
			a1.moveToElement(mainMenu.get(i)).perform();
		
		List<WebElement> subMenu=driver.findElements(By.cssSelector("._37M3Pb>div:nth-child("+(i+1)+")>a>div>div>div"));
		if(subMenu.size()>0) {
			for(int j=0; j<subMenu.size();j++) {
				System.out.println("####"+subMenu.get(j).getText()+"###");	
				}
			}else {
				System.out.println("********No subMenu*********");
			}
		
		}
		

	}

}
