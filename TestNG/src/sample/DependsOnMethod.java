package sample;

import org.testng.annotations.Test;

public class DependsOnMethod {
  @Test(dependsOnMethods="Mahindra")
  public void Honda() {
	  System.out.println("Honda method");
  }
  @Test(dependsOnMethods="Hundai")
  public void Toyota() {
	  System.out.println("Toyota method");
  }
  @Test(dependsOnMethods="Ascent")
  public void Mahindra() {
	  System.out.println("Mahindra method");
  }
  @Test
  public void Ascent() {
	  System.out.println("Ascent method");
  }
  @Test
  public void Hundai() {
	  System.out.println("Hundai method");
  }
}
