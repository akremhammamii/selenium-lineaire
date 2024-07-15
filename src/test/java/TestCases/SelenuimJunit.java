package TestCases;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelenuimJunit {
       public WebDriver driver;
       
       @Before
       public void setup() {
    		driver = new ChromeDriver();
    		driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
    		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
    		driver.manage().window().maximize();
       }
       
       @Test
       public void login_valid_userCredential( ) {
    	   
    	   driver.findElement(By.id("Email")).clear();
    	   driver.findElement(By.id("Email")).sendKeys("akrem@g.com");
    	   
    	   driver.findElement(By.id("Password")).clear();
    	   driver.findElement(By.id("Password")).sendKeys("akrem");
    	   
    	   driver.findElement(By.xpath("//button[@type='submit']")).click();
       }
       @Test
        public void login_invalid_userCredential( ) {
    	   
    	   driver.findElement(By.id("Email")).clear();
    	   driver.findElement(By.id("Email")).sendKeys("akrem@g.com");
    	   
    	   driver.findElement(By.id("Password")).clear();
    	   driver.findElement(By.id("Password")).sendKeys("akrem");
    	   
    	   driver.findElement(By.xpath("//button[@type='submit']")).click();
       }
       @After
       public void tearDown() {
   		driver.quit();
   	}
	
}
