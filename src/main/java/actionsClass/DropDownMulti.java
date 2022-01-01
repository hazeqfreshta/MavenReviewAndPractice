package actionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import appFile.Main;

public class DropDownMulti extends Main {

	public static void main(String[] args) {
		
		driver =SetUpBrowswer();
		driver.get("https://demoqa.com/select-menu");
		 
		
		Select cars = new Select(driver.findElement(By.id("cars")));
		boolean multiple=cars.isMultiple();

         if(multiple==true) {
        	 cars.selectByIndex(0);
        	 cars.selectByValue("audi");
        	 cars.selectByVisibleText("Saab");
         }
		
		List<WebElement> allSelectedOptions = cars.getAllSelectedOptions();
		for(int i =0; i<allSelectedOptions.size();i++) {
			String text = allSelectedOptions.get(i).getText();
			System.out.println(text);
		}
		
	}
	
	
	
}
