package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommandes {

	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url = "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F";
		driver.get(url);
		driver.manage().window().maximize();
		String titlePage = driver.getTitle();
		System.out.println(titlePage);
		int titleLength = titlePage.length();
		System.out.println("the title of the page is "+ titlePage);
		System.out.println("the title of the page is "+ titleLength);
		String actualUrl = driver.getCurrentUrl();
		if(actualUrl.equals(url))  {
		System.out.println("verification successfull the correct url is opened");
		}else {
			System.out.println("verification failed the incorrect url is opened");
		}
		System.out.println("actual url :"+ actualUrl);
		System.out.println("expected url is:"+ url);
		
		//store and print page source
		String sourcepage = driver.getPageSource();
		int lengthsourcepage = sourcepage.length();
		System.out.println("length of the page source is:" + lengthsourcepage );
		driver.quit();
	}

}
