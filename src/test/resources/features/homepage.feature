Feature: Homepage related scenarios

  Background: Navigate to login page

    Given I login

  @IN-1 @smoke
  Scenario: Page title. Title of the page should be "Interview App"
    Then Verify the title of the page is "Interview App"

  @IN-2 @smoke
  Scenario: User access. When I sign in as a user, I should be able to see only "Sign out" button from nav bar. User should not have access to "Manage Access" button
    Then Verify Sign out button is displayed
    Then Verify "Manage Access" button is not displayed

  @IN-3 @smoke
  Scenario Outline: Default dashboards. When I log in as any user there should be always 3 dashboards present
    Then Verify "<dashboards>" are displayed
    Examples:
      | dashboards  |
      | All Topics  |
      | Coding      |
      | Soft skills |