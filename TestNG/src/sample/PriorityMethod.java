package sample;

import org.testng.annotations.Test;

public class PriorityMethod {
  @Test(priority=1)
  public void Ketan() {
	  System.out.println("Hi i am Ketan Method");
  }
  @Test(priority=0)
  public void Vijay() {
	  System.out.println("Hi i am Vijay Method");
  }
  @Test(priority=1)
  public void Kiran() {
	  System.out.println("Hi i am Kiran Method");
  }
  }
