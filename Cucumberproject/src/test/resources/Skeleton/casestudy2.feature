Feature: Loging into the test me app
Scenario Outline: User Logins for TestmeApp
    Given User opens login page
    When user enters "<username>" and "<password>"
    Then user will be Login Home page

    Examples: 
      |username|password|
      |soumyamd|soumya123|
      
