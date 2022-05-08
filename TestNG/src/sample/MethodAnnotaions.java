package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class MethodAnnotaions {
  @Test
  public void first() {
  System.out.println("Hi i am first method");
  }
  
  @AfterMethod
  public void beforeMethod() {
	  System.out.println("Hi i am After method");
  }
  
  
  @BeforeMethod
  public void afterMethod() {
  System.out.println("Hi i am Before method");
  }
  
  @Test
  public void second() {
	  System.out.println("Hi i am second method");
  }
}

/*
 before method & after method---> both method execute on each test method of starting & ending also.
 */
