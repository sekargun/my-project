package selenim;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class sreenshort {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\ELCOT\\Guna\\eclipse-workspace\\selenim\\driv\\msedgedriver.exe");
		WebDriver Driver = new EdgeDriver();
		
		
		Driver.get("https://www.amazon.in/");
		
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		TakesScreenshot tk=(TakesScreenshot)Driver;
		
		
		
		File from = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(from);
		File to=new File("C:\\Users\\ELCOT\\Guna\\eclipse-workspace\\selenim\\screenshort\\amazon.png");
		FileUtils.copyFile(from, to);
		System.out.println("------------done--------");
		
		
		
		

		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
