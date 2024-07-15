package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSuiteCommande {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.switchTo().frame("a077aa5e");
		WebElement image = driver.findElement(By.xpath("html/body/a/img"));
		image.click();
		//WebElement accept = driver.findElement("//*[@id="save"]/span[1]/div/span");
		
	}

}
