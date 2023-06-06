package com.co.applitools.questions.api;

import com.co.applitools.models.UserCreateInfo;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class JobResponse implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        UserCreateInfo userCreateInfo = SerenityRest.lastResponse().as(UserCreateInfo.class);
        return userCreateInfo.getJob();
    }

    public static  JobResponse serviceResponse()
    {
        return new JobResponse();
    }
}
