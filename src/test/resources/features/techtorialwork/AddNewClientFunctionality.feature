Feature: Testing Adding New Client  Functionality in TechtorialWork Website
  Scenario: Happy Path Adding New Client Functioanlity
    Given user provide username and password to the loginPage
    When  User Clicks Clients Button on the left side and click AddClientButton from ClientPage
  And  User provides 'John Doe' and  'john.doe@example.com' to ClientDetails
  And User select 'United States and provide '(555) 123-4567' to ClientDetails
  And User provides 'Doe Construction Inc.','contact@doeconstruction.com','http:\www.doeconstruction.com','(555) 001-2345','456 Oak Avenue, Springfield, IL, 62701' , '789 Birch Lane, Springfield, IL, 62702' to CompanyDetails and click SaveButton
  Then User validates all the client details 'John Doe','Doe Construction Inc.' and 'john.doe@example.com','25-12-2023' from table




















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
    #            Validate all IDs are listed in ascending order