Feature: servlet

  Scenario: a Get Servlet
    Given I have a Get Request
    When I submit the request
    Then I should get a response
