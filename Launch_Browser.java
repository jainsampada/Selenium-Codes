package DemoPac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {
	WebDriver driver;
	String path,title,exptitle="Facebook – log in or sign up",url;
public void Launch()
{
	//Setting Path through getProperty Method and placing it in path variable  
	path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
	//System.out.println(path);
	//Setting key and path of Chrome driver
	System.setProperty("webdriver.chrome.driver", path);
	//Launching Chrome Browser
	driver=new ChromeDriver();
	//Opening facebook application to test
	//driver.get("https://www.facebook.com/");
	driver.navigate().to("https://www.facebook.com/");
	//driver.navigate().back();
	
	title=driver.getTitle();
	url=driver.getCurrentUrl();
	System.out.println("Current Url is:"+url);
	System.out.println("Title of page is:"+title);
	if(title.equals(exptitle))
	{
		System.out.println("You are landing on Coorect page");
	}
	else
	{
		System.out.println("Correct page not opened");
	}
	//driver.close();
	driver.quit();
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Launch_Browser oo=new Launch_Browser();
		oo.Launch();
	}

}
