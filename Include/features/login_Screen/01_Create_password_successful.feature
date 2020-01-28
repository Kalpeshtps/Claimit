Feature: when User First time login with PID That time create Passoword Screen Should be OPen 

  @tag1
  Scenario: create Passowrd With successfully  
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
    