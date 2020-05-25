Feature: validating login functionality

  Scenario: validating login functionality with valid credentials
    Given user is on MyPathshala page
    When user enters userName and passWord
    And user clicks login button and verify the message
    And user clicks my courses button
