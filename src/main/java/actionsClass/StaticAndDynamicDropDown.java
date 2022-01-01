package actionsClass;

import java.util.ArrayList;

import appFile.Main;

public class StaticAndDynamicDropDown extends Main {

	public static void main(String[] args) {
		
		
		driver = SetUpBrowswer();
		driver.get("https://www.cheapoair.com/");
		
		ArrayList ar = new ArrayList();
		ar.add(20, "cars");
		
		System.out.println(ar);
		
	}

}
