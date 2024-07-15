package TestCases;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Edge {

	public static void main(String[] args) {
		
		
		WebDriver driver = new EdgeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open URL application
		driver.get("https://demoqa.com/buttons");

		// Maximize window
		driver.manage().window().maximize();

		// Get element color
		String color = driver.findElement(By.id("doubleClickBtn")).getCssValue("background-color");
		Color color1 = Color.fromString(color);
		String actualColor = color1.asHex();
		
		Assert.assertEquals(actualColor, "#007bff");
		System.out.println(" The color of the elemnt is: " + actualColor);
		
		driver.quit();

	}

}
