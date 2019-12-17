package wedriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ie {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://www.10.232.237.143:443/TestMeApp/fetchcat.htm");
	 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.ie.driver","src/main/resources/IEDriverServer.exe");
	  driver = new InternetExplorerDriver();
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
