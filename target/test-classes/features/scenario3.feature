@scenario3
Feature: For Sauce Lab Site: https://www.saucedemo.com sort items testing 
    
  Scenario: To verify sort low to high    
    Given user is on saucedemo homepage   
    And user logged in using correct credential     
      | username      | password     |    
      | standard_user | secret_sauce |    
    And user sorts item low to high   
    And user adds required item to cart   
    And user proceeds to checkout   
    And user enters the following details for checkout    
      | FirstName | LastName | PostalCode |   
      | abc       | def      |     400087 |   
    When user confirm checkout    
    Then user verify final confirmation message   