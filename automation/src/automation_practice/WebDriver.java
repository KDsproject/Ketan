package automation_practice;

public class WebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	public static final WebElement Facebook = null;

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


}
