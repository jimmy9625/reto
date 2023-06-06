package com.co.applitools.tasks.front;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.applitools.userinterfaces.LoginPage.*;

public class Login implements Task {

    private String userName;
    private  String password;

    private  Login (String userName ,String password)
    {
        this.password=password;
        this.userName=userName;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userName).into(USERNAME),
                Enter.theValue(password).into(PASSWORD),
                Click.on(BNT_LOGIN)
        );

    }

    public  static  Login followingCredentials(String userName,String password)
    {
        return  new Login(userName, password);
    }
}
