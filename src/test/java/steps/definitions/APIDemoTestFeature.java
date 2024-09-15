package steps.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class APIDemoTestFeature {
    @Given("create a user  with {string} with {string} and {string}")
    public void createAUserWithWithAnd(String URL, String UN, String PWD) {
        System.out.println("This is my url"+URL);
        System.out.println("This is my password"+UN);
        System.out.println("This is my "+PWD);
    }

    @Then("status code should be {string}")
    public void statusCodeShouldBe(String respnseCode) {
        System.out.println(respnseCode);
    }

}