
Feature: User Login

  Scenario: Login with registered user credentials
    Given I open the Juice Shop website
  When I navigate to the login page
  And I enter valid credentials
  And I submit the login form
 Then I should be logged in successfully
