@Login
Feature: Login
    As a user I want to login website

  Background: Already Page Recruitment NashTa Group
    Given User already open website Recruitment NasTa Group

  Scenario: LG_001
    Then User Click Email or Username Field

  Scenario Outline: LG_002 LG_003 LG_004
    Then User Click Email or Username Field
    Then Input any "<Data Test>"
    Examples:
      | Data Test |
      | ABCD      |
      | 1122      |
      | )^#$      |


  Scenario Outline: LG_005 LG_006 LG_007 LG_008
    Then User Click Password Field
    Then Input any "<Data Test>"
    Examples:
      | Data Test |
      | ABCD      |
      | 1122      |
      | )^#$      |


  Scenario: LG_009
    Then User Click And Input Email or Username & Password with Valid Data
    And User Click Sign In Button
    Then User already on landing page

  Scenario: LG_010, LG_011, LG_012
    Then User Click And Input Email & Password with Invalid Data

