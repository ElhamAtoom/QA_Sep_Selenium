package AutomationSep;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement Products = driver.findElement(By.xpath("//select[@id='first']"));
		Select ele= new Select(Products);
		ele.selectByIndex(2);
		WebElement animal = driver.findElement(By.id("animals"));
		Select dd= new Select(animal); 
		dd.selectByVisibleText("Avatar");

		WebElement Food = driver.findElement(By.xpath("//select[@id='second']"));
		Select dd1= new Select(Food);
		dd1.selectByIndex(0);
		dd1.selectByIndex(2);
		dd1.selectByValue("bonda");

		
	}

}
