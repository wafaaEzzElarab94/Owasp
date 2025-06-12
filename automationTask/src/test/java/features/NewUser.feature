Feature: Registration, then Login


  Scenario: User registration process with dynamic data
    Given that the user opens the Juice Shop website
    When the user clicks on the "website link"
    Then the user should see a homepage
    When the user clicks on the "join" button
    Then the user should see the glue-up page
    And the user clicks on the "Login" button
    Then the user should see the Login pop-up
    And the user clicks on the "Not have an account? Register now" link
    Then the user should see the register/account screen
    And the user enters his email address
    And the user accepts the terms
    And the user clicks on the "continue" button
    Then the user should see the register/byemail screen
    And the user enters a first name, last name, and password
    And the user accepts the terms
    And the user clicks on the "create account" button
    Then the user should be redirected to the login screen
