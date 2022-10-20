package AutomationSep;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Yallow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://v4.yallow.com/en/login");
		driver.findElement(By.id("emailInput")).sendKeys("elham2@yallow.com");
		driver.findElement(By.id("passwordInput")).sendKeys("Elham123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn btn-sm']")).click();
		
	}

}
