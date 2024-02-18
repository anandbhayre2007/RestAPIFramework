@tag
Feature: PayTm login feature
  I want to test PayTM login feature

  @tag1
  Scenario: Home page default login
    Given user is on home page
    When user enters the valid credentials
    And click on login button
    Then home page should be displayed