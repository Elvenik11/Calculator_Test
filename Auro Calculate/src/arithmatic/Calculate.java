package arithmatic;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import arithmatic.Elements;


public class Calculate {
	
	WebDriver dr;
	static String s1,s2,s3;
	
	static int n = 0;
	
//	Elements obj = new Elements(dr);
	  

  @BeforeTest
  public void beforeTest() {

	 // System.setProperty("webdriver.chrome.driver","C:\\Users\\Nik\\Documents\\chromedriver_win32\\chromedriver.exe");
	  
	  System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
	  
	  dr = new ChromeDriver();
	  Elements obj = new Elements(dr);
	  
	 // obj.toURL();
	  dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	  
	  dr.manage().window().maximize();  
	  
	}
  
  @Test (priority = 1)
  public void testcase() {
	  
	  Elements obj = new Elements(dr);
	  n += 1;
	  obj.multiply();
	  
	  obj.newTab();
	  obj.toURL();
	  
	  obj.divide();
	  
	  obj.newTab();
	  obj.toURL();
	  
	  obj.add();
	  
	  obj.newTab();
	  obj.toURL();
	  
	  obj.subtract();
	  
  }

  
}
