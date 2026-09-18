package com.co.choucair.questions;

import com.co.choucair.userinterfaces.InventoryPage;

import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Question;

public class InventoryValidation implements Question<String> {

    @Override

    public String answeredBy(Actor actor) {

        return InventoryPage.TXT_PRODUCTS.resolveFor(actor).getText();

    }

    public static InventoryValidation inventoryValidation() {

        return new InventoryValidation();

    }

}