package selenim;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class browselaunch {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\ELCOT\\Guna\\eclipse-workspace\\selenim\\driv\\msedgedriver.exe");
		WebDriver Driver = new EdgeDriver();
		
		
		Driver.get("https://www.facebook.com/");
		
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		
	
		WebElement findElement = Driver.findElement(By.name("email"));
		findElement.sendKeys("guna240495gg@gmail.com");
		
		WebElement findElement2 = Driver.findElement(By.name("pass"));
		findElement2.sendKeys("guna130792");
		
	
		
		WebElement findElement3 = Driver.findElement(By.name("login"));
		findElement3.click();
		

		Actions a=new Actions(Driver);
		
		WebElement findElement4 = Driver.findElement(By.xpath("//div[@aria-label=\"Account\"]"));
		a.click(findElement4).perform();
		
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		
			
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		}
		
		
	}