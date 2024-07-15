package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Ouvrir la page web
		driver.get("https://demoqa.com/select-menu");
		WebElement dropDownListe = driver.findElement(By.id("oldSelectMenu"));
		Select list = new Select(dropDownListe);
		list.selectByValue("2");
	}

}
