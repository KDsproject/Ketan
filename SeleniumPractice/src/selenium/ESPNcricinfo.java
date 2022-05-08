package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ESPNcricinfo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\Workspace\\SeleniumPractice\\Webdrivers\\chromedriver.exe");
		WebDriver cdriver = new ChromeDriver();
		cdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		cdriver.get("https://www.espncricinfo.com/");
		
		List<WebElement> Mainmenu = cdriver.findElements(By.cssSelector(".ds-popper-wrapper>a"));
		System.out.println("main menu size: "+Mainmenu.size());
		
		for(int i=0; i<Mainmenu.size();i++) {
			System.out.println(Mainmenu.get(i).getText());
		}

	}

}
