Feature: User should be Login and Logout


  Scenario: user login with valid Data
    Given  Navigate to Website
    When Click on Signup Login button
    Then Verify Login To Your Account is Visible
    And Enter "temp@gmail.com" and "123" and Click Login button
    Then Verify that Logged in as username is visible
    And Click Logout button
    Then Verify that user is navigated to login page
