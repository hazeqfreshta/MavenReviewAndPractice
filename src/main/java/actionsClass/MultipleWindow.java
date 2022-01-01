package actionsClass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import appFile.Main;

public class MultipleWindow extends Main {
	
	public static void main(String[] args) {
		
		driver = SetUpBrowswer();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.className("blinkingText")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("this is parent window");
	
		Iterator<String> iterator = windowHandles.iterator();
		
		String parentWindow = iterator.next();
		System.out.println("hi I am parent window");
		String childWindow = iterator.next();
		System.out.println("hi I am child");
		
		driver.switchTo().window(childWindow);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println("this is child window");
		
		
		driver.switchTo().window(parentWindow);
		System.out.println("I am back from child");
		
		
		
		
		
		
		
		

}
}