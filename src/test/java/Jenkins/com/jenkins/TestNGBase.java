package Jenkins.com.jenkins;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestNGBase {
	
	@BeforeClass	
	  public void beforeClass() {
		 System.out.println("Start Excecution : "+this.getClass().getName());
	 }
	
	
	
	
	
	
	
	 @AfterClass	
	  public void afterClass() {
		 System.out.println("End Excecution : "+this.getClass().getName());
	 }
	
	
	

}
