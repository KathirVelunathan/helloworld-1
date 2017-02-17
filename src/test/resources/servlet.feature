Feature: servlet

  Scenario: a Get Servlet
    Given I have a Get Request for Kathir
    When I submit the request for Mohan
    Then I should get a response for Kathir
