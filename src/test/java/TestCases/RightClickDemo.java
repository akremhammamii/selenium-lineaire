package TestCases;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		WebElement rightclick;
		rightclick = driver.findElement(By.id("rightClickBtn"));
		Actions action = new Actions(driver);
		action.contextClick(rightclick).perform();
		String MessageDC = driver.findElement(By.id("rightClickMessage")).getText();

		Assert.assertEquals(MessageDC, "You have done a right click");
		driver.quit();
	}

}
