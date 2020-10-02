package SeleniumLocatorsSDET;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * CssSelector (cascading style sheets) - customized locator
 * different combinations:
 * 1. tag and id ; tag#id ; "input#email" or "#email"
 * 2. tag and class; tag.class ; "input.email" or ".email"
 * 3. tag and attribute; attribute can be anything.
 	  tag["attribute=value"] ; "input[name=email]"; or "[name=email]" 
 * 4. tag, class and attribute: this is used when tag and class is same and we have to distinguish
 */

public class LocatorCssSelector {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/neeraghisingtamang/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//tag and id
		//driver.findElement(By.cssSelector("#email")).sendKeys("abc@gmail.com");
		//driver.findElement(By.cssSelector("input#email")).sendKeys("abc@gmail.com");
		
		
		//tag and class
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("david");
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("david");
		
		//tag and attribute: attribute can be anything in the element.
		//driver.findElement(By.cssSelector("input[name=email]")).sendKeys("peter");
		//driver.findElement(By.cssSelector("[name=email]")).sendKeys("peter");
		
		//tag, class and attribute: when tag and class is same for both then to distinguish we use attribute
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("smith");
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("abc");
	
	}

}
