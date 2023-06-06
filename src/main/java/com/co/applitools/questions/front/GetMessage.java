package com.co.applitools.questions.front;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.applitools.userinterfaces.LoginPage.MESSAGE;

public class GetMessage implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return MESSAGE.resolveFor(actor).getText();
    }

    public static GetMessage fromPage() {
        return new GetMessage();
    }
}
