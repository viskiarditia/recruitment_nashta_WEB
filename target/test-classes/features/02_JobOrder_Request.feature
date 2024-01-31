@JOR
Feature: JobOrder_Request

  Background: Already Page Logged in on recruitment NashTa Group
    Given User already open website Recruitment NasTa Group
    Then User Click And Input Email or Username & Password with Valid Data
    And User Click Sign In Button
    Then User already on landing page

  Scenario Outline: JOR_001 sampai JOR_022
    And User Click menu Job Order
    Then User Add New Data Job Order Request
    When User Click every field in General Information
    Then Input any Test in every Field General Information "<Data Test>"
    Examples:
      | Data Test |
      | ABCD      |
      | 1122      |
      | )^#$      |

  Scenario Outline: JOR_023 sampai JOR_072
    And User Click menu Job Order
    Then User Add New Data Job Order Request
    When User Click every field in Reason of Request
    Then Input any Test in every Field Reason of Request "<Data Test>"
    Examples:
      | Data Test |
      | ABCD      |
      | 1122      |
      | )^#$      |

  Scenario Outline: JOR_073 sampai JOR_081
    And User Click menu Job Order
    Then User Add New Data Job Order Request
    When User Click every field in Skill Certification
    Then Input any Test in every Field Skill Certification "<Data Test>"
    Examples:
      | Data Test |
      | ABCD      |
      | 1122      |
      | )^#$      |

  Scenario: JOR_082
    And User Click menu Job Order
    Then User Add New Data Job Order Request
    When User Input All Field Form


  Scenario: JOR_083
    And User Click menu Job Order
    Then User Add New Data Job Order Request
    When User Input All Field Form without Scale Of Needs Field

  Scenario Outline: JOR_084 sampai JOR_104
    And User Click menu Job Order
    Then User click button Filter in Job Order Request
    Then Input any Test in Company Field "<Data Test>"
     Examples:
      | Data Test |
      | ABCD      |
      | 1122      |
      | )^#$      |

  Scenario: Valid Filter
    And User Click menu Job Order
    Then User click button Filter in Job Order Request
    And Input Valid Data button Filter all Field





















  
#  Scenario: JOR_0
#    Given User already open website recruitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Click button Column Actions
#    And Choise Sort by Clear Sort
#
#  Scenario: JOR_0
#    Given User already open website recruitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Click button Column Actions
#    And Choise Clear Filter
#
#  Scenario: JOR_099
#    Given User already open website recruitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Click button Column Actions
#    And Choise Filter by Status
#
#  Scenario: JOR_100
#    Given User already open website recruitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Click button Column Actions
#    And Choise Filter by Status
#
#  Scenario: JOR_101
#    Given User already open website recruitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Click button Row Actions in data that in process
#    And Choise Status Approval
#
#  Scenario: JOR_102
#    Given User already open website recruitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Click button Row Actions in data that in process
#    And Choise Delete
#
#  Scenario: JOR_103
#    Given User already open website recruitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Scrolll to the bottom Click button Row per Page
#    And Choise number "5"
#
#  Scenario: JOR_104
#    Given User already open website recruitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Scrolll to the bottom Click button Row per Page
#    And Choise number "10"
#
#  Scenario: JOR_105
#    Given User already open website recruitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Scrolll to the bottom Click button Row per Page
#    And Choise number "15"
#
#  Scenario: JOR_106
#    Given User already open website recruitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Scrolll to the bottom Click button Row per Page
#    And Choise number "20"
#
#  Scenario: JOR_107
#    Given User already open website recruitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Scrolll to the bottom Click button Row per Page
#    And Choise number "25"
#
#  Scenario: JOR_108
#    Given User already open website recruitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Scrolll to the bottom Click button Row per Page
#    And Choise number "30"
#
#  Scenario: JOR_109
#    Given User already open website recruitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Scrolll to the bottom Click button Row per Page
#    And Choise number "50"
#
#  Scenario: JOR_110
#    Given User already open website recruitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Scrolll to the bottom Click button Row per Page
#    And Choise number "100"