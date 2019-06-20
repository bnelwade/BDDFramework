#By using examples keyword handing data provider in cucumber

Feature: FB login Test

Scenario Outline: Fb login Test
    Given User is already on login page
    Then user enters "<username>" and "<password>"
    Then user clicks on sumbit button


    Examples: 
      |username|password|
      |bala    |bala123 |
      