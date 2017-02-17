package servlet;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import examples.Hello;


public class Stepdefs {
 
 

   @Given("^I have a Get Request for (\\d+)$")
    public void I_have_a_get_request(String l_input) throws Throwable {
        Hello testHello = new Hello();
        testHello.doGet(null, null);
    }
    
    @When("I submit the request for (\\d+)$")
    public void I_submit_the_request_for(String l_input) throws Throwable {
      Hello testHello = new Hello();
      testHello.shouldGenerate(l_input);
    }

      @Then("I should get a response for (\\d+)$")
    public void I_should_get_a_response(String l_input) throws Throwable {
      Hello testHello = new Hello();
      testHello.getOutput(l_input);
    }

}
