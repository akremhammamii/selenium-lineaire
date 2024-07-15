package TestCases;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// implicite wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable/");
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();
		String textTarget = target.getText();
		if (textTarget.equals("Dropped!")) {
			System.out.println("pass: source is dropped to target as exected");
		} else {
			System.out.println("fail: source could not be dropped to target as expected");
		}
		driver.quit();
	}

}
