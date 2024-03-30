

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingById {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/buttons.html");
		
		driver.findElement(By.id("btn_one")).click();
		
	}

}
