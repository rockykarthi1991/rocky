package pack2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c3 {

	@Test(groups="Two")
	public void t3() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		c.get("https://www.letskodeit.com/practice");
		c.findElementById("bmwcheck").click();
		Thread.sleep(3000);
		c.findElementById("benzcheck").click();
		Thread.sleep(3000);
		c.findElementById("hondacheck").click();
		Thread.sleep(3000);
		c.quit();
	}
}
