package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.NoSuchElementException;

public class FluentWaitExample {
	public static void main(String[] args) {
		// Configuration de Selenium pour utiliser ChromeDriver

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Ouvrir la page web
		driver.get("https://demoqa.com/alerts");

		// Définir le FluentWait
		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(20)) // Temps d'attente maximum
				.pollingEvery(Duration.ofSeconds(5)) // Vérification toutes les 5 secondes
				.ignoring(NoSuchElementException.class); // Ignorer cette exception
		WebElement btnClickMe = driver.findElement(By.id("alertButton"));
		btnClickMe.click();
		wait.until(ExpectedConditions.alertIsPresent());

		driver.quit();
	}
}
