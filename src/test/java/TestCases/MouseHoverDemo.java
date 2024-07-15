package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/menu/");
		WebElement mouseHover = driver.findElement(By.xpath("//*[@id='nav']/li[2]/a"));
		Actions actions = new Actions(driver);
        actions.moveToElement(mouseHover).build().perform();
		
		
		
		
	}

}
