package com.co.choucair.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;




public class Checkout implements Task {

    public static final Target BTN_CONTINUE = Target.the("BTN_CONTINUE")
            .located(By.xpath("//input[@id='continue']"));

    public static final Target BTN_FINISH = Target.the("botón finalizar")
            .located(By.xpath("//button[@id='finish']"));
    public  static final Target LBL_CONFIRMATION;

    static {
        LBL_CONFIRMATION = Target.the("mensaje de confirmación")
                .located(By.xpath("//h2[@data-test='complete-header']"));
    }

    private final String nombre;
    private final String apellido;
    private final String codigo;
    private final String lblConfirmacion;

    public Checkout(String nombre, String apellido, String codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.lblConfirmacion = "Thank you for your order!";
    }

    public static Performable conDatos(String nombre, String apellido, String codigo) {
        return Tasks.instrumented(Checkout.class, nombre, apellido, codigo);
    }
    public static final Target BTN_ADD_TO_CART;

    static {
        BTN_ADD_TO_CART = Target.the("Agregar producto")
                .located(By.id("add-to-cart-sauce-labs-backpack"));
    }

    public static final Target BTN_CART;

    static {
        BTN_CART = Target.the("Carrito")
                .located(By.className("shopping_cart_link"));
    }

    public static final Target TXT_NOMBRE = Target.the("campo nombre")
            .located(By.xpath("//input[@id='first-name']"));

    public static final Target TXT_APELLIDO = Target.the("campo apellido")
            .located(By.xpath("//input[@id='last-name']"));

    public static final Target TXT_CODIGO_POSTAL = Target.the("campo código postal")
            .located(By.xpath("//input[@id='postal-code']"));


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