package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestNGTest {
							  @Test
							  public void validatePIN() {
								  Reporter.log("PIN validation  done---> @Test Used",true);
							  	}
  
							  @Test
							  public void validateUserID()
							  {
								  Reporter.log("Uservalidation done---> @Test Used",true);  
							  }
  
				  @BeforeMethod
				  public void beforeMethod() {
					  Reporter.log("UserId password Entered done---> @Test Used",true);
				  }
				
				  @AfterMethod
				  public void afterMethod() {
					  Reporter.log("logout done---> @Test Used",true);
				  }

	  @BeforeClass
	  public void beforeClass() {
		  Reporter.log("launch browser done---> @Test Used",true);
	  }
	
	  @AfterClass
	  public void afterClass() {
		  Reporter.log("closed browser done---> @Test Used",true);
	  }

}
