package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signup_1 {
	
	
	public WebDriver driver;
	
	
	public Signup_1(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
		
	}
	
By emailid   =    By.id("email_create");
	
	By createaccount   =    By.id("SubmitCreate");
	By title   =    By.id("id_gender1");

	By firstname   =    By.id("customer_firstname");

	By lastname   =    By.id("customer_lastname");

	By password   =    By.id("passwd");

	//By fn2   =    By.id("firstname");
	//By ln2   =    By.id("lastname");
    By address = By.id("address1");
    By city = By.id("city");
   // By stateD = By.id("id_state");
    By postcode = By.id("postcode");
By mobile = By.id("phone_mobile");
By aliasadd = By.id("alias");
By Register = By.id("submitAccount");
    By Signout = By.linkText("Sign out");
    
	   
	   public WebElement emailid()
	   {
	   	
	   	return driver.findElement(emailid);
	   	
	   	
	   }
	   
	   public WebElement createaccount()
	   {
	   	
	   	return driver.findElement(createaccount);
	   	
	   	
	   }
	   public WebElement title()
	   {
	   	
	   	return driver.findElement(title);
	   	
	   	
	   }
	   public WebElement firstname()
	   {
	   	
	   	return driver.findElement(firstname);
	   	
	   	
	   }
	   public WebElement lastname()
	   {
	   	
	   	return driver.findElement(lastname);
	   	
	   	
	   }
	   public WebElement password()
	   {
	   	
	   	return driver.findElement(password);
	   	
	   	
	   }
	 
	   public WebElement address()
	   {
	   	
	   	return driver.findElement(address);
	   	
	   	
	   }
	   public WebElement city()
	   {
	   	
	   	return driver.findElement(city);
	   	
	   	
	   }
	   /*public WebElement stateDropdown()
	   {
	   	
	   	return driver.findElement(stateD);}*/
	   	
	   	
	   
	   public WebElement postcode()
	   {
	   	
	   	return driver.findElement(postcode);
	   	
	   	
	   }
	   public WebElement mobile()
	   {
	   	
	   	return driver.findElement(mobile);
	   	
	   	
	   }
	   public WebElement aliasadd()
	   {
	   	
	   	return driver.findElement(aliasadd);
	   	
	   	
	   }
	 
	   public WebElement Register()
	   {
	   	
	   	return driver.findElement(Register);
	   	
	   	
	   }
	   
	   public WebElement signout()
	   {
	   	
	   	return driver.findElement(Signout);
	   	
	   	
	   }
	
}
