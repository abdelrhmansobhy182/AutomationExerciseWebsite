Feature: User should be Register
  Background: User Signup
    Given  Navigate to Website
    When Click on Signup Login button
    Then Verify 'New User Signup!' is visible

  Scenario: Register User with new email
    And Enter "abdelrhman" and "abd123@gmail.com" and Click Signup button
    And Fill Account Information
    And Fill Address Information
    Then Verify that ACCOUNT CREATED
    And Click Continue button
    Then Verify that Logged in as username is visible


Scenario: Register User with new email and delete
  And Enter "abdelrhman" and "abdo123@gmail.com" and Click Signup button
  And Fill Account Information
  And Fill Address Information
  Then Verify that ACCOUNT CREATED
  And Click Continue button
  Then Verify that Logged in as username is visible
  And Click Delete Account button
  Then Verify that ACCOUNT DELETED is visible and click Continue button

  Scenario: Register User with existing email
    And Enter "abdo" and "temp@gmail.com" and Click Signup button
    Then Verify error Email Address already exist is visible






