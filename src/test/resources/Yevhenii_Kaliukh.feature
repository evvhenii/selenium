Feature: running tests using Cucumber

  Scenario: Changing the website language from English to Hungary
    Given I am on epam.com
    When I click on language button
    And I click on Hungary
    Then I should be redirected on 'https://www.epam.com/'

  Scenario: Search functionality
    Given I am on epam.com
    When I click on search button in the left top corner
    And I write a word or a sentence in form
    And click on FIND button to the left on form
    Then I should be redirected to the page with search results

  Scenario: Checking feedback form appearing
    Given I am on epam.com
    When I click on Contact Us button
    Then The page with a form appears

  Scenario: Redirecting home when not home
    Given I am on www.epam.com careers
    When I tap on main epam button
    Then I should be redirected on 'https://www.epam.com/about/who-we-are/contact'

  Scenario: Cookies accepting
    Given I am on epam.com
    When I tap on button ok to accept cookies
    Then I am staying on epam.com

  Scenario: Information about Epam reading
    Given I am on epam.com
    When I tap on button About in header
    Then I should be redirected on 'https://www.epam.com/about'

  Scenario: "FIND JOB" form functionality
    Given I am on www.epam.com careers
    When I choose only opened to relocation
    And I tap on FIND
    Then I should be redirected to the page with results

  Scenario Outline: Checking redirecting to social networks
    Given I am on epam.com
    When I tap on "<social_networks>"
    Then I will be redirected in new tab "<link>"
    Examples:
      | social_networks  | link                                             |
      | Instagram        | https://www.instagram.com/epamsystems/           |
      | Twitter          | https://twitter.com/EPAMSYSTEMS                  |
      | Facebook         | https://www.facebook.com/EPAM.Global             |
      | LinkedIn         | https://www.linkedin.com/company/epam-systems/   |