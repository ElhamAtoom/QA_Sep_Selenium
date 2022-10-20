package AutomationSep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouseovernew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//div[text()='Electronics']")).click();
		WebElement ele=driver.findElement(By.xpath("//span[@class='_2I9KP_'][1]"));
		Actions Builder =new Actions(driver);
		Builder.moveToElement(ele).perform();
		driver.findElement(By.linkText("Asus")).click();

	}

}
