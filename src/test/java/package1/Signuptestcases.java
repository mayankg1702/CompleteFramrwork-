package package1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.Signup_1;
import resources.Base;

public class Signuptestcases extends Base{
	
public WebDriver driver;
	
	@BeforeTest
	
	public void beforetest() throws IOException
	{
		
		driver = IntializeDriver();
	}
	
	@Test(dataProvider="getdata")
	public void firstlogin(String emailid, String firstname, String lastname, String password, String address, String city, String PC, String mobile, String Addfinal) throws IOException
	{
	
		driver.get(prop.getProperty("url"));
		
		Signup_1 sgn_1 = new Signup_1(driver);
		
		
		sgn_1.emailid().sendKeys(emailid);
		sgn_1.createaccount().click();
		sgn_1.title().click();
		sgn_1.firstname().sendKeys(firstname);
		sgn_1.lastname().sendKeys(lastname);
		sgn_1.password().sendKeys(password);

		sgn_1.address().sendKeys(address);
		sgn_1.city().sendKeys(city);
 		Select s = new Select(driver.findElement(By.id("id_state")));
                 s.selectByValue("4");
		
                 sgn_1.postcode().sendKeys(PC);
                 sgn_1.mobile().sendKeys(mobile);
                 sgn_1.aliasadd().sendKeys(Addfinal);
                 sgn_1.Register().click();
          		Assert.assertEquals(driver.getTitle(), "My account - My Store");
          		sgn_1.signout().click();
		
	}
	
	@Test(dataProvider="getdata1")
	public void secondlogin(String emailid, String firstname, String lastname, String password, String address, String city, String PC, String mobile, String Addfinal) throws IOException
	{
	
		driver.get(prop.getProperty("url"));
		
		Signup_1 sgn_1 = new Signup_1(driver);
		
		
		sgn_1.emailid().sendKeys(emailid);
		
		sgn_1.createaccount().click();
   		Assert.assertEquals(driver.getTitle(), "Login - My Store");

		/*sgn_1.title().click();
		sgn_1.firstname().sendKeys(firstname);
		sgn_1.lastname().sendKeys(lastname);
		sgn_1.password().sendKeys(password);

		sgn_1.address().sendKeys(address);
		sgn_1.city().sendKeys(city);
 		Select s = new Select(driver.findElement(By.id("id_state")));
                 s.selectByValue("4");
		
                 sgn_1.postcode().sendKeys(PC);
                 sgn_1.mobile().sendKeys(mobile);
                 sgn_1.aliasadd().sendKeys(Addfinal);
                 sgn_1.Register().click();*/

	}
	
	
	@AfterTest
	public void closewindow()
	{
	driver.manage().deleteAllCookies();
	driver.close();
	driver=null;

	}
		

	@DataProvider
	public Object[][] getdata()
	{
		// Rows stands for how many different data types test should run means number of test cases
	
		// column stands for how many values per each test 
		Object[][] data=new Object[1][9];
		//0th Row
	
	    data[0][0]= "maan1298@kellton.com";
	    data[0][1]= "ana";
	    data[0][2]= "Gupta";
	    data[0][3]= "qat@123";
	    data[0][4]= "Ghaziabad";
	    data[0][5]= "XYZ";
	    data[0][6]= "21112";
	    data[0][7]= "857496241";
	    data[0][8]="hello all";  
	 
	    return data;

}
	
	@DataProvider
	public Object[][] getdata1()
	{
		// Rows stands for how many different data types test should run means number of test cases
	
		// column stands for how many values per each test 
		Object[][] data=new Object[1][9];
		//0th Row
	
	    data[0][0]= "maan1298@kellton.com";
	    data[0][1]= "prem";
	    data[0][2]= "Gupta";
	    data[0][3]= "qat@123";
	    data[0][4]= "Ghaziabad";
	    data[0][5]= "XYZ";
	    data[0][6]= "21011";
	    data[0][7]= "9999092535";
	    data[0][8]="hello all";
	    
	  
	 
	    return data;

}


	
}
