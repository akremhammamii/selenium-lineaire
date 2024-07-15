package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/upload/");
		WebElement btnUploadFile = driver.findElement(By.id("uploadfile_0"));
		btnUploadFile.sendKeys("C:\\Users\\akrem testeur\\Desktop\\selenuim\\data\\data.txt");
	}

}
