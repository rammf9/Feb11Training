Feature: TestMe App Login 

  @tag1
  Scenario: Checking the TestMet App login functionality with valid credentials
    Given launch the chrome browser
    And Provide Application url
    When I enter valid user id and password
    And I click on sign-in button
    Then It should display TestMe application products 
    
