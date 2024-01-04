
@regression
Feature: Testing Adding Product Functionality in TechtorialWork Website


  Scenario: Happy Path Product Addition Functionality
    Given  user provide username and password to the loginPage
    When User clicks Products button on the left side and AddProductButton from ProductPage
    And User provides 'Truck-Mounted Crane' and '15000' to ProductDetails
    And  User selects 'Lifting and Material Handling Equipment', 'Mobile Cranes' and  '1' from dropdowns
    And User clicks purchase checkbox and add ' It is a good product'
   And  User provides picture 'C:/Users/ozery/Downloads/usa.png' and click save button
    Then  User validates all the product details , 'Truck-Mounted Crane','$16,500.00','Allowed' from table

    #navigate to url: https://techtorialwork.com/worksuit/public/login
    #Enter correct email and password
    #Click login button
    #Click Products on the left side of the page
    #Click App.AddProduct button
    #Enter the product name : Truck-Mounted Crane
    #Enter the product price : $15000
    #Select the product category "Lifting and Material Handling Equipment"
    #Select the sub Catergory: Mobile Cranes
    #Select Federal Tax
    #Click Client can purchase check box
    #Add description for the product
    #Add product picture (You can download it in internet)
    #Click save button
    #Verify you can see product details on product page


    Scenario:Happy Path Product Filter Functionality
      Given  user provide username and password to the loginPage
      When User clicks Products Button
      And User selects 'Lifting and Material Handling Equipment' and 'Mobile Cranes' for categories
      And User clicks three dots and view button from ProductPage
      Then User validates 'Lifting and Material Handling Equipment' and 'Mobile Cranes' from action view






      #navigate to url: https://techtorialwork.com/worksuit/public/login
      #Enter correct email and password
      #Click login button
      #Click Products on the left side of the page
      #Select the product category "Lifting and Material Handling Equipment"
      #Select the sub Catergory: Mobile Cranes
      #Click three dots for first product
      #Click View button
      #Verify product category and sub category is matching with selection