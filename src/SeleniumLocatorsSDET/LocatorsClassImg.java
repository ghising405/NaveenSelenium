package SeleniumLocatorsSDET;

import java.util.List;

import org.openqa.selenium.By;

/*
Class and tagName is used to find more than one element. It is used to find multiple elements
  for example: to find out how many slides are there? or how many links are there in a page? 
  steps: 1) count the sliders. total, there are 5 li class tags. The hierarchy is: li<a<img  = how many sliders are there.
  we have to get all the li items: for that  we have to find common attribute that is available in all the li items
  here class is common in all li (list) items that are representing the slides.
  
  Here we will use findElements = this will return multiple webElements but locator must be same for all.
  locator = homeslider-container will be there for multiple elements
  size() = will return number of elements with that particular className = homeslider-container
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LocatorsClassImg {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "/Users/neeraghisingtamang/Downloads/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	
	driver.manage().window().maximize();
	
	//Using className as a locator
	//find out how many slides are there?
	// driver.findElements(By.className("homeslider-container")).size();  //this will identify more than one element and size will find out how many are there
	//storing the number in a variable
	//int sliders = driver.findElements(By.className("homeslider-container")).size(); 
	//System.out.println("the  number of slider is : " +sliders); //5
	
	//using tagName as a locator: sometimes TagName is also same for multiple elements
	//Requirements: how many links are there in a web page?
	//find out: common thing. <a (anchor tag is common for all links).
	//int links = driver.findElements(By.tagName("a")).size(); //this will give  number of all the links
	//System.out.println("the number of link is : "+links);  //149
	
	//get the count and texts in the link
	List<WebElement> linkList =  driver.findElements(By.tagName("a"));
	System.out.println(linkList.size()); //149
	
	//get the texts in the link. whenever we have to print all the texts in the list i.e. arrayList we use For loop
	for(int  i = 0; i<linkList.size(); i++) {
		String linkText  =linkList.get(i).getText();  //get the index and respective texts stored in linkList
		System.out.println(linkText);
	}
	
	
	

	}
}

