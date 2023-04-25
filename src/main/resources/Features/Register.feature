Feature: User should be Register
Scenario: user Register
  Given  Navigate to Website
  When Click on Signup Login button
  Then Verify 'New User Signup!' is visible
  And Enter name and email address and Click 'Signup' button
  And Fill Account Information
  And Fill Address Information
  Then Verify that ACCOUNT CREATED
  And Click Continue button
  Then Verify that Logged in as username is visible
  And Click Delete Account button
  Then Verify that ACCOUNT DELETED is visible and click Continue button






