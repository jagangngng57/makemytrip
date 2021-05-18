package com.makemytrip.steps;

import com.makemytrip.utils.SeleniumDriver;

import cucumber.api.java.Before;

public class BeforeActions  {

	@Before
    public static void setUp() {
		//ExtentCucumberFormatter.initiateExtentCucumberFormatter();
    	System.out.println("Before");
       SeleniumDriver.setUpDriver();
    }
}
