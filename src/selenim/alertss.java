package selenim;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class alertss {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\ELCOT\\Guna\\eclipse-workspace\\selenim\\driv\\msedgedriver.exe");
		WebDriver Driver = new EdgeDriver();
		
		
		Driver.get("http://demo.automationtesting.in/Alerts.html");
		
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
	
		WebElement a = Driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		a.click();
		Alert a1 = Driver.switchTo().alert();
		a1.accept();
		
		Thread.sleep(3000);
		
		
	WebElement b = Driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel']"));
		b.click();
		Alert b1 = Driver.switchTo().alert();
		b1.dismiss();
		
		
		
	}

}
