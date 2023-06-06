package com.co.applitools.questions.front;

import com.co.applitools.userinterfaces.DashboarPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

public class GetTotalTransactions implements Question<Integer> {


    @Override
    public Integer answeredBy(Actor actor) {

        List<WebElementFacade> transactions = DashboarPage.AMOUNT.resolveAllFor(actor);
        return transactions.size();
    }


    public static GetTotalTransactions fromDashboard() {
        return new GetTotalTransactions();
    }
}
