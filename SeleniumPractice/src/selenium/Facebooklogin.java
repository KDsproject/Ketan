package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Acceleration\\Workspace\\SeleniumPractice\\Webdrivers\\chromedriver.exe");
		WebDriver driver4=new ChromeDriver();
		driver4.get("https://www.facebook.com/?stype=lo&jlou=AffP-MKdUysGqp3WJEMz_q4R6Mx3nUKt8WHldX1Zs2SQ1OVg6g-4qACDrZutkVyuECmYAZZcB4idUGyB9COmOKwRnRVUikk-0eZ7rqGGMx56nw&smuh=38834&lh=Ac-V76B_7jnbv1G-jik");
		System.out.println(driver4.getTitle());
		System.out.println(driver4.getCurrentUrl());
		
//		if(driver4.getCurrentUrl()equals("https://www.facebook.com/?stype=lo&jlou=AffP-MKdUysGqp3WJEMz_q4R6Mx3nUKt8WHldX1Zs2SQ1OVg6g-4qACDrZutkVyuECmYAZZcB4idUGyB9COmOKwRnRVUikk-0eZ7rqGGMx56nw&smuh=38834&lh=Ac-V76B_7jnbv1G-jik")) {
//			System.out.println("The URL is correct & opened in chrome");
//		}else {
//			System.out.println("the URL is wrong");
//		}
		
		WebElement usernameinput = driver4.findElement(By.id("email"));
		usernameinput.sendKeys("7350959767");
		WebElement passwordinput = driver4.findElement(By.id("pass"));
		passwordinput.sendKeys("KETANDADA7387");
		WebElement loginbutton = driver4.findElement(By.name("login"));
		loginbutton.click();
		driver4.manage().window().maximize();
//		Thread.sleep(5000);
//		driver4.close();

	}

}
