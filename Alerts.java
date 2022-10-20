package AutomationSep;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		//simple alert
		
		driver.findElement(By.xpath("//input [@name='alert']")).click();
		String alerttext = driver.switchTo().alert().getText();
		System.out.println(alerttext);
		driver.switchTo().alert().accept();
		String titlename = driver.findElement(By.className("title")).getText();
		System.out.println(titlename);
		
		//confirmation  alert
		driver.findElement(By.name("confirmation")).click();
		String alerttext2 = driver.switchTo().alert().getText();
		System.out.println(alerttext2);
		driver.switchTo().alert().dismiss();
		//prompt alert
		driver.findElement(By.name("prompt")).click();
		String alerttext3 = driver.switchTo().alert().getText();
		System.out.println(alerttext3);
		driver.switchTo().alert().sendKeys("elhamatoom");
		driver.switchTo().alert().accept();
		driver.close();


	}

}
