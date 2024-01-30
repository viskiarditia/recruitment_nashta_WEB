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

#  Scenario: JOR_026
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Selection Test
#    Then Input any alphabet (e.g: Abcd)
#
#  Scenario: JOR_027
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Selection Test
#    Then Input any numeric
#
#  Scenario: JOR_028
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Selection Test
#    Then Input any special character
#
#  Scenario: JOR_029
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Project Type Field
#    Then Input any alphabet (e.g: Abcd)
#
#  Scenario: JOR_030
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Project Type Field
#    Then Input any numeric
#
#  Scenario: JOR_031
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Project Type Field
#    Then Input any special character
#
#  Scenario: JOR_032
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Dropdown Field Project Type Field
#    Then User Choise Project
#
#  Scenario: JOR_033
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Dropdown Field Project Type Field
#    Then User Choise Non Project
#
#  Scenario: JOR_034
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Employe Status
#    Then Input any alphabet (e.g: Abcd)
#
#  Scenario: JOR_035
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Employe Status
#    Then Input any numeric
#
#  Scenario: JOR_036
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Employe Status
#    Then Input any special character
#
#  Scenario: JOR_037
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Position Level
#    Then Input any alphabet (e.g: Abcd)
#
#  Scenario: JOR_038
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Position Level
#    Then Input any numeric
#
#  Scenario: JOR_039
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Position Level
#    Then Input any special character
#
#  Scenario: JOR_040
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Gender
#    Then Input any alphabet (e.g: Abcd)
#
#  Scenario: JOR_041
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Gender
#    Then Input any numeric
#
#  Scenario: JOR_042
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Gender
#    Then Input any special character
#
#  Scenario: JOR_043
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Education
#    Then Input any alphabet (e.g: Abcd)
#
#  Scenario: JOR_044
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Education
#    Then Input any numeric
#
#  Scenario: JOR_045
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Education
#    Then Input any special character
#
#  Scenario: JOR_046
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Age
#    Then Input any alphabet (e.g: Abcd)
#
#  Scenario: JOR_047
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Age
#    Then Input any numeric
#
#  Scenario: JOR_048
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Age
#    Then Input any special character
#
#  Scenario: JOR_049
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Others  Age
#    Then Input any alphabet (e.g: Abcd)
#
#  Scenario: JOR_050
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Others  Age
#    Then Input any numeric
#
#  Scenario: JOR_051
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Others  Age
#    Then Input any special character
#
#  Scenario: JOR_052
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Work Experience
#    Then Input any alphabet (e.g: Abcd)
#
#  Scenario: JOR_053
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Work Experience
#    Then Input any numeric
#
#  Scenario: JOR_054
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Work Experience
#    Then Input any special character
#
#  Scenario: JOR_055
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Min Expected Salary
#    Then Input any alphabet (e.g: Abcd)
#
#  Scenario: JOR_056
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Min Expected Salary
#    Then Input any numeric
#
#  Scenario: JOR_057
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Min Expected Salary
#    Then Input any special character
#
#  Scenario: JOR_058
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field End Date
#    Then Input any numeric
#
#  Scenario: JOR_059
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Max Expected Salary
#    Then Input any numeric
#
#  Scenario: JOR_060
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Max Expected Salary
#    Then Input any special character
#
#  Scenario: JOR_061
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Fulfillment Source
#    Then Input any alphabet (e.g: Abcd)
#
#  Scenario: JOR_062
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Fulfillment Source
#    Then Input any numeric
#
#  Scenario: JOR_063
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Fulfillment Source
#    Then Input any special character
#
#  Scenario: JOR_064
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Others
#    Then Input any alphabet (e.g: Abcd)
#
#  Scenario: JOR_065
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Others
#    Then Input any numeric
#
#  Scenario: JOR_066
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Others
#    Then Input any special character
#
#  Scenario: JOR_067
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Description
#    Then Input any alphabet (e.g: Abcd)
#
#  Scenario: JOR_068
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Description
#    Then Input any numeric
#
#  Scenario: JOR_069
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Description
#    Then Input any special character
#
#  Scenario: JOR_070
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Notes
#    Then Input any alphabet (e.g: Abcd)
#
#  Scenario: JOR_071
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Notes
#    Then Input any numeric
#
#  Scenario: JOR_072
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Notes
#    Then Input any special character
#
#  Scenario: JOR_073
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Type Skill / Certification
#    Then Input any alphabet (e.g: Abcd)
#
#  Scenario: JOR_074
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Type Skill / Certification
#    Then Input any numeric
#
#  Scenario: JOR_075
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Type Skill / Certification
#    Then Input any special character
#
#  Scenario: JOR_076
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Type Name Skill / Certification
#    Then Input any alphabet (e.g: Abcd)
#
#  Scenario: JOR_077
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Type Name Skill / Certification
#    Then Input any numeric
#
#  Scenario: JOR_078
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Type Name Skill / Certification
#    Then Input any special character
#
#  Scenario: JOR_079
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Skala Level
#    Then Input any alphabet (e.g: Abcd)
#
#  Scenario: JOR_080
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Skala Level
#    Then Input any numeric
#
#  Scenario: JOR_081
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Skala Level
#    Then Input any special character
#
#  Scenario: JOR_082
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Input All Field Form
#
#  Scenario: JOR_083
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Input All Field Form without Scale Of Needs Field
#
#  Scenario: JOR_084
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Position Level
#    Then Input any alphabet (e.g: Abcd)
#
#  Scenario: JOR_085
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Position Level
#    Then Input any numeric
#
#  Scenario: JOR_086
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Position Level
#    Then Input any special character
#
#  Scenario: JOR_087
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Start Date
#    Then Input any alphabet (e.g: Abcd)
#
#  Scenario: JOR_088
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Start Date
#    Then Input any numeric
#
#  Scenario: JOR_089
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Start Date
#    Then Input any special character
#
#  Scenario: JOR_090
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field End Date
#    Then Input any alphabet (e.g: Abcd)
#
#  Scenario: JOR_091
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Start Date
#    Then Input any numeric
#
#  Scenario: JOR_092
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    When User Click Assigment Location Field Start Date
#    Then Input any special character
#
#  Scenario: JOR_093
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then the user fills in each required field
#
#  Scenario: JOR_094
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then the user fills in each required field without Scales of Needs
#
#  Scenario: JOR_095
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Click button Column Actions
#    And Choise Sort by Status Ascending
#
#  Scenario: JOR_096
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Click button Column Actions
#    And Choise Sort by Status Descending
#
#  Scenario: JOR_097
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Click button Column Actions
#    And Choise Sort by Clear Sort
#
#  Scenario: JOR_098
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Click button Column Actions
#    And Choise Clear Filter
#
#  Scenario: JOR_099
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Click button Column Actions
#    And Choise Filter by Status
#
#  Scenario: JOR_100
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Click button Column Actions
#    And Choise Filter by Status
#
#  Scenario: JOR_101
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Click button Row Actions in data that in process
#    And Choise Status Approval
#
#  Scenario: JOR_102
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Click button Row Actions in data that in process
#    And Choise Delete
#
#  Scenario: JOR_103
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Scrolll to the bottom Click button Row per Page
#    And Choise number "5"
#
#  Scenario: JOR_104
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Scrolll to the bottom Click button Row per Page
#    And Choise number "10"
#
#  Scenario: JOR_105
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Scrolll to the bottom Click button Row per Page
#    And Choise number "15"
#
#  Scenario: JOR_106
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Scrolll to the bottom Click button Row per Page
#    And Choise number "20"
#
#  Scenario: JOR_107
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Scrolll to the bottom Click button Row per Page
#    And Choise number "25"
#
#  Scenario: JOR_108
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Scrolll to the bottom Click button Row per Page
#    And Choise number "30"
#
#  Scenario: JOR_109
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Scrolll to the bottom Click button Row per Page
#    And Choise number "50"
#
#  Scenario: JOR_110
#    Given User already open webstie Recuitment NasTa Group
#    When User already logged in
#    And User Click menu Job Order
#    Then User Add New Data Job Order Request
#    Then User Scrolll to the bottom Click button Row per Page
#    And Choise number "100"