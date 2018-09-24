Feature: Test facebook smoke scenario 
  
  Scenario: Test login with credentials
    Given open browser and start applications
    When I enter valid usernames and valid passwords
    Then users should be able to login successfully
 
  Scenario: Test login with credentials
    Given open browser and start application
    When I enter valid username and valid password
    Then user should be able to login successfully
