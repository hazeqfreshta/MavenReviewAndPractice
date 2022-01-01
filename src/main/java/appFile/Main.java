package appFile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {


	public static WebDriver driver;
	
	public static WebDriver SetUpBrowswer() {
		
		
		String browserName = "chrome";
		if(browserName.contains("chrome")) {
			
			String userDiretory = System.getProperty("user.dir")+"/src/main/java/drivers/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", userDiretory);
			
			 driver = new ChromeDriver();
			
		}else if (browserName.contains("edge")) {
			
			String userDiretory = System.getProperty("user.dir")+"/src/main/java/drivers/chromedriver.exe";
			System.setProperty("webdriver.edge.driver", userDiretory);
			
			driver = new EdgeDriver();
		}
		
		else {System.out.println("Wrong browswer selection");}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
		
	}
	
	
	
	


	
	public static void takeScreenShot() {
		System.out.println("ScreenShot");
	
	}

	
}

