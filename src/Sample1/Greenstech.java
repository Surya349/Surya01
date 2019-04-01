package Sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenstech {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SuryA\\eclipse-workspace\\Surya\\Seleniumpractice\\Driver\\chromedriver.exe");
	
WebDriver driver = new ChromeDriver();

driver.get("http://www.greenstechnologys.com/");


	WebElement dri =driver.findElement(By.linkText("CONTACT US"));
	
	
	dri.click();
	
	System.out.println("Executed");

	//driver.quit();
	
	}
}
