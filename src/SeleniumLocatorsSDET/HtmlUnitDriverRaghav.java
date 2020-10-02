package SeleniumLocatorsSDET;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HtmlUnitDriverRaghav {

	public static void main(String[] args) {
		
		HtmlUnitDriver  driver = new HtmlUnitDriver(BrowserVersion.EDGE);
		
		driver.get("https://www.selenium.dev/");
		
		System.out.println("The title is : " + driver.getTitle());
		
		driver.quit(); 
		
	}

}
