package com.makemytrip.runner;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
        features = "src/test/resources/FeatureFiles",
        glue = "steps",
        tags = {"@Book_Tikect"}        
        )
public class TestRunner extends AbstractTestNGCucumberTests{
	  @BeforeClass
	    public  static void setup() {
	        ExtentProperties extentProperties = ExtentProperties.INSTANCE;
//	        extentProperties.setExtentXServerUrl("http://localhost:1337");
//	        extentProperties.setProjectName("TestNGProject");
	        extentProperties.setReportPath("output/myreport.html");
	    }

	    @AfterClass
	    public static void teardown() {
	        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
	        Reporter.setSystemInfo("user", System.getProperty("user.name"));
	        Reporter.setSystemInfo("os", "Mac OSX");
	        Reporter.setTestRunnerOutput("Sample test runner output message");
	    }

}
