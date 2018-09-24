Feature: Test facebook smoke scenario 
  
  Scenario: Test login with credentials
    Given open browser and start application
    When I enter valid username and valid password
    Then user should be able to login successfully
 

