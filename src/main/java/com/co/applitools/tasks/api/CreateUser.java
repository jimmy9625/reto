package com.co.applitools.tasks.api;


import com.co.applitools.utils.Constants;
import com.co.applitools.utils.GenerateBodyPetisionUsers;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static com.co.applitools.utils.Constants.PATH_USERS;

public class CreateUser implements Task {


    private String name;
    private String job;


    private CreateUser( String name, String job) {
        this.job = job;

        this.name = name;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String bodyUsers = GenerateBodyPetisionUsers.WhitData(name, job);
        actor.attemptsTo(
                Post.to(PATH_USERS)
                        .with(request -> request.header("Content-Type", "application/json")
                                .body(bodyUsers))

        );

    }

    public static CreateUser whitInfo( String name, String job) {
        return new CreateUser(name, job);
    }


}
