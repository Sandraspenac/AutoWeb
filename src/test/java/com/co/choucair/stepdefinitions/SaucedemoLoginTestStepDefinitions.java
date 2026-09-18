package com.co.choucair.stepdefinitions;
import com.co.choucair.questions.DashboardTitle;

import com.co.choucair.tasks.SauceLogin;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class SaucedemoLoginTestStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Valida el login de usuario")
    public void valida_el_login_de_usuario() {
        OnStage.theActorCalled("Usuario").wasAbleTo(Open.url("https://www.saucedemo.com/")        );
    }

    @When("Usuario se autentica")
    public void usuarioSeAutentica(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(SauceLogin.login(dataTable));
    }



    @Then("Valida el titulo  Swag Labs Products")
    public void valida_el_titulo_swag_labs_products(String expectedText) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(DashboardTitle.value(), equalTo(expectedText))
        );
    }
}

