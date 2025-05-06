Feature: Order Place Feature

  Scenario: Login to application
    Given user enter a "standard_user" in username field
    And user enter "secret_sauce" in password field
    When user click login button.
    Then Validate user successfully logged into application

#  Scenario: add item to cart







