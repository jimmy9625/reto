package com.co.applitools.tasks.api;


import com.co.applitools.utils.GenerateBodyPetisionUsers;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class SearchUser implements Task {

    private String path;
    private String name;
    private String job;


    private SearchUser(String path, String name, String job) {
        this.job = job;
        this.path = path;
        this.name = name;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String bodyUsers = GenerateBodyPetisionUsers.WhitData(name, job);
        actor.attemptsTo(
                Post.to(path)
                        .with(request -> request.header("Content-Type", "application/json")
                                .body(bodyUsers))

        );

    }

    public static SearchUser whitInfo(String path, String name, String job) {
        return new SearchUser(path, name, job);
    }


}
