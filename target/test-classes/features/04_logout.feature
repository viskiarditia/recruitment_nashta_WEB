@logout
Feature: logout
  As a user I want to logout website

  Background: Already Page Recruitment NashTa Group
    Given User already open website Recruitment NasTa Group
    Then User Click And Input Email or Username & Password with Valid Data
    And User Click Sign In Button
    Then User already on landing page

  Scenario: Normal Logout
    When User Click Avatar Profile choice Sign Out
    And User logout page

