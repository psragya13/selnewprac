package website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;


public class Base {

		WebDriver driver ;
		
		public WebDriver setup()
		{ 
			System.setProperty("webdriver.chrome.driver", "src//main//resources//chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.findElement(By.id("cancel"));
			 driver.get("https://www.makemytrip.com/");
			System.out.println("started");
			return driver;
		}
		
	//	@AfterTest
	//	public void teardown()
	//	{ 
	//		driver.quit();
	//	}
		

}
