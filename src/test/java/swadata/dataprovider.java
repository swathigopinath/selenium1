package swadata;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class dataprovider {
  @Test(dataProvider= "swathi")
  public void pavi(String a, String b)
  {
  System.out.println(a+ " is with "+b);
  }

  @DataProvider
  public Object[][] swathi(){
	  Object s[][]= {{"neyo","dolly"},{"boo","teddy"}};
	  return s;
  }
}
