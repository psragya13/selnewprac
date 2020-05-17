package website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginTest extends Base{
	
  @Test(priority=1)
  public void log()  {
	//login make my trip
	  
		System.out.println("abt to launch");
		driver.findElement(By.id("cancel"));
	  driver.get("https://www.makemytrip.com/");
		System.out.println("Launch succesfully");
  }
}
