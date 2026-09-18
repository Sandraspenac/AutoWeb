package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

public class InventoryPage {

    public static final Target TXT_PRODUCTS = Target.the("title")

        .located(By.className("title"));

    public static final Target BTN_ADD_TO_CART = Target.the("add-to-cart-sauce-labs-backpack")

        .located(By.id("add-to-cart-sauce-labs-backpack"));

    public static final Target BTN_CART = Target.the("shopping_cart_link")

        .located(By.className("shopping_cart_link"));

}