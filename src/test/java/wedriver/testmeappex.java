package wedriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testmeappex {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	 //driver.manage().window().fullscreen();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  Actions action=new Actions(driver);
	  action.moveToElement((WebElement)driver.findElements(By.xpath("//span[contains(text(),'AboutUs')]"))).moveToElement(driver.findElement(By.xpath("//span[contains(text,'Our\n" + 
	  		"												Offices')]"))).moveToElement(driver.findElement(By.xpath("//span[contains(text,'Chennai')]"))).click().build().perform();
	  Assert.assertTrue(driver.getCurrentUrl().contains("chn"));
	  
  }
 @BeforeTest
public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
	  driver= new ChromeDriver();
}

@AfterTest
public void afterTest() {
	  driver.quit();
}
}