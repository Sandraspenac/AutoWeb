package com.co.choucair.tasks;


import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class SauceLogin implements Task {


    private static final Target TXT_USER = Target.the("campo usuario")

        .locatedBy("//input[@id='user-name']");

    private static final Target TXT_PASS = Target.the("campo contraseña")

        .locatedBy("//input[@id='password']");

    private static final Target BTN_LOGIN = Target.the("botón login")
        .locatedBy("//input[@id='login-button']");

    public static SauceLogin login(DataTable dataTable) {
    return Tasks.instrumented(SauceLogin.class);
    }

    @Override


    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("standard_user").into(SauceLogin.TXT_USER));
        actor.attemptsTo(Enter.theValue("secret_sauce").into(SauceLogin.TXT_PASS));
        actor.attemptsTo(Click.on(BTN_LOGIN)


        );
    }
}
