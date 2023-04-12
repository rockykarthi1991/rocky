package filhn;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class c2 {
	
	@Test
	public void t1() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		c.get("https://jqueryui.com/droppable/");
		File f = c.getScreenshotAs(OutputType.FILE);
		//copy=> paste=> FileUtils => apache directory studio common io
		FileUtils.copyFile(f, new File("C:\\Users\\hp\\eclipse-workspace\\cibimaven\\screenshots\\before.png"));
		c.switchTo().frame(0);
		Actions ac= new Actions(c);
		WebElement ele1 = c.findElementById("draggable");
		WebElement ele2 = c.findElementById("droppable");
		ac.dragAndDrop(ele1, ele2).build().perform();
		File f1 = c.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("C:\\Users\\hp\\eclipse-workspace\\cibimaven\\screenshots\\after.png"));
		Thread.sleep(3000);
		c.quit();
	}

}
