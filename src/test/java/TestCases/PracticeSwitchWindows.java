package TestCases;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchWindows {

	public static void main(String[] args) {

		        // Open chrome browser
				WebDriver driver = new ChromeDriver();

				// Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				// Open URL application
				driver.get("https://demoqa.com/browser-windows");
                // store and print the name of the window
				String handle = driver.getWindowHandle();
				System.out.println(handle);
				
				
				((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 400)", "");
				WebElement newWindowMessage = driver.findElement(By.id("messageWindowButton"));
				newWindowMessage.click();
				
				// store and print of all names of windows opened
				Set<String> handles = driver.getWindowHandles();
				System.out.println(handles);

				// pass a window handle another window
				for (String handle1 : driver.getWindowHandles()) {
					driver.switchTo().window(handle1);
					System.out.println(handle1);
				}
				driver.quit();
	}

}
