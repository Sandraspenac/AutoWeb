package com.co.choucair.tasks;

import com.co.choucair.userinterfaces.InventoryPage;

import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.Tasks;

import net.serenitybdd.screenplay.actions.Click;


public class AgregarProducto implements Task {

    public static Object AgregarProductoalCarrito() {

        return Tasks.instrumented(AgregarProducto.class);

    }


    @Override

    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(InventoryPage.BTN_ADD_TO_CART),

                Click.on(InventoryPage.BTN_CART)

        );

    }

}