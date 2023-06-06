package com.co.applitools.stepdefinition.api;

import com.co.applitools.questions.api.JobResponse;
import com.co.applitools.questions.api.ResponseCode;
import com.co.applitools.tasks.api.CreateUser;
import com.co.applitools.tasks.api.GetUser;
import com.co.applitools.utils.Constants;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abiities.CallAnApi;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class UsersStepsDefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^a (.*) makes an API request$")
    public void aUserMakesAnAPIRequest(String user) {

        theActorCalled(user).whoCan(CallAnApi.at(Constants.API_URL));

    }

    @When("^the user sends a POST request to /users with (.*) and (.*)$")
    public void theUserSendsAPOSTRequestToUsersWithAnd(String name, String job) {
        theActorInTheSpotlight().attemptsTo(CreateUser.whitInfo(name, job));

    }

    @Then("^the response code should be (.*)$")
    public void theResponseCodeShouldBe(Integer code) {

        theActorInTheSpotlight().should(seeThat(ResponseCode.fromPeticion(), equalTo(code)));

    }


    @When("^the user sends a GET reques to /user whit id$")
    public void theUserSendsAGETRequesToUserWhitId() {

        theActorInTheSpotlight().attemptsTo(GetUser.whitID());

    }

    @Then("^the job response is equals to (.*)$")
    public void theJobResponseIsEqualsToAutomationEngineer(String job) {
        theActorInTheSpotlight().should(seeThat(JobResponse.serviceResponse(), equalTo(job)));
    }
}
