package sample;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class AfterTestMethod {
  @Test
  public void f() {
	  System.out.println("Hi am method 1");
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("Hi am after method ");
  }

}
