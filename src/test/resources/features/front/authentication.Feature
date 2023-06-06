Feature: Authentication

  Scenario Outline:  Authentication Successful
    Given The user opens the page
    When The user logs in with the following credentials: <userName> and <password>
    Then the user sees their <name> displayed

    Examples:
      | userName | password | name       |
      | fernando | perez    | Jack Gomez |

  Scenario Outline:  Authentication Unsuccessful Bad Credentials
    Given The user opens the page
    When The user logs in with the following invalid credentials: <userName> and <password>
    Then the user sees mensage wrong credentials

    Examples:
      | userName     | password |
      | pepito@perez | 0000     |