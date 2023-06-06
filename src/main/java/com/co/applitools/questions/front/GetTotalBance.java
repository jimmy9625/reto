package com.co.applitools.questions.front;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.applitools.userinterfaces.DashboarPage.TOTAL_BALACE;

public class GetTotalBance implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {

        return TOTAL_BALACE.resolveFor(actor).getText();
    }

    public static GetTotalBance fromDashboard() {
        return new GetTotalBance();
    }
}
