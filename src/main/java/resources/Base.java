package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public Properties prop;
	public WebDriver driver;
	public WebDriver IntializeDriver() throws IOException
	{
		
		prop=new Properties();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\makgu\\eclipse-workspace\\FirstProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		String browsername=prop.getProperty("browser");
		
		
		if (browsername.equals("chrome"))

		{
			System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}	
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
}
	
	public void getscreenshot(String TestCasename,WebDriver driver) throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);
		
		String Destinationfile = System.getProperty("user.dir")+"\\reports\\"+TestCasename+".png";
		
		FileUtils.copyFile(src,new File(Destinationfile));
	}
		
	}
	
	
	
