package wedriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class seleniumcs1 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  driver.findElement(By.linkText("SignUp")).click();
	  driver.findElement(By.id("userName")).sendKeys("swathi123");
	  driver.findElement(By.id("firstName")).sendKeys("swathi");
	  driver.findElement(By.id("lastName")).sendKeys("gopinath");
	  driver.findElement(By.id("password")).sendKeys("1234534");
	  driver.findElement(By.id("pass_confirmation")).sendKeys("1234534");
	  driver.findElement(By.xpath("//input[@value='Male']")).click();
	  driver.findElement(By.id("emailAddress")).sendKeys("swathygopinath98@gmail.com");
	  driver.findElement(By.id("mobileNumber")).sendKeys("9841330219");
	  driver.findElement(By.id("dob")).sendKeys("03/16/1998");
	  driver.findElement(By.id("address")).sendKeys("nanganallur chennai");
	  driver.findElement(By.xpath("//option[@value='411012']")).click();
	  driver.findElement(By.id("answer")).sendKeys("dolly");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(By.linkText("Home")).click(); 
	
	driver.findElement(By.linkText("SignIn")).click();
	driver.findElement(By.id(   "userName")).sendKeys("lalitha");
	driver.findElement(By.id("password")).sendKeys("password123");
	driver.findElement(By.name("Login")).click();
	Thread.sleep(3000);
	
	
	   Actions act=new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'All')]"))).click().perform();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"))).click().perform();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Head Phone')]"))).click().perform();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(By.cssSelector("a[class='btn btn-success btn-product']")).click();
	  driver.findElement(By.cssSelector("i[class='fa fa-shopping-cart']")).click();
	  driver.findElement(By.cssSelector("a[class='btn btn-success btn-block']")).click();
	  
	  
	  driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[contains(text(),'Andhra Bank')]")).click();
	  driver.findElement(By.id("btn")).click();
	  driver.findElement(By.name("username")).sendKeys("123456");
	  driver.findElement(By.name("password")).sendKeys("Pass@456");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
	  driver.findElement(By.xpath("//input[@value='PayNow']")).click();
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
