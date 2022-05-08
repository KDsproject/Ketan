package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Acceleration\\Workspace\\SeleniumPractice\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement createbutton = driver.findElement(By.cssSelector("._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy"));
		createbutton.click();
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Tony");
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Stark");
		WebElement phone = driver.findElement(By.name("reg_email__"));
		phone.sendKeys("7350959767");
		WebElement pass = driver.findElement(By.id("password_step_input"));
		pass.sendKeys("Avengers123");
		
	    WebElement day=driver.findElement(By.cssSelector("._5k_4>span>select:nth-child(1)"));
	    Select day1=new Select(day);
	    System.out.println("is day visible : "+day.isDisplayed());
	    System.out.println("is day Enabled : "+day.isEnabled());  
	    List<WebElement> options = day1.getOptions();
	    System.out.println("size of days: "+options.size());
	    System.out.println(day.getAttribute("Name"));
	    System.out.println("Default Selected Option: "+day1.getFirstSelectedOption().getText());
	    day1.selectByVisibleText("23");
	    
	    WebElement month=driver.findElement(By.cssSelector("._5k_4>span>select:nth-child(2)"));
	    Select month1=new Select(month);
	    System.out.println("is month visible : "+month.isDisplayed());
	    System.out.println("is month Enable : "+month.isEnabled());
	    List<WebElement> opt =month1.getOptions();
	    System.out.println("Size of month: "+opt.size());
	    System.out.println(month.getAttribute("Name"));
	    System.out.println("Default Selected Option; "+month1.getFirstSelectedOption().getText());
	    month1.selectByVisibleText("Jun");
	    
	    WebElement year=driver.findElement(By.cssSelector("._5k_4>span>select:nth-child(3)"));
	    Select year1=new Select(year);
	    System.out.println("is year visible : "+year.isDisplayed());
	    System.out.println("is year Enable : "+year.isEnabled());
	    List<WebElement> opt2 =year1.getOptions();
	    System.out.println("size of year : "+opt2.size());
	    System.out.println(year.getAttribute("Name"));
	    System.out.println("Default Selected Option; "+year1.getFirstSelectedOption().getText());
	    year1.selectByVisibleText("1996");
	    
	    driver.findElement(By.cssSelector("input[value='2']")).click();
	    driver.findElement(By.name("websubmit")).click();
	}

}
