package ecom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ebay {
  @Test
  public void ebayTest() throws InterruptedException 
  {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.ebay.com/");
	 
	  Thread.sleep(5000);
	  driver.close();
  }
}
