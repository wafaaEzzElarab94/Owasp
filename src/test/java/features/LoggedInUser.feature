
Feature: User Login

  Scenario: Login with registered user credentials
    Given User open the Login Page
    When User send the email address and password
    Then User should be able to see verfication popup
