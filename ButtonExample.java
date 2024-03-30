

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String args[]) {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.drivert", "chromedriver.exe");
		driver.get("https://letcode.in/buttons");
		driver.manage().window().maximize();
		
		//1.Get x , y coordinates
		WebElement getPositionButton  = driver.findElement(By.id("position"));
		Point xypoint = getPositionButton.getLocation();
		int xValue = xypoint.getX();
		int yValue = xypoint.getY();
		System.out.println("X value is : " +xValue+ "Y value is : " +yValue);
		
		//2.Get the color of the button.
		WebElement colorButton = driver.findElement(By.id("color"));
		String color = colorButton.getCssValue("background-color");
		System.out.println("Button color is : " +color);
		
		//3.Find the size of the button
		WebElement sizeOfButton = driver.findElement(By.id("property"));
		int height = sizeOfButton.getSize().getHeight();
		int width = sizeOfButton.getSize().getWidth();
		System.out.println("Height is : " +height+"Width is : "+width);
		
		//4.Go to Home
		WebElement homeButton = driver.findElement(By.id("home"));
		homeButton.click();
		
	}
}
