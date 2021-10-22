package selenim;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class gunaaa {

	public static void main(String[] args) {
			
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\ELCOT\\Guna\\eclipse-workspace\\selenim\\driv\\msedgedriver.exe");
			WebDriver Driver = new EdgeDriver();
			
			
			Driver.get("https://www.amazon.in/");
			
			Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Driver.manage().window().maximize();
			
			JavascriptExecutor js=(JavascriptExecutor)Driver;
		
			WebElement serch = Driver.findElement(By.id("twotabsearchtextbox"));
			js.executeScript("arguments[0],setAttribute('value','iphone11')", serch);

			

	}
}
