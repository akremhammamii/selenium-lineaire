package TestCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommandsJava {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		WebElement email = driver.findElement(By.id("Email"));
        email.clear();
        String attValue = email.getAttribute("value");
        email.sendKeys(attValue);
        System.out.println("The attribute value is : " +attValue);
        
        WebElement passWord = driver.findElement(By.id("Password"));
        passWord.clear();
        passWord.sendKeys("admin");
        String attValue1 = passWord.getAttribute("value");
        System.out.println("The attribute value is : " +attValue1);

		Dimension dimensions = email.getSize();
		System.out.println("hight : "+dimensions.height);
		System.out.println("width: "+dimensions.width);
		
		Point point = passWord.getLocation();
		System.out.println("X coordinate "+point.x);
		System.out.println("Y coordinate "+point.y);
		// verifier si le bouton login afficher vrai ou faux
		WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
		boolean result = btnLogin.isDisplayed();
		System.out.println(result);
		
		//verifier si le bouton activer vrai ou faux 
		boolean result1 = btnLogin.isEnabled();
		System.out.println(result1);
		//verifier si le bouton existe
		
		List<WebElement> loginBtn = driver.findElements(By.xpath("//button[@type='submit']"));
		if(loginBtn.size() !=0) {
		System.out.println("existe");	
		
	}else {
		System.out.println("not existe");	
	}
		
	}

}
