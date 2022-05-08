package automation_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Automation {

	private static final WebElement Facebook = null;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Acceleration\\Software\\ChromeDriver\\chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com/");

		Thread.sleep(5000);

		driver.manage().window().maximize();

		Thread.sleep(5000);

		driver.findElement(By.name("name=\"q\"")).click();
		
				
		WebElement search = Facebook;
		search.sendKeys("Facebook");

	}

}
