
Feature: employee Search Functionality

  Scenario: information functionalty
    And I have an array of employee records that include their birthday.
    When I execute this application program with the array of employees.
    Then I am returned an array of employees who's birthday is in the "Jan" month.

