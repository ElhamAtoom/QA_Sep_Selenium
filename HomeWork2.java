package AutomationSep;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.findElement(By.id("btn-make-appointment")).click();
		driver.findElement(By.name("username")).sendKeys("John Doe");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.id("btn-login")).click();
		WebElement Facility = driver.findElement(By.id("combo_facility"));
		Select aa= new Select(Facility);
		aa.selectByIndex(1);
	}

}

 /* Xpath disadvantages: Slow compared to others
  * As, Xpath is created using relative path/position of elements so there 
  * are always chances that Xpath gets change if new elements are introduced in the web page and
  *  this will lead to unnecessary failure of test cases while IDs don't have this problem
   */
