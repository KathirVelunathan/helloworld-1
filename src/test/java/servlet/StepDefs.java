package servlet;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;


public class Stepdefs {
 
  HttpServletRequest request=new HttpServletRequest();

   @Given("^I have a Get Request for (\\d+)$")
    public void I_have_a_get_request(String l_input) throws Throwable {
        Hello testHello = new Hello();
        TestHello.doGet(request.setParameter("Key",l_input), null);
    }
    
    @When("I submit the request for (\\d+)$")
    public void I_submit_the_request_for(String l_mohan) throws Throwable {
      Hello testHello = new Hello();
      TestHello.shouldGenerate(l_input);
    }

      @Then("I should get a response for (\\d+)$")
    public void I_should_get_a_response(String l_mohan) throws Throwable {
      Hello testHello = new Hello();
      TestHello.getOutput(l_input);
    }

}
