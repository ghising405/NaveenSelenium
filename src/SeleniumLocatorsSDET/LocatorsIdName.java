package SeleniumLocatorsSDET;

/*
 * we have to pass exactly the same value present  inside the html.

 * Class and tagName is used to find more than one element. It is used to find multiple elements
   for example: to find out how many slides are there? or how many links are there in a page? 
   steps: 1) count the sliders. total, there are 5 li class tags. The hierarchy is: li<a<img  = how many sliders are there.
   we have to get all the li items: for that  we have to find common attribute that is available in all the li items
   here class is common in all li (list) items that are representing the slides.
   
   
   
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIdName {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/neeraghisingtamang/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		//1. id and name
		//driver.findElement(By.id("search_query_top")).sendKeys("T-shirt");
		//can also do:
		WebElement searchbox = driver.findElement(By.id("search_query_top"));  //this is about inside search box
		searchbox.sendKeys("T-shirt");
		
		driver.findElement(By.name("submit_search")).click(); //clicks  on search icon
		
		//using linkText: when we  don't see id or name. we have to pass exactly the same value present  inside the html.
		driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		
		//using partial linkText
		driver.findElement(By.partialLinkText("Chiffon Dress")).click();
		
	
		
	}

}
