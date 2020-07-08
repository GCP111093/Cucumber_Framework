package com.cucumber.stepdefinitions;

import java.util.Hashtable;

import com.cucumber.helper.UserActions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

	UserActions User;
	Hashtable<String,String> Data;

	public SearchSteps(UserActions User) {
		this.User = User;
	}

	@And("^Application base page is displayed with Login Username and Password Fields$")
	public void application_base_page_is_displayed_with_Login_Username_and_Password_Fields() throws Throwable {
		
		System.out.println("applicatoin base "+User.getI() + " "+ User.getBrowserName());
		User.setI(2);
		
		//assertEquals(true, User.isDisplayed(LoginPage.UserName));
		//assertEquals(true, User.isDisplayed(LoginPage.Password));
//		Log.info("Username and Password are displayed as expected");
	}

	@When("^User enters Username : \"([^\"]*)\" , Password : \"([^\"]*)\"$")
	public void user_enters_Username_Password(String Username, String Password) throws Throwable {
		//User.SendKeys(LoginPage.UserName, Username);
		//User.SendKeys(LoginPage.Password,Password);
		System.out.println("user enters username "+User.getI()+ " "+ User.getBrowserName());
		
	//	Log.info("Username "+Username+"and Password are filled with data ");
	}

	@And("^Clicks on the submit button$")
	public void clicks_on_the_submit_button() throws Throwable {
		System.out.println("User Clicks on Submit button "+User.getI()+ " "+ User.getBrowserName());
		
		 // assertEquals(true,User.isEnabled(LoginPage.SubmitButton));
		  //User.Click(LoginPage.SubmitButton);
		  //Log.info("Clicked on the Submit Button");
	}

	@Then("^User Verifies the application is logged in successfully$")
	public void user_Verifies_the_application_is_logged_in_successfully() throws Throwable {
		System.out.println("User verifies the application "+User.getI()+ " "+ User.getBrowserName());
		//Log.info("User has logged successfully");
	}

}
