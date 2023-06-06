package com.co.applitools.runners.api;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/api/users.feature",
        glue = "com.co.applitools.stepdefinition.api",
        snippets = SnippetType.CAMELCASE
)

public class Users {
}
