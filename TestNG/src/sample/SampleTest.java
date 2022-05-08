package sample;

import org.testng.annotations.Test;

public class SampleTest {
  @Test
  public void testcase1() throws InterruptedException {
	  Thread.sleep(2000);
	  System.out.println("I am Testcase class1");
  }
  @Test
  public void testcase2() {
	  System.out.println("I am Testxase class 2");
  }
}
