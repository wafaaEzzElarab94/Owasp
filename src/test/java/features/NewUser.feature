Feature: Registration, then Login


  Scenario: User registration process with dynamic data
    Given that the user opens the Juice Shop website
    When the user clicks on the "join" button
    And the user should see the glue-up page
    And the user clicks on the "Not have an account? Register now" link
    And the user create new account using email Only
    And the user set firstname,lastname and password
    Then the user should be redirected to the login screen
