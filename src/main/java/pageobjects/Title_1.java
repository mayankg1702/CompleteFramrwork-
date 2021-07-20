package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Title_1 {
	
	
public WebDriver driver;
	
	
	
	public Title_1(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;

}
	
	
	By women = By.linkText("Women");
	
	public WebElement getwomentitle()
	{
		
		return driver.findElement(women);
	}
	
	
	
	
}
















