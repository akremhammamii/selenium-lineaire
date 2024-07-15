package TestCases;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");

		WebElement BoutonDC;
		// identification des elements
		BoutonDC = driver.findElement(By.id("doubleClickBtn"));
		// action
		Actions action = new Actions(driver);
		action.doubleClick(BoutonDC).perform();

		String MessageDC = driver.findElement(By.id("doubleClickMessage")).getText();

		Assert.assertEquals(MessageDC, "You have done a double click");
		driver.quit();
	}

}
