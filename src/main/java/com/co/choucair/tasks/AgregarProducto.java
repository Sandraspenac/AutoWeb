package com.co.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.choucair.userinterfaces.agregarCompraAlCarro.BTN_ADD_TO_CART;
import static com.co.choucair.userinterfaces.agregarCompraAlCarro.BTN_CART;

public class AgregarProducto implements Task {

    public static AgregarProducto alCarro() {
        return Tasks.instrumented(AgregarProducto.class);
    }

    public static Performable AgregarProductoalCarrito() {
        return null;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_ADD_TO_CART),
                Click.on(BTN_CART)
        );
    }
}