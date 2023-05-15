package junkinProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class junkin {
	WebDriver driver;
	
	@BeforeTest
	
     public void getWebsite() {
    	 WebDriverManager.chromedriver().setup();
    	 System.setProperty("webdriver.http.factory", "jdk-http-client");

    	 driver = new ChromeDriver();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	 String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    	 driver.get(url);
    	 driver.manage().window().maximize();
     }
     
     @Test
     public void orangeHRM() {
    	 
    	 driver.findElement(By.name("username")).sendKeys("Admin");
         driver.findElement(By.name("password")).sendKeys("admin123");
         driver.findElement(By.className("oxd-button--medium")).click();
     }
}
