package com.co.choucair.stepdefinitions;


import com.co.choucair.interactions.Checkout;
import com.co.choucair.tasks.AgregarProducto;
import com.co.choucair.userinterfaces.agregarCompraAlCarro;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class SaucedemoCheckoutStepDefinitions {

    private String LBL_CONFIRMACION;

    @Given("Usuario ingresa a la página de Saucedemo")
    public void usuarioIngresaALaPaginaDeSaucedemo() {

    }

    @When("El cliente agrega un producto al carro")
    public void elClienteAgregaUnProductoAlCarro() {

        theActorInTheSpotlight().attemptsTo(
                AgregarProducto.AgregarProductoalCarrito()
        );
    }



    @And("el cliente realiza la compra con nombre {string}, apellido {string} y código postal {string}")
    public void elClienteRealizaLaCompraConNombreApellidoYCodigoPostal(
            String nombre,
            String apellido,
            String codigo) {

        theActorInTheSpotlight().attemptsTo(
                Checkout.conDatos(nombre, apellido, codigo)
        );
    }
    @Then("la compra debe finalizar correctamente")
    public void laCompraDebeFinalizarCorrectamente() {

        theActorInTheSpotlight().should(
                seeThat(
                        Text.of(LBL_CONFIRMACION),
                        equalTo("Thank you for your order!")
                )
        );

    }
}