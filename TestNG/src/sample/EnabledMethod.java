package sample;

import org.testng.annotations.Test;

public class EnabledMethod {
  @Test(enabled=true)
  public void first() {
	  System.out.println("method 1");
  }
  @Test(enabled=false)
  public void second() {
	  System.out.println("method 2");
  }
  @Test(enabled=true)
  public void third() {
	  System.out.println("method 3");
  }
}

/**
by default all the methods are the true
*/