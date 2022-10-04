

Feature: Background demo

Background:
  Given Launch browser
  When User Enter Login
  When User Enter Password
  Then User Click on Login button
  And Navigate to Order
 
  Scenario: Check Previous Order
    Given Click on Previous Orders Link
    When I complete action
    Then I validate the outcomes
    

  
  Scenario: Check Order History
  Given Click on Cancell Orders Link
  Then Cancel Order Page should displayed
