package com.cucumber.pageobjects;

import org.openqa.selenium.By;

import com.cucumber.helper.ObjectHelper;

public class LoginPage extends ObjectHelper{
	
	public static final By UserName = InputBox_Below_Label("Username");
	
	public static final By Password = InputBox_Below_Label("Password");

	public static final By SubmitButton = Button("Submit");

	

}
