package wedriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class actionclass {
	WebDriver driver;
	@Test
  public void f() {
	  driver.get("https://www.facebook.com/");
	 WebElement wb = driver.findElement(By.name("email"));
	 Actions act= new Actions(driver);
	 act.keyDown(wb,Keys.SHIFT).perform();
	 act.sendKeys("user");
	 act.keyUp(wb,Keys.SHIFT);
	 act.doubleClick().contextClick().build().perform();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
	  driver= new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
