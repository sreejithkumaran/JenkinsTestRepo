package Jenkins.com.jenkins;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass2 extends TestNGBase{
	
  @Test
  public void TC_1() {
	  Assert.assertTrue(true);
	  
  }
  
  @Test
  public void TC_2() {
	  Assert.assertTrue(true);
  }
  
  @Test
  public void TC_3() {
	  Assert.assertTrue(true);
  }
  
  @Test
  public void TC_4() {
	  Assert.assertTrue(false);
  }
  
  @Test
  public void TC_5() {
	  Assert.assertTrue(false);
  }
  
  
  
 
}
