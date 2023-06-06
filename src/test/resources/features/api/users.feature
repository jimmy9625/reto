Feature: users path

  Scenario Outline: Create succesful user whit name and job
    Given a user makes an API request
    When the user sends a POST request to /users with <name> and <job>
    Then the response code should be 201

    Examples:
      | name      | job                 |
      | Test User | Automation Engineer |

  Scenario Outline: Create unsuccesful user whit name and job not send job and no send name
    Given a user makes an API request
    When the user sends a POST request to /users with <name> and <job>
    Then the response code should be 403

    Examples:
      | name | job |
      |      |     |


  Scenario Outline: Search successful user with name and job, and search user with id
    Given a user makes an API request
    And the user sends a POST request to /users with <name> and <job>
    When the user sends a GET reques to /user whit id
    Then the response code should be 200
    And the job response is equals to <job>

    Examples:
      | name      | job                 |
      | Test User | Automation Engineer |
