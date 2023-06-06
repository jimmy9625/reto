package com.co.applitools.tasks.api;

import com.co.applitools.models.UserCreateInfo;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class GetUser implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        UserCreateInfo userCreateInfo = SerenityRest.lastResponse().as(UserCreateInfo.class);
        actor.attemptsTo(
                Get.resource("/users/"+userCreateInfo.getId())
        );

    }

    public static GetUser whitID()
    {
        return new GetUser();
    }
}
