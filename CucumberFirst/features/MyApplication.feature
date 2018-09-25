Feature: Test facebook smoke scenario

  Scenario Outline: Test login with credentials
    Given open browser and start applications
    When I enter valid "<usernames>" and valid "<passwords>"
    Then users should be able to login successfully

    Examples: 
      | usernames | passwords |
      | BhaskarK  |    123456 |
      | name2     |    123456 |
