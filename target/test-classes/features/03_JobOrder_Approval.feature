@JOA
Feature: JobOrder_Approval

  Background: Already Page Logged in on recruitment NashTa Group
    Given User already open website Recruitment NasTa Group
    When User already logged in as account Approved
    And User Click Sign In Button
    Then User already on landing page

  Scenario: JOA_001
    And User Click menu Job Order Approval
    Then User Clicks Action Row in Data Confirming Process
    And the user clicks the Reject button
#    Then Check History data


  Scenario: JOA_002
    And User Click menu Job Order Approval
    Then User Clicks Action Row in Data Confirming Process
    And the user clicks the Approval button
#    Then Check History data

  Scenario: JOA_003
    And User Click menu Job Order Approval
    Then User Clicks Action Row in Data Confirming Process
    And the user clicks the Revised button
#    Then Check History data