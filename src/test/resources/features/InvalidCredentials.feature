Feature: Login functionality
  As a registered I should be able to login to my account so that I can use the modules.

  @ac2tc1
  Scenario Outline: Verify that user can not login with invalid credentials
    When User goes to application page
    And  User enters invalid  email "<email>" and valid password "<password>" and press enter key
    Then Verify the error message appears

    Examples:
      | email                         | password         |
      | posmanager15@mail.com         | posmanager       |
      | salesmanager@gmail.com        | salesmanager     |
      | expensesmanagr@info.com       | expensesmanager  |
      | manufuser@info.               | manufuser        |
      | inventory@info.com            | inventorymanager |

  @ac2tc2
  Scenario Outline: Verify that I can not login with invalid credentials
    When User goes to application page
    And  User enters valid email "<email>" and invalid password "<password>"and press enter key
    Then Verify the error message appears

    Examples:
      | email                      | password          |
      | posmanager60@info.com      | invalidpassword   |
      | salesmanager60@info.com    | invalidpassword   |
      | expensesmanager10@info.com | invalidpassword   |
      | manuf_user50@info.com      | invalidpassword   |
      | imm10@info.com             | invalidpassword   |