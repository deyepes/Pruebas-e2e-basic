Feature: Login swaglabs

  As a user
  I want to log in to the swaglabs application
  to view the products.

  Scenario: Login with wrong password
    Given User is on the login page
    When User attempts to login with username "standard_user" and password "wrong_password"
    Then he should be presented with the error message "Epic sadface: Username and password do not match any user in this service"