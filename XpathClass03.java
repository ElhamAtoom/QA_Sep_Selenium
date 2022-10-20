package AutomationSep;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathClass03 {
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver(); //object "name: driver" from from class name ChromeDriver
		//open navigate to URL
		//driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.findElement(By.id("btn-make-appointment")).click();

		driver.findElement(By.name("username")).sendKeys("John Doe");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.id("btn-login")).click();
		//Relative Xpath types: 
		
		//1*Attribute base 
		//label [contains (@for,'combo_facility')] this is contains > attribute xpath > relative
		//label[@for='combo_facility'] > attribute > relative
		//ends and start with: attribute 
		//label [starts-with (@for,'combo_facility')]
		//label [ends-with (@for,'combo_facility')]
		
		//2*Text base
		//label [contains(text(), 'Facility'] > this is contains > text > relative
		//label [text()='Facility'] > text > relative	
		//ends and start with: text
		//label [starts-with(text(), 'Facility']
		//label [ends-with(text(), 'Facility']
		driver.findElement(By.xpath("//label [contains (@for,'combo_facility')]"));
		
		//2*Advanced Xpath
		//Parent to child
		//Xpath parent / child tag name
		
		//child to parent
		//xpath child /.. or xpath/parent:: parent tag name
		
		//grandparent to grandchild
		//xpath //grandchild tag name
		
		//grandchild to grandparent
		//xpath/ancestor::grandparent tage name 
		
		
		
	}

}
