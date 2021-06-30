Feature: Email Validation
  As a user, I should input email with correct format

  Background:
    Given the user on login page


  Scenario Outline:
    When user input incorrect "<email>"
    Then user should see an validation Error message

  Examples:
    |email|
    |hhorsovv@gmailcom|
    |hhorsovv@com|
    |hhorsovvgmail.com|
    |@gmail.com|
