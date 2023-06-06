package com.co.applitools.questions.api;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ResponseCode implements Question<Integer> {



    @Override
    public Integer answeredBy(Actor actor) {

        return SerenityRest.lastResponse().getStatusCode();
    }

    public static ResponseCode fromPeticion()
    {
        return new ResponseCode();
    }
}
