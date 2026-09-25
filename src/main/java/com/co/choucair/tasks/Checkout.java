package com.co.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.choucair.interactions.Checkout.*;


public class Checkout implements Task {

    private static final Object CHECKOUT = null;
    private static final String BTN_FINISH = null ;
    private final String nombre;
    private final String apellido;
    private final String codigo;
    private String BTN_CONTINUE;

    public Checkout(String nombre, String apellido, String codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
    }

    public static Performable conDatos(String nombre, String apellido, String codigo) {
        return Tasks.instrumented(Checkout.class, nombre, apellido, codigo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(nombre).into(TXT_NOMBRE),
                Enter.theValue(apellido).into(TXT_APELLIDO),
                Enter.theValue(codigo).into(TXT_CODIGO_POSTAL),
                Click.on(BTN_CONTINUE),
                Click.on(BTN_FINISH)
        );
    }
}