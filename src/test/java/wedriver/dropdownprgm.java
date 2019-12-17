package wedriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class dropdownprgm{
WebDriver driver;
  @Test
public void f() {
	  driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	// WebElement dropdown= driver.findElement(By.id("id_contact"));
	//  Select drop=new Select(dropdown);
	//  drop.selectByIndex(1);
	  WebDriverWait wait = new WebDriverWait(driver,20);
	  driver.findElement(By.id("identifierId")).sendKeys("swathygopinath98@gmail.com");
	  driver.findElement(By.cssSelector("span[class='RveJvd snByac']")).click();
	  WebElement ws=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
	  ws.sendKeys("password");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
	  driver= new ChromeDriver();
	//  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
  } 
  @AfterTest
  public void afterTest() {
driver.quit();
  }

}