package arithmatic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {
	  
	  private WebDriver dr;
	
	  private static String URL="https://www.calculator.net/";
	
	  @FindBy(xpath = "//div[@id='sciInPut']")
	  WebElement iput;
	  //= dr.findElement(By.xpath("//div[@id='sciInPut']"));
	  
	  @FindBy(xpath = "//div[@id='sciOutPut']")
	  WebElement oput;
	  //= dr.findElement(By.xpath("//div[@id='sciOutPut']"));
	
	  @FindBy(xpath = "//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")
	  WebElement e0;
	  //= dr.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]"));
	  
	  @FindBy(xpath = "//span[contains(text(),'1')]")
	  WebElement e1;
	  // = dr.findElement(By.xpath("//span[contains(text(),'1')]"));
	  
	  @FindBy(xpath = "//span[contains(text(),'2')]")
	  WebElement e2;
	  //= dr.findElement(By.xpath("//span[contains(text(),'2')]"));
	  
	  @FindBy(xpath = "//span[contains(text(),'3')]")
	  WebElement e3;
	  // = dr.findElement(By.xpath("//span[contains(text(),'3')]"));
	  
	  @FindBy(xpath = "//span[contains(text(),'4')]")
	  WebElement e4;
	  //= dr.findElement(By.xpath("//span[contains(text(),'4')]"));
	  
	  @FindBy(xpath = "//span[contains(text(),'5')]")
	  WebElement e5;
	  // = dr.findElement(By.xpath("//span[contains(text(),'5')]"));
	  
	  @FindBy(xpath = "//span[contains(text(),'6')]")
	  WebElement e6;
	  //= dr.findElement(By.xpath("//span[contains(text(),'6')]"));
	  
	  @FindBy(xpath = "//span[contains(text(),'7')]")
	  WebElement e7;
	  //= dr.findElement(By.xpath("//span[contains(text(),'7')]"));
	  
	  @FindBy(xpath = "//span[contains(text(),'8')]")
	  WebElement e8;
	  //= dr.findElement(By.xpath("//span[contains(text(),'9')]"));
	  
	  @FindBy(xpath = "//span[contains(text(),'9')]")
	  WebElement e9;
	  //= dr.findElement(By.xpath("//span[contains(text(),'9')]"));
	  
	  @FindBy(xpath = "//span[contains(text(),'–')]")
	  WebElement minus;
	  // = dr.findElement(By.xpath("//span[contains(text(),'–')]"));
	  
	  @FindBy(xpath = "//span[contains(text(),'+')]")
	  WebElement plus;
	  //= dr.findElement(By.xpath("//span[contains(text(),'+')]"));
	  
	  @FindBy(xpath = "//span[contains(text(),'×')]")
	  WebElement into;
	  //= dr.findElement(By.xpath("//span[contains(text(),'×')]"));
	  
	  @FindBy(xpath = "//tbody/tr[2]/td[2]/div[1]/div[4]/span[4]")
	  WebElement div;
	  // = dr.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[4]"));
	  
	  @FindBy(xpath = "//span[contains(text(),'=')]")
	  WebElement equals;
	  //= dr.findElement(By.xpath("//span[contains(text(),'=')]"));
	  
	  @FindBy(xpath = "//span[contains(text(),'AC')]")
	  WebElement allclean; 
	  //= dr.findElement(By.xpath("//span[contains(text(),'AC')]"));
	  
	  @FindBy(xpath = "//span[contains(text(),'(')]")
	  WebElement obracket; 
	  //= dr.findElement(By.xpath("//span[contains(text(),'(')]"));
	  
	  @FindBy(xpath = "//span[contains(text(),')')]")
	  WebElement cbracket; 
	  //= dr.findElement(By.xpath("//span[contains(text(),')')]"));
	  
	  String s1,s2;
	
	public Elements(WebDriver dr) {
		this.dr = dr;
		dr.get(URL);
		PageFactory.initElements(dr, this);
	}
	
	public void zero() {
		e0.click();
		
	}
	public void one() {
		e1.click();
		
	}
	public void two() {
		e2.click();
		
	}
	public void three() {
		e3.click();
		
	}
	public void four() {
		e4.click();
		
	}
	public void five() {
		e5.click();
		
	}
	public void six() {
		e6.click();
		
	}
	public void seven() {
		e7.click();
		
	}
	
	public void eight() {
		e8.click();
		
	}
	public void nine() {
		e9.click();
		
	}
	
	public void into() {
		into.click();
		
	}
	
	public void division() {
		div.click();
		
	}
	public void addition() {
		plus.click();
		
	}
	public void subbtract() {
		minus.click();
		
	}
	
	public void multiply() {				// 423 x 525
		
		e4.click();
		e2.click();
		e3.click();
		  
		into.click();
		  
		e5.click();
		e2.click();
		e5.click();

		equals.click();
		
		s1 = iput.getText();
		s2 = oput.getText();
		System.out.println(s1 + s2);
		
	}
	
	public void divide() {						//  4000 / 200
		
		  e4.click();
		  
		  int i = 0 ;
		  while( i < 3) {
			  e0.click();
			  i++;
		  }
		  
		  div.click();
		  
		  e2.click();
		  e0.click();
		  e0.click();
		  
		  equals.click();
		  
		  s1 = iput.getText();
		  s2 = oput.getText();
		  System.out.println(s1 + s2);
			
	  }
	
	public void add() {									//  -234234 + 345345
		  
		  int j = 0;
		  int k = 0;
		  minus.click();
		  
		  while( j < 2 ) {
			  e2.click();
			  e3.click();
			  e4.click();
			  j++;
		  }
		  
		  plus.click();
		  
		  while( k < 2 ) {
			  e3.click();
			  e4.click();
			  e5.click();
			  k++;
		  }
		  

		  equals.click();
		  
		  s1 = iput.getText();
		  s2 = oput.getText();
	      System.out.println(s1 + s2);
			
		  
	  }
	
	public void subtract() {						// 234 - (-23094823)
		  

		  e2.click();
		  e3.click();
		  e4.click();
		  e8.click();
		  e2.click();
		  e3.click();
		  
		  minus.click();
		  
		  obracket.click();
		  minus.click();
		  e2.click();
		  e3.click();
		  e0.click();
		  e9.click();
		  e4.click();
		  e8.click();
		  e2.click();
		  e3.click();
		  cbracket.click();
		  
		  
		  equals.click();
		  
		  s1 = iput.getText();
		  s2 = oput.getText();
	      System.out.println(s1 + s2);
		  
	  }
	
	public void toURL() {
		dr.get(URL);
	}
	
	public void newTab() {
		dr.switchTo().newWindow(WindowType.TAB);
	}


}
