package selenim;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class amazon {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\ELCOT\\Guna\\eclipse-workspace\\selenim\\driv\\msedgedriver.exe");
		WebDriver Driver = new EdgeDriver();
		
		
		Driver.get("https://www.amazon.in/");
		
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Actions a=new Actions(Driver);
		
		Robot r=new Robot();
		
		WebElement findElement = Driver.findElement(By.id("twotabsearchtextbox"));
		findElement.sendKeys("iphone");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		

		
		//WebElement findElement2 = Driver.findElement(By.xpath("(//a[@class=\"a-link-normal a-text-normal\"])[1]"));
		//a.click(findElement2).perform();
		
		//WebElement findElement3 = Driver.findElement(By.id("priceblock_ourprice"));
		//a.click(findElement3).perform();
	
		
		
		
		
		

	
	}
	
	
}
