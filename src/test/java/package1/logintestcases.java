package package1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.login_1;
import resources.Base;

public class logintestcases extends Base {
	
	public WebDriver driver;
	
	@BeforeTest
	
	public void beforetest() throws IOException
	{
		
		driver = IntializeDriver();
	}
	
	
	@Test(dataProvider="getdata")
	public void unthoriseduser(String Email, String Password) throws IOException
	{
	

		driver.get(prop.getProperty("url"));
		
		login_1 lg1 =new login_1(driver);
		lg1.getemail().sendKeys(Email);
		lg1.getpassword().sendKeys(Password);
		lg1.hitlogin().click();
		Assert.assertEquals(driver.getTitle(), "Login - My Store");
		
	}
	@Test(dataProvider="getdata1")
	public void z_user(String Email, String Password) throws IOException
	{
	

		driver.get(prop.getProperty("url"));
		
		login_1 lg1 =new login_1(driver);
		lg1.getemail().sendKeys(Email);
		lg1.getpassword().sendKeys(Password);
		lg1.hitlogin().click();
		Assert.assertEquals(driver.getTitle(), "My account - My Store");

		
	}

	@AfterTest
	
	public void teardown()
	{
		
		driver.manage().deleteAllCookies();
		
		driver.close();
		driver=null;

	}

	
	@DataProvider
	
	public Object[][] getdata()
	{
		//rows - stands for size of array means total number of different test cases
		//columns - number of test data in each test case
		
		
		Object[][] data=new Object[5][2];
		// 0th row
		data[0][0] = "memo7@gmail.com";
		data[0][1] = "qat@1234";
		
		
		//1th row
		data[1][0] = "memo8@gmail.com";
		data[1][1] = "qat@123";
		
		data[2][0] = "    ";
		data[2][1] = "qat@123";
		
		data[3][0] = "memo12@gmail.com";
		data[3][1] = "    ";
		
		data[4][0] = "     ";
		data[4][1] = "     ";
		
		
        return data;
	}
	
@DataProvider
	
	public Object[][] getdata1()
	{
		//rows - stands for size of array means total number of different test cases
		//columns - number of test data in each test case
		
		
		Object[][] data=new Object[1][2];
		// 0th row		
		//1th row
		data[0][0] = "makgupta.cool@gmail.com";
		data[0][1] = "qat@123";
		
		
		
        return data;
	}
	
	
	
}
