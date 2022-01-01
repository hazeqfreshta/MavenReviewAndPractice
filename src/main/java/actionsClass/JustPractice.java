package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import appFile.Main;

public class JustPractice extends Main {

	
	public static void main(String[] args) {
		
		driver = SetUpBrowswer();
		driver.get("http://tek-school.com/retail/");
		
		driver.findElement(By.xpath("//a[text()='Desktops']")).click();
		
		Actions action = new Actions(driver);
		
		
		
		action.contextClick().build().perform();
		
		
	}	

	
}

