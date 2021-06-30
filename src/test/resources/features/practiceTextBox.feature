Feature: Add web table

@regression
  Scenario: Text Box successful
    Given that a web user wants to add a web table in DemoQA
    When he fills all the requested fields and he follows the steps
    Then he should see the web table created

  @smokeTest
  Scenario: Text Box 2
    Given that a web user wants to add a web table in DemoQA
    When he fills all the requested fields and he follows the steps
    Then he should see the web table created

