

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleChrome {
	
	public static void main(String args[]) {
	
	WebDriver driver= new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in");
	driver.findElement(By.name("q")).sendKeys("selenium"+Keys.ENTER);
	//driver.close();
	}
	

}
