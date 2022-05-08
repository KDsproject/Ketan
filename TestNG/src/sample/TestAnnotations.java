package sample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations {
  @AfterTest
  public void Browser1() {
	  System.out.println("close after test browser");
  }
  @Test
  public void Browser2() {
	  System.out.println("Firefox opened");
  }
  @BeforeTest
  public void Firefox() {
	  System.out.println("Open before test browser");
  }
  @Test
  public void Chrome() {
	  System.out.println("Chrome opened");
  }
}



/*
before test & after test ----> before test execute before of any test method & after test execute after end of test method.
*/