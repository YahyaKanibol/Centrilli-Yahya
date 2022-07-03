Feature: Login Functionality
  As a registered I should be able to login to my account so that I can use the modules.
@ac4tc1
  Scenario Outline: Verify that I got message if I leave empty any of credentials,"Please fill out this field" message appears when e-mail is missing
    When User goes to application page
    And  User enters valid password "<password>"
    And  User click on login button
    Then Verify the please fill out this field message appears(email missing)

    Examples:
      | password         |
      | salesmanager     |
      | posmanager       |
      | expensemanager   |
      | manufuser        |
      | inventorymanager |
@ac4tc2
  Scenario Outline: Verify that I got message if I leave empty any of credentials,"Please fill out this field" message appears when password is missing
    When User goes to application page
    And  User enters valid email "<email>"
    And  User click on login button
    Then Verify the please fill out this field message appears(password missing)

    Examples:
      | email                     |
      | posmanager10@info.com     |
      | salesmanager6@info.com    |
      | expensemanager10@info.com |
      | manuf_user10@info.com     |
      | imm10@info.com            |