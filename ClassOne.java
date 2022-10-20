package AutomationSep;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver(); //object "name: driver" from from class name ChromeDriver
		//open navigate to URL
		//driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.findElement(By.id("btn-make-appointment")).click();
		//driver.findElement(By.className("btn btn-dark btn-lg")).click(); this classs name is duplicated
		//driver.findElement(By.linkText("mailto:info@katalon.com"));
		driver.findElement(By.name("username")).sendKeys("John Doe");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.id("btn-login")).click();
		//driver.navigate().back();
		//driver.findElement(By.linkText("info@katalon.com")).click();
		//driver.findElement(By.partialLinkText("katalon")).click(); //we use it when the text include numbers and we use the part without numbers
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
	}

}
