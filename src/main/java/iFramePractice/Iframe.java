package iFramePractice;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import appFile.Main;

public class Iframe extends Main{

	public static void main(String[] args) throws IOException {
		
		
		driver=SetUpBrowswer();
				
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
		driver.switchTo().defaultContent();
		
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//span[text()='Alert']")).click();
		driver.switchTo().defaultContent();
		
		WebElement rightsideFrame = driver.findElement(By.name("classFrame"));
		driver.switchTo().frame(rightsideFrame);
		String text = driver.findElement(By.xpath("//h2[text()='Interface Alert']")).getText();
		System.out.println(text);
	
		
		
		
		
		
		
		
	}
	
	
}
