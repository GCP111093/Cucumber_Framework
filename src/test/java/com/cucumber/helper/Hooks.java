package com.cucumber.helper;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	UserActions User ;
	public Hooks(UserActions User) {
		this.User = User;
	}

	@Before(order=1,value="@chrome")
	public void beforeChrome() {
		System.out.println("Chrome Before Hook");
		User.setBrowserName("Chrome");
		//User.LaunchBrowser(BrowserType.Chrome);
	}
	
	@Before(order=1,value="@firefox")
	public void beforeFirefox() {
		System.out.println("Firefox Before Hook");
		User.setBrowserName("Firefox");
		//User.LaunchBrowser(BrowserType.Chrome);
	}
	
	@Before(order=1,value="@ie")
	public void before() {
		System.out.println("IE Before Hook");
		User.setBrowserName("IE");
		//User.LaunchBrowser(BrowserType.Chrome);
	}

	@After(order=1,value="@chrome")
	public void after(Scenario scenario) {
		System.out.println("After Hook");
		if (scenario.isFailed()) {
			//User.CaptureScreenshot(scenario,"Fail");

		}
		if (!scenario.isFailed()) {
			//User.CaptureScreenshot(scenario,"Pass");
		}
		//User.Quit();
	}

	/*
	 * @BeforeStep public void beforeStep(Scenario scenario) {
	 * 
	 * }
	 * 
	 * @AfterStep public void afterStep(Scenario scenario) {
	 * 
	 * if (scenario.isFailed()) { User.CaptureScreenshot(scenario,"Fail");
	 * 
	 * } if (!scenario.isFailed()) { User.CaptureScreenshot(scenario,"Pass"); }
	 * 
	 * }
	 */
}