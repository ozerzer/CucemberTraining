Feature: Testing The Search Product Functionality

  Background:  Navigation to website
    Given  When user navigates to the website 'https://www.etsy.com/'

  Scenario Outline: Search Functionality Happp path for Etsy Hat
    When  User searches '<productName>' for Etsy
    Then  User validates the title '<expectedTitle>' from Etsy
  Examples:
  | productName|expectedTitle|
  |Hat         |Hat - Etsy   |
  |Key         |Key - Etsy   |
  |Pin         |Pin - Etsy   |

  Scenario: Search Functionality Happy path for Etsy Hat
    When  User searches for Etsy
    |productName|Key|
    Then  User validates the title  from Etsy
   |Key - Etsy|

#  Scenario: Search Functionality Happp path for Etsy Hat
#    When  User searches 'Key' for Etsy
#    Then  User validates the title 'Key - Etsy' from Etsy
#
#  Scenario: Search Functionality Happp path for Etsy Hat
#    When  User searches 'Pin' for Etsy
#    Then  User validates the title 'Pin - Etsy' from Etsy