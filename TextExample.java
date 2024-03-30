

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextExample {
	
	public static void main(String args[]) {
		
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/input.xhtml");
		
		//type your name
		WebElement nameBox= driver.findElement(By.id("j_idt88:name"));
		nameBox.sendKeys("bala");
		
		//append the name
		WebElement appendBox = driver.findElement(By.id("j_idt88:j_idt91"));
		appendBox.sendKeys("India");
		
		//get default text entered
		WebElement getTextBox = driver.findElement(By.id("j_idt88:j_idt97"));
		String value = getTextBox.getAttribute("value");
		System.out.println(value);
		
		//clear the text in text box
		WebElement clearBox = driver.findElement(By.id("j_idt88:j_idt95"));
		clearBox.clear();
		
		//check for enabled or disabled
		WebElement disabledOption = driver.findElement(By.id("j_idt88:j_idt93"));
		boolean valeAnswer = disabledOption.isEnabled();
		System.out.println(valeAnswer);
		
	}
}
