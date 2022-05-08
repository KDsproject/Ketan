package sample;

import org.testng.annotations.Test;

public class InvocationMethod {
  @Test(invocationCount=10)
  public void Invocationmethod() {
	  System.out.println("Hi I am invocatipon Test Method");
  }
}
