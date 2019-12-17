package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void assertest() {
	  Assert.assertTrue(25<50);
	  Assert.assertFalse(100<50);
int sum=10+10;
	  Assert.assertEquals(20,sum);
	  int x=10;
	  Assert.assertNotEquals(30,x);
	  NewTest n1= new NewTest();
	  NewTest n2= new NewTest();
	  NewTest n3;
	  n3=n2;
	Assert.assertNotSame(n3,n1);
	 Assert.assertNotSame(n1,n2);
	 Assert.assertSame(n2,n3);
  }
}
