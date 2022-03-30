

Feature: Checking data provider with Orange HRM

  @tag1
  Scenario: Login with single data provider.
    Given User already in the OrangeHrm Login page.
   
    When I enter "Admin" and "admin123".
   
    Then check user succesfully login and came to home page.
    

  
  Scenario Outline: Orange HRM Login Data.
    Given User already in Orange HRM 
    When I enter user name  for the "<username>" and "<password>" in step
    Then I verify  step

    Examples: 
      | username | password | 
     	| Admin | admin123 |
     	| Admin |	sss |