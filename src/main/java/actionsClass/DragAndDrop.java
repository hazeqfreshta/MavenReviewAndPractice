package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import appFile.Main;

public class DragAndDrop extends Main {

	public static void main(String[] args) {


		
		driver=SetUpBrowswer();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement des = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		
		Actions act = new Actions(driver);
		
//		act.dragAndDrop(source, des).build().perform();
		
//		act.clickAndHold(source).moveToElement(des).build().perform();// second way to drag and drop
	     act.clickAndHold(source).moveToElement(des).release();
		
//		driver.close();
		
		
		
		System.out.println("Action was successful");

	}
	

}
