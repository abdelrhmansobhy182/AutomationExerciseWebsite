Feature: User should be Login
  Background: Go to Login and signup page
    Given  Navigate to Website
    When Click on Signup Login button
    Then Verify Login To Your Account is Visible


  Scenario: user login with valid Data
    And Enter "abd123@gmail.com" and "123" and Click Login button
    Then Verify that Logged in as username is visible
    And Click Delete Account button
    Then Verify that ACCOUNT DELETED is visible


  Scenario: user login with invalid data
    And Enter "aaaaaaa@gmail.com" and "123" and Click Login button
    Then Verify error Your email or password is incorrect is visible