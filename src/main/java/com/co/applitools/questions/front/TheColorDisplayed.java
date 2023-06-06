package com.co.applitools.questions.front;

import com.co.applitools.userinterfaces.DashboarPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static com.co.applitools.utils.Constants.GREEN_COLOR;
import static com.co.applitools.utils.Constants.RED_COLOR;

public class TheColorDisplayed implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {

        List<WebElementFacade> list = DashboarPage.AMOUNT.resolveAllFor(actor);

        for (WebElementFacade element : list) {

            if (element.getText().contains("+")) {
                if (!element.getCssValue("color").equals(GREEN_COLOR)) {
                    System.out.println("en este verde");

                    return false;
                }
            } else {

                if (!element.getCssValue("color").equals(RED_COLOR)) {
                    System.out.println("en este");
                    System.out.println(element.getCssValue("color"));
                    return false;
                }
            }

        }

        return true;
    }

    public static TheColorDisplayed fromToDashboard() {
        return new TheColorDisplayed();
    }
}
