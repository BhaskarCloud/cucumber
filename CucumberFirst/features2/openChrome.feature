Feature: Test facebook smoke scenario 
  
  Scenario: Test login with credentials
    Given open browser and start applications
    When I enter valid "usernames" and valid "passwords"
    Then users should be able to login successfully

    