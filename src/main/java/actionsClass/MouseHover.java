package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import appFile.Main;

public class MouseHover extends Main {

	public static void main(String[] args) {


		driver = SetUpBrowswer();
		
		driver.get("http://tek-school.com/retail/");
		
		WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
		
		
		Actions action = new Actions(driver);
		
		action.moveToElement(desktop).build().perform();
		action.click(desktop).build().perform();
		action.contextClick(desktop).build().perform();
		
		System.out.println("action was successful");
		
		

	}

}
