package SeleniumLocatorsSDET;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {
	
	public static void main(String[] args) throws InterruptedException {
		test();
		
	}
	
	
	public static void test() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/neeraghisingtamang/Downloads/chromedriver");
		
		//headless chrome
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options); //launch chrome	
		
		
		
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		
		Thread.sleep(3000);
		
		driver.close();
		
		driver.quit();
		
		System.out.println("completed");
		
		
		
	}

}
