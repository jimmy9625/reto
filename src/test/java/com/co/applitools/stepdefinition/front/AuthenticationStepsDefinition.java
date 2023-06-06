package com.co.applitools.stepdefinition.front;

import com.co.applitools.questions.front.GetMessage;
import com.co.applitools.questions.front.TheName;
import com.co.applitools.tasks.front.Login;
import com.co.applitools.utils.Constants;
import com.co.applitools.utils.drivers.OwnWebDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AuthenticationStepsDefinition {


    @Before
    public void prepareStage() {

        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^The (.*) opens the page$")
    public void theUserOpensThePageWwwDemoApplitools(String userName) {

        theActorCalled(userName).whoCan(BrowseTheWeb.with(OwnWebDriver.
                newWebDriver().firefox(Constants.URL)));

    }

    @When("^The user logs in with the following credentials: (.*) and (.*)$")
    public void theUserLogsInWithTheFollowingCredentialsUsrtestAndPassword(String userName, String password) {
        theActorInTheSpotlight().
                attemptsTo(Login.followingCredentials(userName, password));

    }

    @Then("^the user sees their (.*) displayed$")
    public void theUserSeesTheirJackGomezDisplayed(String name) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.
                seeThat(TheName.fromToDashboard(), Matchers.equalTo(name)));

    }

    @When("^The user logs in with the following invalid credentials: (.*) and (.*)$")
    public void theUserLogsInWithTheFollowingInvalidCredentialsPepitoPerezAnd(String userName, String password) {
        theActorInTheSpotlight().
                attemptsTo(Login.followingCredentials(userName, password));
    }

    @Then("^the user sees mensage (.*)$")
    public void theUserSeesMensageWrongCredentials(String message) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(GetMessage.fromPage(), Matchers.equalTo(message)));

    }


}
