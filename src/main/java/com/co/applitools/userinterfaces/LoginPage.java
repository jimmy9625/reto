package com.co.applitools.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target USERNAME = Target.the("user name  input").locatedBy("//*[@id='username']");
    public static final Target PASSWORD = Target.the("password input").locatedBy("//*[@id='password']");
    public static final Target BNT_LOGIN = Target.the("button login").locatedBy("//*[@id='log-in']");
    public static final Target MESSAGE = Target.the("message wrong ").locatedBy("//*[@id='random_id_5']");
}
