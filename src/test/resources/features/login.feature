@Login
Feature: Login
    As a user I want to login website 

  Scenario: TC_001
    Given User already open webstie Recuitment NasTa Group
    When User Click menu Login/Register
    And User Already Log into Recuitment NasTa Group page
    Then User Click Email or Username Field

  Scenario: TC_002
    Given User already open webstie Recuitment NasTa Group
    When User Click menu Login/Register
    And User Already Log into Recuitment NasTa Group page
    Then User Click Email or Username Field
    Then Input any alphabet (e.g: Abcd)

  Scenario: TC_003
    Given User already open webstie Recuitment NasTa Group
    When User Click menu Login/Register
    And User Already Log into Recuitment NasTa Group page
    Then User Click Email or Username Field
    Then Input any numeric

  Scenario: TC_004
    Given User already open webstie Recuitment NasTa Group
    When User Click menu Login/Register
    And User Already Log into Recuitment NasTa Group page
    Then User Click Email or Username Field
    Then Input any special character

  Scenario: TC_005
    Given User already open webstie Recuitment NasTa Group
    When User Click menu Login/Register
    And User Already Log into Recuitment NasTa Group page
    Then User Click Password Field

  Scenario: TC_006
    Given User already open webstie Recuitment NasTa Group
    When User Click menu Login/Register
    And User Already Log into Recuitment NasTa Group page
    Then User Click Password Field
    Then Input any alphabet (e.g: Abcd)

  Scenario: TC_007
    Given User already open webstie Recuitment NasTa Group
    When User Click menu Login/Register
    And User Already Log into Recuitment NasTa Group page
    Then User Click Password Field
    Then Input any numeric

  Scenario:TC_008
    Given User already open webstie Recuitment NasTa Group
    When User Click menu Login/Register
    And User Already Log into Recuitment NasTa Group page
    Then User Click Password Field
    Then Input any special character

  Scenario: TC_009
    Given User already open webstie Recuitment NasTa Group
    When User Click menu Login/Register
    And User Already Log into Recuitment NasTa Group page
    Then User Click And Input Email or Username & Password with Valid Data
    And User Click Sign In Button

  Scenario: TC_010
    Given User already open webstie Recuitment NasTa Group
    When User Click menu Login/Register
    And User Already Log into Recuitment NasTa Group page
    Then User Click And Input Email or Username & Password with Invalid Data
    And User Click Sign In Button

  Scenario: TC_011
    Given User already open webstie Recuitment NasTa Group
    When User Click menu Login/Register
    And User Already Log into Recuitment NasTa Group page
    Then User Click And Input Password
    And User Click Sign In Button

  Scenario: TC_012
    Given User already open webstie Recuitment NasTa Group
    When User Click menu Login/Register
    And User Already Log into Recuitment NasTa Group page
    Then User Click And Input Email or Username with Valid Data
    And User Click Sign In Button

  Scenario: TC_013
    Given User already open webstie Recuitment NasTa Group
    When User Click menu Login/Register
    And User Already Log into Recuitment NasTa Group page
    And User Click Sign In Button
