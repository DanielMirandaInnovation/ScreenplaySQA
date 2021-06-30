Feature: Practice login
  @smokeTest
  Scenario: Login successful
    Given that a web user wants to practice login in DemoQA
    When he fills all the requested fields and he follows the steps using excel
    Then he should see the correct validations with the excel