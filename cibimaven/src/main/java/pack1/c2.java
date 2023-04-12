package pack1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class c2 {

	
	@Test(groups="One")
	public void t2() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		c.get("https://jqueryui.com/droppable/");
		//webelements: inside  a frame
		// switch our control to that frame
		// id, index, name
		c.switchTo().frame(0);
		Actions ac= new Actions(c);
		WebElement ele1 = c.findElementById("draggable");
		WebElement ele2 = c.findElementById("droppable");
		ac.dragAndDrop(ele1, ele2).build().perform();
		Thread.sleep(3000);
		c.quit();
	}
}
