import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class swadefault {
  @Test(dataProvider = "somename")
  public void mydata(Integer n, String s) {
	 System.out.println(n+ " is "+s);
  }

  @DataProvider
  public Object[][] somename()
  {
	  Object d[][]= {
			  {1 , "sam"},{2 , "swa"},
			  };
	  return d;
	  }
  }
  