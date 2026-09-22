package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

public class InventoryPage {

    public static final Target TITTLE = Target.the("texto Products")
        .located(By.xpath("//span[text()='Products']"));

    public static final Target TXT_PRODUCTS = Target.the("texto Products")
            .located(By.xpath("//span[text()='Products']"));

    public static final Target BTN_ADD_TO_CART = Target.the("botón Add To Cart")
            .located(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));

    public static final Target BTN_CART = Target.the("carrito de compras")
            .located(By.xpath("//a[@class='shopping_cart_link']"));



}