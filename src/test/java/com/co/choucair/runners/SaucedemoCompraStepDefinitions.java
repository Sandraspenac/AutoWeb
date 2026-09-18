package com.co.choucair.runners;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(

features = "src/test/resources/features/saucedemo_compra.feature",
glue = "com.co.choucair.stepdefinitions",
snippets = CucumberOptions.SnippetType.CAMELCASE,

plugin = {"pretty"}

        )

public class SaucedemoCompraStepDefinitions {
}
