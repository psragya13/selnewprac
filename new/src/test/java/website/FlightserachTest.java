package website;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class FlightserachTest extends Base{
	WebDriver driver;
	
	@BeforeTest
	public void launching()
	{ driver= setup();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	
	}
	
  @Test
  public void fs() {
	     
		  
	  	 // driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();;
	  	//input[@data-cy='fromCity']
	 /* 	WebElement A = driver.findElement(By.xpath("//input[@data-cy='fromCity']"));
	  	A.click();
	    A.sendKeys("Delhi");
	    WebElement textbox = driver.findElement(By.id("idOfElement"));
	    textbox.sendKeys(Keys.ENTER); */
	  
	  driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
	  Actions actions = new Actions(driver);
	  WebElement elementLocator = driver.findElement(By.xpath("//input[@data-cy='fromCity']"));
	  actions.doubleClick(elementLocator).perform();
	  WebElement elementfinder = driver.findElement(By.xpath("//input[@data-cy='toCity']"));
	  actions.doubleClick(elementfinder).perform();
	//font[text()="Travel Blog"]
	  WebElement s = driver.findElement(By.xpath("//font[text()='Travel Blog']"));
	 // SoftAssert softAssertion= new SoftAssert();
	//  softAssertion.assertEquals(s.getText(), "Travel Bloggg");
	  Assert.assertEquals(s.getText(), "Travel Blog");
	  
	  System.out.println("paased1");
	  Assert.assertTrue(s.isDisplayed(), "its Displayed successfully");
	 
  }
  
  
  @Test
  public void ss() {
	  
	  System.out.println("one");
  }

	@AfterTest 
	public void teardown()
	{ driver.quit();
	}
  
}
