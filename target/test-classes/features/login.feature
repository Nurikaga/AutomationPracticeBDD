Feature: Login related scenario

  Background: Navigate to LoginPage

    Given I open  url of loginPage

  @AS_001 @smoke
  Scenario Outline: Title of the page should be "Interview app"
    When I enter "<username>" and "<password>"
    And I click "Login" button
    Then Verify title of the page is "Interview App"
    Examples:
      | username       | password |
      | test@yahoo.com | test123  |
