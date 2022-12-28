Feature: Sign In Feature


  @Test
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Sara.soror@gmail.com' and password 'Sara123$'
    And User click on login button
    Then User should be logged in into Account


@signUp
  Scenario: Verify user can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name | email                | password | confirmPassword |
      | Ahmad | Ahmad.ahmadii1234@gmail.com | Ahmad1234$ | Ahmad1234$        |
    And User click on SignUp button
    Then User should be logged into account page
