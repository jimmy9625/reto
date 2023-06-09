package com.co.applitools.tasks.api;

import com.co.applitools.models.UserCreateInfo;
import com.co.applitools.utils.Constants;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class GetUser implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        UserCreateInfo userCreateInfo = SerenityRest.lastResponse().as(UserCreateInfo.class);
        actor.attemptsTo(
                Get.resource(Constants.PATH_USERS + "/" + userCreateInfo.getId())
        );

    }

    public static GetUser whitID() {
        return new GetUser();
    }
}
