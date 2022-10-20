package AutomationSep;

import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeWork1 {
public static void main(String[] args) {
	/*WebDriverManager.firefoxdriver().setup();
	FirefoxDriver driver= new FirefoxDriver(); 
	driver.get("www.facebook.com");
	P.S. i don't have firefox so it didn't work :D*/ 
	
	WebDriverManager.edgedriver().setup();
	EdgeDriver driver= new EdgeDriver(); 
	driver.navigate().to("btn-make-appointment");
	
}
}
/* for the difference between navigate and Get, they are as below, please check them:
 
 Get() >  It is responsible for loading the page and waits until the page has finished loading,
  			and it couldn't track the history
  			
 navigate() > doesn't wait the page to be loaded,
  				it tracks the history and we can move back and forth
 
 */
