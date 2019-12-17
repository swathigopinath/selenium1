package mytest2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class priority {
  @Test (priority =1)
  public void googletest() {
	  System.out.println("google");
  }
 
  @Test (priority =2)
  public void alphabettest() {
	  System.out.println("twitter");
  }

}
  