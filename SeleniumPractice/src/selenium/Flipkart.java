package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\Workspace\\SeleniumPractice\\Webdrivers\\chromedriver.exe");
		WebDriver driver0= new ChromeDriver();
		driver0.manage().window().maximize();
		driver0.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver0.get("https://www.flipkart.com/");
		
		WebElement TopOffers = driver0.findElement(By.cssSelector("._37M3Pb>div:nth-child(1)"));
		System.out.println(TopOffers.isDisplayed());
		System.out.println(TopOffers.isEnabled());
		System.out.println(TopOffers.getText().equals("Top Offers"));
		
		WebElement Grocery = driver0.findElement(By.cssSelector("._37M3Pb>div:nth-child(2)"));
		System.out.println(Grocery.isDisplayed());
		System.out.println(Grocery.isEnabled());
		System.out.println(Grocery.getText().equals("Grocery"));
		
		WebElement Mobiles = driver0.findElement(By.cssSelector("._37M3Pb>div:nth-child(3)"));
		System.out.println(Mobiles.isDisplayed());
		System.out.println(Mobiles.isEnabled());
		System.out.println(Mobiles.getText().equals("Mobiles"));
		
		WebElement fashion = driver0.findElement(By.cssSelector("._37M3Pb>div:nth-child(4)"));
		System.out.println(fashion.isDisplayed());
		System.out.println(fashion.isEnabled());
		System.out.println(fashion.getText().equals("Fashion"));
		
		WebElement Electronics = driver0.findElement(By.cssSelector("._37M3Pb>div:nth-child(5)"));
		System.out.println(Electronics.isDisplayed());
		System.out.println(Electronics.isEnabled());
		System.out.println(Electronics.getText().equals("Electronics"));
		
		WebElement Home = driver0.findElement(By.cssSelector("._37M3Pb>div:nth-child(6)"));
		System.out.println(Home.isDisplayed());
		System.out.println(Home.isEnabled());
		System.out.println(Home.getText().equals("Home"));
		
		WebElement Appliances = driver0.findElement(By.cssSelector("._37M3Pb>div:nth-child(7)"));
		System.out.println(Appliances.isDisplayed());
		System.out.println(Appliances.isEnabled());
		System.out.println(Appliances.getText().equals("Appliances"));
		
		WebElement Travel = driver0.findElement(By.cssSelector("._37M3Pb>div:nth-child(8)"));
		System.out.println(Travel.isDisplayed());
		System.out.println(Travel.isEnabled());
		System.out.println(Travel.getText().equals("Travel"));
		
		WebElement BeautyToysMore = driver0.findElement(By.cssSelector("._37M3Pb>div:nth-child(9)"));
		System.out.println(BeautyToysMore.isDisplayed());
		System.out.println(BeautyToysMore.isEnabled());
		System.out.println(BeautyToysMore.getText().equals("Beauty, Toys & More"));
	}

}
