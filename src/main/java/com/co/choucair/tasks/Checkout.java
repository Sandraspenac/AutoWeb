package com.co.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.choucair.interactions.Checkout.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class Checkout implements Task {


    private final String nombre;
    private final String apellido;
    private final String codigo;
    public String BTN_CHECKOUT;
    private String BTN_CONTINUE;
    private String BTN_FINISH;
    public Checkout(String nombre, String apellido, String codigo, String lblConfirmacion, String btnContinue, String btnFinish) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        String btnCheckout = "";
        BTN_CHECKOUT = btnCheckout;
        BTN_CONTINUE = btnContinue;
        BTN_FINISH = btnFinish;


    }

    public static Performable conDatos(String nombre, String apellido, String codigo) {
        return Tasks.instrumented(Checkout.class, nombre, apellido, codigo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CONTINUE),

                WaitUntil.the(BTN_FINISH, isVisible())
                        .forNoMoreThan(10).seconds(),

                Click.on(BTN_FINISH)
        );

        actor.attemptsTo(
                Enter.theValue(nombre).into(TXT_NOMBRE),
                Enter.theValue(apellido).into(TXT_APELLIDO),
                Enter.theValue(codigo).into(TXT_CODIGO_POSTAL),
                Click.on(BTN_CONTINUE),
                Click.on(BTN_FINISH)



        );
    }
}