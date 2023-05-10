Feature: Admin User related scenarios

  Background: Login as admin user


    Given I log in as admin user
    @IN-10
    Scenario: Admin user should be able to login
    When I log in as admin user
    Then I should see "Manage Access" link

      | username | password |
      | admin@yahoo.com | admin123 |




