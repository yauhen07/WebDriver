Feature: Test Login functionality

  Background:
    Given Login page is opened

  Scenario Outline: Login to SF
    When Populate <Login> and <Password> fields and login
    Then Home page title is Home | Salesforce

    Examples:
      | Login                       | Password          |
      | yauhen_valodzin@epam.com.qa | Ceakt_1234        |
      | qa@epam.com.qa              | Salesforce201806! |

