@web @regression @firefox
Feature: Login with Valid Credentials and Logout
  To Check application is allowing user to perform login with valid credentials and logout from the application

  
  Scenario Outline: To Verify the Login with Valid Credentials
    Given User Launched "<url>" in Browser
    And Application base page is displayed with Login Username and Password Fields
    When User enters Username : "<username>" , Password : "<password>"
    And Clicks on the submit button
    Then User Verifies the application is logged in successfully

    Examples: 
      | url                                    | username | password   |
      | https://parabank.parasoft.com/parabank | goutham  | 9876543210 |

  
  Scenario: To Verify the Login with InValid Credentials
    Given User Launched "<url>" in Browser
    Then User Verifies the application is logged in successfully
