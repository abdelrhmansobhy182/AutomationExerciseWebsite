Feature: Verify Contact Us is Working


  Scenario: user login with valid Data
    Given  Navigate to Website
    And Click on Contact Us button
    And Verify GET IN TOUCH is visible
    And Enter name, email, subject and message
    And Upload file And Submit
    And Click Ok Button
    Then Verify success message Success Your details have been submitted successfully is visible
    Then Click Home button and verify that landed to home page successfully








