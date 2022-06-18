package com.orangeHRM.utils;

import org.testng.annotations.DataProvider;

public class OrangeHRM_TestData {
	
	@DataProvider(name = "Login")
public Object[][] Login(){
	return new Object[][] {
		{"Admin", "admin123"},
	};
}
	

@DataProvider(name = "addUsers")
	public Object[][] dataForAddingUsers() {
		return new Object[][] {
			{"Admin", "Fiona Grace", "grandal", "Enabled", "grandal@123", "grandal@123"},
			{"ESS", "Fiona Grace", "fclarson", "Disabled", "userAdd@1", "userAdd@1"},
			{"ESS", "Fiona Grace", "thuds123", "Enabled", "thuds@@@123", "thuds@@@123"},
		};
	}

}
