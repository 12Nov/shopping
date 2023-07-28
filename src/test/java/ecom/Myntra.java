package ecom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Myntra {
  @Test
  public void myntraTest() throws InterruptedException
  {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.myntra.com/");
	 
	  Thread.sleep(5000);
	  driver.close();
  }
}
