package DemoPac;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String path,homeheading,expheading="Employee Information";
		// TODO Auto-generated method stub
path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		ArrayList<WebElement> al=(ArrayList<WebElement>) driver.findElements(By.tagName("a"));
		System.out.println(al.size());
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i).getText());
		}

	}

}
