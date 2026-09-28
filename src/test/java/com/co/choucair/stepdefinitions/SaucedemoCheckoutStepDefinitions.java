package com.co.choucair.stepdefinitions;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import com.co.choucair.interactions.Checkout;
import com.co.choucair.tasks.AgregarProducto;
import com.co.choucair.userinterfaces.agregarCompraAlCarro;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Text;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;


public class SaucedemoCheckoutStepDefinitions {


    @Given("Usuario ingresa a la página de Saucedemo")
    public void usuarioIngresaALaPaginaDeSaucedemo() {

        OnStage.theActorCalled("Usuario");
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

        String url = BrowseTheWeb.as(theActorInTheSpotlight())
                .getDriver()
                .getCurrentUrl();

        System.out.println("================================");
        System.out.println("URL ACTUAL: " + url);
        System.out.println("================================");
    }
}