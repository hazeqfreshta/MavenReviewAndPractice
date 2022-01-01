package actionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import appFile.Main;

public class DateManage extends Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=SetUpBrowswer();
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		List<WebElement> listDays = driver.findElements(By.cssSelector(".ui-datepicker-calendar tbody tr td"));
		System.out.println(listDays.size());
		
		for(int i=0; i<listDays.size();i++) {
			
			String text = listDays.get(i).getText();
			
			System.out.println(text);
			
			if(text.equalsIgnoreCase("27")) {
				listDays.get(i).click();
				break;
			}
			
		}
		
		
//		driver.switchTo().defaultContent();
		
		
		
		
		
		
		

	}

}
