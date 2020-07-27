@tag
Feature: User Test the Login Functionality

  @tag1
  Scenario: User Login the Jpet Application
    Given User launch the Pet Application
    When User registered the details and login 
    And User Search and add the product to the cart
    Then User place the order
    
    @tag2
  Scenario: User purchasing the pet in Jpet Application
    Given Customer launching the JPet Application
    When Customer registered the details and login the application
    And Customer Search the pet and added to the Cart
    Then Customer place the order
    
    
   
