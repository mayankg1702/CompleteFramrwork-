package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login_1 {
	
	
	public WebDriver driver;
	
	
	
	public login_1(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
		
	}
	
	
	
	By email = By.id("email");
	
	By password = By.id("passwd");
	By Login = By.id("SubmitLogin");
	
	
	

	public WebElement getemail()
	{
		
		return driver.findElement(email);
	}

	public WebElement getpassword()
	{
		
		return driver.findElement(password);
	}
	public WebElement hitlogin()
	{
		
		return driver.findElement(Login);
	}

	

}
