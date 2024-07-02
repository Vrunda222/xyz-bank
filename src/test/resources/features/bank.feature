Feature: Search functionality

  @sanity @smoke
  Scenario Outline: Bank Manager Should Add Customer Successfully.
    Given I am on homepage
    When I click On Bank Manager Login Tab
    Then I navigate to manager page
    And I click On Add Customer Tab
    And I enter FirstName "<firstname>"
    And I enter LastName "<lastname>"
    And I enter PostCode "<postcode>"
    And I click On Add Customer Button
    Then I should see popup
    And I verify message "<message>"
    Then I click on ok button on popup

    Examples:
      | firstname | lastname | postcode | message                     |
      | Harry     | Potter   | 909      | Customer added successfully |

  @smoke @regression
  Scenario Outline: Bank Manager Should open Customer Successfully.
    Given I am on homepage
    When I click On Bank Manager Login Tab
    Then I navigate to manager page
    And I click On Open Account Tab
    And I Search customer that created in first test "<fullname>"
    And I Select currency "<currency>"
    And I click on process button
    Then I should see popup
    And I verify message "<message>"
    Then I click on ok button on popup

    Examples:
      | fullname     | currency | message                      |
      | Harry Potter | Pound    | Account created successfully |

  @regression
  Scenario: Customer Should Login And Logout Successfully
    Given I am on homepage
    When I click on Customer Login tab
    And Search customer that you created in first test
    And click on Login button
    Then I verify LogOut tab is displayed
    And I click on LogOut
    Then verify Your Name text is displayed

  @sanity
  Scenario: Customer Should Deposit Money Successfully
    Given I am on homepage
    When I click on Customer Login tab
    And Search customer that you created in first test
    And click on Login button
    And click on Deposit
    And enter amount one hundred
    And click on Deposit button
    Then I verify Deposit successful

  @sanity
  Scenario: Customer Should Withdraw Money Successfully
    Given I am on homepage
    When I click on Customer Login tab
    And Search customer that you created in first test
    And click on Login button
    And click on Withdraw
    And enter amount
    And click on Withdraw button

    Then I verify Transaction successful



