Feature: Negative Login Functionality with wrong username or password
  As a user, I shouldn't be able to login using wrong username

  Background:
    Given the user on login page

  @wip
  Scenario:
    When user login with invalid username
    Then user click on button Next
    Then user login with invalid password
    Then user click on button Sign In
    Then user should see warning message on display
