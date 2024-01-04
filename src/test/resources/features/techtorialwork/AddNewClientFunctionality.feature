
@regression
Feature: Testing Adding New Client  Functionality in TechtorialWork Website
  Scenario Outline: Happy Path Adding New Client Functionality
    Given user provide username and password to the loginPage
    When  User Clicks Clients Button on the left side and click AddClientButton from ClientPage
  And  User provides '<name>' and  '<email>' to ClientDetails
  And User select '<country>'  and provide '<phoneNumber>' to ClientDetails
  And User provides '<companyName>','<companyWebsite>','<companyPhone>','<companyAddress>' , '<companyShippingAddress>' to CompanyDetails and click SaveButton
  Then User validates all the client details '<assertname>','<assertcompany>' and '<assertemail>','<status>' from table
  Examples:
  |name|email|country|phoneNumber|companyName|companyWebsite|companyPhone|companyAddress|companyShippingAddress|assertname|assertcompany|assertemail|status|
  |John Doe|john.doe@example.com1309|United States|5551234567|Doe Construction Inc.|http://www.doeconstruction.com|(555) 001-2345|456 Oak Avenue, Springfield, IL, 62701|789 Birch Lane, Springfield, IL, 62702|John Doe|Doe Construction Inc.|john.doe@example.com1309|Active|
  |John Doe|john.doe@example.com01209|United States|5551234567|Doe Construction Inc.|http://www.doeconstruction.com|(555) 001-2345|456 Oak Avenue, Springfield, IL, 62701|789 Birch Lane, Springfield, IL, 62702|John Doe|Doe Construction Inc.|john.doe@example.com1209|Active|

#  Scenario: Happy Path Client Search Functionality
#    Given user provide username and password to the loginPage
#    When  User Clicks Clients Button on the left side
#  And  User provide 'ad' to search area
#  And User validates all names containes 'ad' in the search result
#    And  User provide 'gmail' to search area
#    And User validates all names containes 'gmail' in the search result



    #TC 6    Validate adding new client
    #            navigate to url: https://techtorialwork.com/worksuit/public/login
    #            Enter correct email and password
    #            Click login button
    #            Click Clients on the left side of the page
    #            Click Add client button
    #            "Enter a client details with the following information:
    #(You can also create your own mock data)
    #
    #Name: John Doe
    #Email: john.doe@example.com7
    #Country: United States
    #Phone Number: +1 5551234567
    #
    #Company Information:
    #Name: Doe Construction Inc.
    #Email: contact@doeconstruction.com
    #Website: http:\www.doeconstruction.com
    #Phone: (555) 001-2345
    #Address: 456 Oak Avenue, Springfield, IL, 62701
    #Shipping Address: 789 Birch Lane, Springfield, IL, 62702"
    #            Click Save button
    #            Verify Client information is saved
    #TC 7    Validate Client Search functionality
    #            navigate to url: https://techtorialwork.com/worksuit/public/login
    #            Enter correct email and password
    #            Click login button
    #            Click Clients on the left side of the page
    #            Enter "ad" to search
    #            Verify all the names contains "ad" in the search result
    #            Enter "gmail" to search
    #            Verify all the emails has "gmail" in the search result
    #            Delete text in search box
    #            Verify the size of list is bigger than 0
    #TC 8     Validate order in Client page
    #            navigate to url: https://techtorialwork.com/worksuit/public/login
    #            Enter correct email and password
    #            Click login button
    #            Click Clients on the left side of the page
    #            Click Up and Down arrow next to the ID on Client list
#    #            Validate all IDs are listed in ascending order
#  TC 9     Validate new order page
#  navigate to url: https://techtorialwork.com/worksuit/public/login
#  Enter correct email and password
#  Click login button
#  Click Order on the left side of the page
#  Click Add New Order button
#  "Validate ""Select the client to show billing address."" is displayed
#  "
#  Validate "Add Shipping Address" button is displayed
#  Validate "Add at-least 1 item." text is displayed
#  Click filter button next to the Select Product
#  Validate Select Product Category is displayed
#
#  TC 10    Validate Adding New Order
#  navigate to url: https://techtorialwork.com/worksuit/public/login
#  Enter correct email and password
#  Click login button
#  Click Order on the left side of the page
#  Click Add New Order button
#  "Validate ""Select the client to show billing address."" is displayed
#  "
#  Validate "Add Shipping Address" button is displayed
#  Select client David Wilson
#  "Validate billing address: 890 Maple Avenue, Seattle, WA, 98102
#  "
#  "Validate Shipping Address: 123 Rainier Blvd, Seattle, WA, 98104
#  "
#  Select product : Mid-Size Wheeled Paver
#  Validate product is added total price is 257400
#  Add client note: "New product for the Wilson. The delivery date should be before January."
#  Click Submit button
#  Validate the order is added to the order page

#
#  Scenario: Happy Path create functionality for new client with DataTable
#    Given User provides username and password to the loginPage
#    When User clicks Clients button
#    And User clicks add client and provides personal information
#      | name    | John Doe                |
#      | email   | john.doe987@example.com |
#      | country | United States           |
#      | mobile  | 3147353233              |
#    And User provides company information
#      | companyName    | Doe Construction Inc.           |
#      | companyWebsite | https://www.doeconstruction.com/ |
#      | companyPhone   | 31442423322                     |
#    And User provides address information
#      | 456 Oak Avenue, Springfield, IL, 62701 | 789 Birch Lane, Springfield, IL, 62702 |
#    Then User clicks save button and validates information
#      | John Doe | Doe Construction Inc. | john.doe987@example.com | Active |