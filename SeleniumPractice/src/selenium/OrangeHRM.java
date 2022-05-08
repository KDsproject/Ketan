package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:\\Acceleration\\Workspace\\SeleniumPractice\\Webdrivers\\chromedriver.exe");
		
		WebDriver driver2 = new ChromeDriver();
		
		driver2.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		System.out.println(driver2.getTitle());
		
		driver2.manage().window().maximize();
		String title = driver2.getTitle();
		
		int titlelength = title.length();
		String actualUrl = driver2.getCurrentUrl();
		System.out.println(actualUrl);
		
		if(actualUrl.equals("https://opensource-demo.orangehrmlive.com/index.php/dashboard")) {
			System.out.println("URL is correct & opened in chrome");
		}else {
			System.out.println("URL is wrong ");
		}
//			String pageSource = driver2.getPageSource();
//			
//			int pageSourceLength = pageSource.length(); 
//			System.out.println("Total length of the Page Source is : " + pageSourceLength);
		
	    	WebElement userNameInputField = driver2.findElement(By.id("txtUsername"));
	    	userNameInputField.sendKeys("Admin");
	    	WebElement pwdInputField = driver2.findElement(By.name("txtPassword"));
	    	pwdInputField.sendKeys("admin123");
	    	WebElement loginButton = driver2.findElement(By.id("btnLogin"));
	    	loginButton.click();
//	    	Thread.sleep(10000);
//	    	driver2.close();

	}

}
