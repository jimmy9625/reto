package com.co.applitools.questions.front;

import com.co.applitools.userinterfaces.DashboarPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class GetTotalCreditAvailable implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return DashboarPage.CREDIT_AVAILABLE.resolveFor(actor).getText();
    }

    public static GetTotalCreditAvailable fromDashboard() {
        return new GetTotalCreditAvailable();
    }
}
