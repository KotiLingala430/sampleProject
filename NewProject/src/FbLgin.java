
public class FbLgin {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/ACER/eclipse-workspace/demo1/drivers/chromedriver_win32 (8)/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("kotilingala15@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("pass1234");
        Thread.sleep(5000);
        driver.close();

	}

}
