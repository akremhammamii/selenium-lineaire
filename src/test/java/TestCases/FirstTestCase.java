package TestCases;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {

		// open chrome browser
		WebDriver driver = new ChromeDriver();
		
		//implicite wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		//driver.manage().deleteAllCookies();
		
		WebElement email; 
		email = driver.findElement(By.id("Email"));
        email.clear();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        WebElement fieldEmail;
        fieldEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Email")));
        fieldEmail.sendKeys("admin@yourstore.com");
        
        
        WebElement psw; 
        psw = driver.findElement(By.id("Password"));
        psw.clear();
        psw.sendKeys("admin");
        
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
       
        //wait 3 second 
        Thread.sleep(3000);
        
        //
        String text = driver.findElement(By.tagName("h1")).getText();
        		//driver.findElement(By.xpath("//body/div/div[1]/div[1]/h1[1]")).getText();
        Assert.assertEquals(text, "Dashboard"); 
        driver.close();
        
	}

}
