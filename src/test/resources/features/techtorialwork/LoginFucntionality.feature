Feature:Testing the Login Functionality of Techtorial Work Website
  Background: Validate title and visibility of log_in
    Given User validates the title is 'techtorial'
    And user validates the login is visibale on the page

  Scenario: Happy Path Login Functionality (Positive)
#  Given User validates the title is 'techtorial'
#  And user validates the login is visibale on the page
  When user provide username and password to the loginPage
  Then  User validates the title 'Dashboard' from MainPage



  Scenario: Negative LoginFunctionality (incorrect email and password)
#  Given User validates the title is 'techtorial'
#    And user validates the login is visibale on the page
  When User provides 'ahmet@example.com' and '234234' to the LoginPage
  Then  User validates 'These credentials do not match our records.' and 'rgba(211, 0, 0, 1)' from LoginPage




  #navigate to url: https://techtorialwork.com/worksuit/public/login
  #Verify the title is "techtorial"
  #Verify "Log In" is visiable on the page
  #Enter correct email and password
  #Click login button
  #Verify title is "Dashboard"

#navigate to url: https://techtorialwork.com/worksuit/public/login
#Verify the title is "techtorial"
#Verify "Log In" is visiable on the page
#Enter incorrect email and password
#Click login button
#"Verify error message is displayed ""These credentials do not match our records.
#"" in red color."

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