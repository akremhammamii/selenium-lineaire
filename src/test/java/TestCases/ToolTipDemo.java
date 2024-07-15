package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToolTipDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/tool-tips/");
		WebElement message = driver.findElement(By.id("toolTipButton"));		
		String toolTipText = message.getText();
		if (toolTipText.equals("Hover me to see")) {
		System.out.println("pass : tool tip mateching exepted value");
		} else {
			System.out.println("fail: tool tip not matching exepted value");
		}
		driver.quit();
		
		
	}

}
