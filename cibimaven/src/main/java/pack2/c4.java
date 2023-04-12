package pack2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class c4 {

	
	@Test(groups="Two")
	public void t4()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		c.get("https://jqueryui.com/slider/");
		c.switchTo().frame(0);
		Actions ac= new Actions(c);
		WebElement ele = c.findElementById("slider");
		ac.dragAndDropBy(ele,50, 0).build().perform();
		c.quit();
	}
}
