package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// implicite wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
//		WebElement email; 
//		email = driver.findElement(By.id("Email"));
//        email.clear(); 

		WebElement btnClickMe = driver.findElement(By.id("alertButton"));
		btnClickMe.click();
		
		// accept alert
		driver.switchTo().alert().accept();
		//get title of site web 
		String title = driver.getTitle();
		System.out.println("the title of the page is " + title);
	}

}
