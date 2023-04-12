package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class c1 {
	
	
	WebDriver ob;
	@Test(priority=0)
	public void setup() throws MalformedURLException
	{
		
		String nodeurl="http://192.168.1.36:11440/wd/hub";
		// selecting node features from hub
		DesiredCapabilities c = DesiredCapabilities.chrome();
		
				c.setBrowserName("chrome");
		        c.setPlatform(Platform.WINDOWS);
		       
		       
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\hp\\\\Documents\\\\chromedriver.exe");
		// create an object for remote webdriver class=>  node address, features 
		 ob= new RemoteWebDriver(new URL(nodeurl),c);  
		 ob.get("http://www.google.com");
	}
	
	@Test(priority=1)
	public void login() throws InterruptedException
	{
    
		System.out.println(ob.getTitle());
	Thread.sleep(3000);
	ob.quit();
	}
}