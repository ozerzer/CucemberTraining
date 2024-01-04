

Feature: Testing Login Functionality for SauceLab


  Background: User Navigation
    Given User navigates to website 'https://www.saucedemo.com/'

  Scenario Outline: Happy Path Login
    When  user provides '<username>' and '<password>' to the login page
    Then  user validates the '<title>' from Mainpage
    Examples:
    |username|password|title|
    |standard_user|secret_sauce|Swag Labs|
    |problem_user |secret_sauce|Swag Labs|
    |error_user |secret_sauce|Swag Labs  |




