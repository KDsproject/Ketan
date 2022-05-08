package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class BeforeTestmethod {
  @Test
  public void Testmethod() {
	  System.out.println("Hi am Testmethod");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Hi am before method");
  }

}
