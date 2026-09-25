package com.co.choucair.questions;

import com.co.choucair.userinterfaces.agregarCompraAlCarro;

import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Question;

public class InventoryValidation implements Question<String> {

    @Override

    public String answeredBy(Actor actor) {

        return agregarCompraAlCarro.TXT_PRODUCTS.resolveFor(actor).getText();

    }

    public static InventoryValidation inventoryValidation() {

        return new InventoryValidation();

    }

}