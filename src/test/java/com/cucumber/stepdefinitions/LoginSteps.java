package com.cucumber.stepdefinitions;

import java.util.Hashtable;
import com.cucumber.helper.UserActions;
import io.cucumber.java.en.Given;

public class LoginSteps {

	UserActions User;
	Hashtable<String,String> Data;

	public LoginSteps(UserActions User) {
		this.User = User;
	}

	@Given("^User Launched \"([^\"]*)\" in Browser$")
	public void user_Launched_in_Browser(String URL) throws Throwable {
		//User.OpenUrl(URL);
		User.setI(1);
		System.out.println("LaunchBrowser "+User.getI());
//		Log.info("Application is launched with URL");
	}

	
}
