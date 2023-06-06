Feature: Dashboard in applitools

  Scenario Outline: Successful  View Account Information in to Dashboard
    Given The user opens the page
    When The user logs in with the following credentials: <userName> and <password>
    Then the total balance should be equal to: <balance>
    And the credit available should be equal to: <creditAvailable>
    And the total transactions should be equal to: <transactions>
    And the colors should be displayed correctly

    Examples:
      | userName | password | balance | creditAvailable | transactions |
      | usrtest  | password | $350    | $17,800         | 6            |

