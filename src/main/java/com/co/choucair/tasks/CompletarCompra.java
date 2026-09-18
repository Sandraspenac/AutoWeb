package com.co.choucair.tasks;

import com.co.choucair.userinterfaces.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CompletarCompra implements Task {

    private String nombre;
    private String apellido;
    private String codigoPostal;

    public CompletarCompra(String nombre,
                           String apellido,
                           String codigoPostal) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoPostal = codigoPostal;
    }

    public static CompletarCompra conDatos(String nombre,
                                           String apellido,
                                           String codigoPostal) {

        return Tasks.instrumented(
                CompletarCompra.class,
                nombre,
                apellido,
                codigoPostal
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Object CheckoutPage;
        actor.attemptsTo(
                Enter.theValue(nombre).into(CheckoutPage.FIRST_NAME),
                Enter.theValue(apellido).into(CheckoutPage.LAST_NAME),
                Enter.theValue(codigoPostal).into(CheckoutPage.POSTAL_CODE),
                Click.on(CheckoutPage.BTN_CONTINUE),


                Click.on(CheckoutPage.BTN_FINISH)
        );
    }
}