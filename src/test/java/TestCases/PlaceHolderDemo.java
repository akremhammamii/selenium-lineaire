package TestCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaceHolderDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/tool-tips/");
		WebElement placeholder = driver.findElement(By.id("toolTipTextField"));
		String textPlaceHolder = placeholder.getAttribute("placeholder");
		System.out.println("text is " + textPlaceHolder);
		Assert.assertEquals(textPlaceHolder, "Hover me to see");
	}

}
