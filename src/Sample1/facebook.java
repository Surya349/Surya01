package Sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SuryA\\eclipse-workspace\\Surya\\Seleniumpractice\\Driver\\chromedriver.exe");
	
WebDriver driver = new ChromeDriver();

driver.get("https://www.facebook.com/");

	WebElement dri =driver.findElement(By.id("email"));
	dri.sendKeys("surya");
	
	System.out.println("Executed");

	//driver.quit();
	
	}
}
