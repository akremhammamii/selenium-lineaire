package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillFieldUsingJSE {

	public static void main(String[] args) {
		
		// Open chrome browser
				WebDriver driver = new ChromeDriver();

				// Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				// Open URL application
				driver.get("https://demoqa.com/text-box");

				// Maximize window
				driver.manage().window().maximize();
				// retrieve elements / identify web elements  
				WebElement fullName = driver.findElement(By.id("userName"));
				WebElement eMail = driver.findElement(By.id("userEmail"));
				WebElement currentAddress = driver.findElement(By.id("currentAddress"));
				WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));

	}

}
