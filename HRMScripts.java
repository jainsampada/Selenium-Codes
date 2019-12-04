package DemoPac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMScripts {
	WebDriver driver;
	String path,homeheading,expheading="Employee Information";
	public void launch() throws InterruptedException
	{
		path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		//Launching Chrome Browser
		driver=new ChromeDriver();
		//Opening facebook application to test
		//driver.manage().window().maximize();
		driver.get("http://172.16.10.77/hrm/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(7000);
		driver.switchTo().frame(0);
		System.out.println("Hello");
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@value='0038']")).click();
		homeheading=driver.findElement(By.xpath("//*[@id='standardView']/div[1]/h2")).getText();
		System.out.println("Reached");
		if(homeheading.equals(expheading))
		{
		System.out.println("You are on Home page");
		}
		else
		{
			System.out.println("you are not on Correct page");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		HRMScripts oo=new HRMScripts();
		oo.launch();
	}

}
