package servlet;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import examples.Hello;


public class StepDefs {
 
 

   @Given("^I have a Get Request for Kathir$")
    public void I_have_a_get_request() throws Throwable {
        Hello testHello = new Hello();
        testHello.doGet(null, null);
    }
    
    @When("I submit the request for Mohan$")
    public void I_submit_the_request_for() throws Throwable {
      Hello testHello = new Hello();
      testHello.shouldGenerate("Mohan");
    }

      @Then("I should get a response for Kathir$")
    public void I_should_get_a_response() throws Throwable {
      Hello testHello = new Hello();
      testHello.getOutput("Kathir");
    }

}
