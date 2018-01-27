Feature: Homepage navigation
  As a end user
  i want to navigate to sign in
  and use the sign to register the details


  @smoke1
  Scenario: Sign up navigation
    Given user is on  homepage
    When user clicks sign in button
    Then user should successfully login to signup page



