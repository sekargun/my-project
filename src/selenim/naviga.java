package selenim;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class naviga {

	
public static void main(String[] args) throws InterruptedException{
	
	
	System.setProperty("webdriver.edge.driver",
			"C:\\Users\\ELCOT\\Guna\\eclipse-workspace\\selenim\\driv\\msedgedriver.exe");
	WebDriver Driver = new EdgeDriver();
	
	
	Driver.get("https://www.facebook.com/");
	
	Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Driver.manage().window().maximize();
	

	Driver.navigate().to("https://www.amazon.in/");
	
	//Thread.sleep(3000);
	//Driver.navigate().back();
	
	//Thread.sleep(3000);
	//Driver.navigate().forward();
	
	//Thread.sleep(3000);
	//Driver.navigate().refresh();
	
	WebElement aa = Driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']"));
	aa.click();
	
	WebElement a2 = Driver.findElement(By.xpath("//div[@id='hmenu-customer-profile']"));
	a2.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
