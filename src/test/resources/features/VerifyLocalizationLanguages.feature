Feature: Verify localization on login page
  As a user, I shouldn't be able to see switch languages

  Background:
    Given the user on login page
  @test
  Scenario: User should see English language as first option
    Then English should be as first option

  Scenario: User should be able to see pick Russian language
    When User is clicking on Russian btn
    Then Russian should be displayed

  Scenario: User should be able to see pick Hebrew language
    When User is clicking on Hebrew btn
    Then Webelement Hebrew should be displayed