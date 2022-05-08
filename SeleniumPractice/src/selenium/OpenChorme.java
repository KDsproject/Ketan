package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChorme {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				 "D:\\Acceleration\\Workspace\\SeleniumPractice\\Webdrivers\\chromedriver.exe");

		WebDriver  driver = new ChromeDriver();
		
		driver.get("http://WWW.Google.com");
		String title = driver.getTitle();
		
		int titlelength = title.length();
		
		String actualUrl = driver.getCurrentUrl();
		
		System.out.println("The title is : "+title);
		System.out.println("The title length is : "+titlelength);
		System.out.println(actualUrl);
		
		if(actualUrl.equals("https://www.google.com/?gws_rd=ssl")) {
			System.out.println("URL is correct & opened in chrome");
		}else {
			System.out.println("URL is wrong ");
			
//			String pageSource = driver.getPageSource();  
	           
			// Storing Page Source length in Int variable  
//			int pageSourceLength = pageSource.length(); 
//			System.out.println("Total length of the Page Source is : " + pageSourceLength);
			driver.close();
		}
	}

}
