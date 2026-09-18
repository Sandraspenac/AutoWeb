package com.co.choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.commons.collections4.FluentIterable;


public class SaucedemoLoginTest implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        // Obtiene el texto del mensaje de confirmación
        //String mensaje = Text.of(CONFIRMATION_MESSAGE).answeredBy(actor).toString();

        // Retorna true si contiene el texto esperado
        FluentIterable<Object> mensaje = null;
        return mensaje.contains("Thank you for your order");
    }
}

