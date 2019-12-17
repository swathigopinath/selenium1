package wedriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class locatersfunc {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	//  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	//  driver.findElement(By.partialLinkText("Sign")).click();
	  //Thread.sleep(3000);
	 // driver.findElement(By.cssSelector("input[type='userName']")).sendKeys("lalitha");
	//	 driver.findElement(By.cssSelector("input#userName")).sendKeys("lalitha");
	  //driver.findElement(By.id("userName")).sendKeys("lalitha");
	//  driver.findElement(By.id("password")).sendKeys("Password123");
	//  driver.findElement(By.name("Login")).click();
	//  List<WebElement> l= driver.findElements(By.tagName("a"));
//	  System.out.println(l.size());
	 // driver.get("https://login.yahoo.com");
	 // driver.findElement(By.cssSelector("select#usernamereg-month option:nth-of-type(3)")).click();
	//  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("swa");
	//  driver.findElement(By.xpath("//input[@id='usernamereg-password']")).sendKeys("12345");
	//  System.out.println(driver.getCurrentUrl());
	  //System.out.println(driver.getPageSource());
	//System.out.println(driver.getTitle());
	 //*Thread.sleep(2000);
	//  driver.navigate().to("https://www.google.com");
	//  driver.navigate().back(); 
	//  Thread.sleep(2000);
	//  driver.navigate().refresh();Thread.sleep(2000);
	//  driver.navigate().forward();  //*
	  
	  driver.get("https://www.tutorialspoint.com/javascript/javascript_dialog_boxes.htm");
	  driver.findElement(By.xpath("//input[@value='Click MeCC']")).click();
	  if(ExpectedConditions.alertIsPresent() != null);
	  Alert a=driver.switchTo().alert();
	  Thread.sleep(2000);
	  System.out.println(a.getText());
	  a.accept();
	  
	  
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