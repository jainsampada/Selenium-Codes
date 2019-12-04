package DemoPac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchNaukri {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		String path,homeheading,expheading="Employee Information";
		// TODO Auto-generated method stub
path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/browse-jobs");
		driver.findElement(By.name("qp")).sendKeys("Testing");
		Thread.sleep(3000);
		driver.findElement(By.name("ql")).sendKeys("Chandigarh");
		//Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='exp_dd']/div[1]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='a3']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.className("sdTxt")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("a")).click()
	}

}
