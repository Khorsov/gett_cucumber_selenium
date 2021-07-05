Feature: Verify Forget Password button
  As a user, I shouldn't be able to see "Forget Password" when login

  Background:
    Given the user on login page

  @wip
  Scenario:
    When user click on Forget Password button
    Then user should see message "Need to access your account?"
    Then user should see message "Enter your corporate email and we'll send you instructions for creating a new password."
    Then user should input his email
    Then user should click Reset Password button
    Then user should see success notification message