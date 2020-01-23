
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: User able to login and logout
    Given i want to launch application
    Then verify Create new Paswword button is display  
    When Tap on Create new Paswword button
    Then Verify Confirm Password text box Is display 
    When Enter Password and Confirm Password fill both Filed 
    When Tap on SIGN IN button
    Then verify Dashbord Screen open
    When Tap Side menu and Click on Log out button
    Then verify Enter Password Screen Is open
    When tap on Login with different PID
    When DIsplay Alret Popup and tap on yes 
    