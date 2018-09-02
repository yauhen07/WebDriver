Feature: Create new default Application

  Background:
    Given Login as Admin
    And Applications overview page is opened

  Scenario: Create Application
    When Populate first form with parameters:
      | @example.com | 1 | Computer Services |
    And Populate second form with parameters:
      | yauhenlast | Computer Maintenance, Repair, and Services. not elsewhere classified |
    Then Check MSF rate is 1.49%
