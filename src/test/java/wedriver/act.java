package wedriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class act {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  Actions action=new Actions(driver);
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'AboutUs')]"))).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Our')]"))).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Chennai')]"))).click().build().perform();
Set<String> set=driver.getWindowHandles();
System.out.println(driver.getWindowHandle());
for(String str : set) {
	driver.switchTo().window(str);
	}
		driver.close();  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
	  driver= new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  //driver.quit();
  }

}
