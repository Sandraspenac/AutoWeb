package com.co.choucair.stepdefinitions;


import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;


public class SaucedemoCompraStepDefinitions {


    @Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Usuario ingresa a la página de Saucedemo")
    public void abrirpagina()
    {
        OnStage.setTheStage(new OnlineCast());
    }


    @When("el cliente realiza la compra con nombre {string}, apellido {string} y código postal {string}")
    public void realizarCompra(String nombre, String apellido, String codigoPostal) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SaucedemoCompraStepDefinitions(nombre, apellido, codigoPostal)
        );
    }

    private Performable SaucedemoCompraStepDefinitions(String nombre, String apellido, String codigoPostal) {
        return null;
    }


    @Then("click en el carrito para adicionar su compra al carro")
    public void click_en_el_carrito_para_adicionar_su_compra_al_carro() {

    }
    @When("selecciona el botón de pago")
    public void selecciona_el_boton_de_pago() {

    }

    @Then("Ingresa los datos en campo de nombre {string}")
    public void ingresa_los_datos_en_campo_de_nombre(String nombre) {


    }

    @And("Ingresa los datos en campo apellido {string}")
    public void ingresa_los_datos_en_campo_apellido(String apellido) {

    }

    @And("Ingrese los datos en el campo de Zona Postal/Código Postal {string}")
    public void ingrese_los_datos_en_el_campo_de_zona_postal(String codigoPostal) {

    }

    @And("Click en el botón continuar")
    public void click_en_el_boton_continuar() {

    }

    @Then("Click en el botón finalizar")
    public void click_en_el_boton_finalizar() {

    }
}

