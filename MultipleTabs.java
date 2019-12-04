package DemoPac;

import java.util.ArrayList;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String path;//homeheading,expheading="Employee Information";
		// TODO Auto-generated method stub
path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		
		((JavascriptExecutor)driver).executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    driver.get("https://www.google.com");
	    ((JavascriptExecutor)driver).executeScript("window.open()");
	    ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs1.get(2));
	    driver.get("https://www.gmail.com");
	    
//	    Set <String> ids = driver.getWindowHandles();
//	    java.util.Iterator<String> it = ids.iterator();
//	    String parentid = it.next();
//	    String newWindow = it.next();
//	    driver.switchTo().window(newWindow);
//	    driver.get("https://www.google.com");
	}

}
