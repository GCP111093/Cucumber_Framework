package com.cucumber;

import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.cucumber.helper.UserActions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = { "classpath:features/" },
		glue = {"classpath:com.cucumber.stepdefinitions","classpath:com.cucumber.helper" },
		tags= {"@web","@regression"},
		strict = true,
		monochrome = true,
		dryRun = false,
		plugin = {"pretty","json:target/cucumber.json","rerun:target/rerun.txt"}
		
		)
//plugin = {"pretty","html:target/reports/normal",
//"json:target/cucumber.json","junit:target/cucumber.xml","rerun:target/rerun.txt"}

public class RunCucumberTest extends AbstractTestNGCucumberTests{
	
	
	UserActions User ;
	public RunCucumberTest() {
		
	}
	
	public RunCucumberTest(UserActions User) {
		this.User = User;
	}
	
	@BeforeMethod
	public void beforeMethod(ITestContext context) {
	//	Log.info("New Test Initiated Before Method");
		
	}

	@AfterMethod
	public void afterMethod(ITestContext context) {
	//	Log.info("New Test Initiated After Method");
	}

	@AfterSuite
	public void afterSuite(ITestContext context) {
		System.out.println("After Suite");
	}
	
	@DataProvider(parallel = true)
	@Override
	public Object[][] scenarios() {
		return super.scenarios();
	} 
}