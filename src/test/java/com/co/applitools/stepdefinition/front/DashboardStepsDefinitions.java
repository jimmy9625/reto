package com.co.applitools.stepdefinition.front;

import com.co.applitools.questions.front.GetTotalBance;
import com.co.applitools.questions.front.GetTotalCreditAvailable;
import com.co.applitools.questions.front.GetTotalTransactions;
import com.co.applitools.questions.front.TheColorDisplayed;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class DashboardStepsDefinitions {


    @Then("^the total balance should be equal to: (.*)$")
    public void theTotalBalanceShouldBeEqualTo(String balance) {

        theActorInTheSpotlight().should(GivenWhenThen.seeThat(GetTotalBance.fromDashboard(), equalTo(balance)));
    }

    @Then("^the credit available should be equal to: (.*)$")
    public void theCreditAvailableShouldBeEqualTo(String creditAvailable) {
        System.out.println("entre aca  credit ");
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(GetTotalCreditAvailable.fromDashboard(), equalTo(creditAvailable)));

    }

    @Then("^the total transactions should be equal to: (.*)$")
    public void theTotalTransactionsShouldBeEqualTo(Integer transactions) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(GetTotalTransactions.fromDashboard(), equalTo(transactions)));

    }

    @Then("the colors should be displayed correctly")
    public void theColorsShouldBeDisplayedCorrectly() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheColorDisplayed.fromToDashboard(), equalTo(true)));
    }


}
