package com.co.applitools.questions.front;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.applitools.userinterfaces.DashboarPage.NAME;

public class TheName implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return NAME.resolveFor(actor).getText();
    }

    public static TheName fromToDashboard() {
        return new TheName();
    }
}
