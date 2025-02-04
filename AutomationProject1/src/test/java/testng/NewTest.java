package testng;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void add() {
	  System.out.println("add");
  }
  @Test
  public void sub() {
	  System.out.println("Hello");
  }
  @Test(priority = 1)
  public void adisplay() {
	  System.out.println("World");
  }
}
