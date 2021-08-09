package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert2 {
  @Test
  public void a() {
	  Reporter.log("method a running", false);
  }
  @Test
  public void b() {
	  Reporter.log("method b running", false);
  }
  @Test
  public void c() {
	  Reporter.log("method c running", false);
  }
  @Test
  public void d() {
	  Reporter.log("method d running", false);
  }
  @Test
  public void e() {
	  Reporter.log("method e running", false);
  }
}
