

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {
	
	public static void main(String args[]) {
	
	WebDriver driver= new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
    driver.manage().window().maximize();
    driver.get("https://www.leafground.com/link.xhtml");
    
    //driver.findElement(By.linkText("Go to Dashboard")).click();
    
    driver.findElement(By.partialLinkText("Dashboard")).click();
    
    
	}
	

}
