package starter.stepdefinitions;

import cucumber.api.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.Form.realizarRegistro;
import starter.navigation.NavigateTo;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class RegistoStepDefinitions {

    String name;

    @Before
    public void settheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("(.*) entra a la pagina para registrarse")
    public void entra_a_la_pagina_para_registrarse (String name) {
        this.name = name;
    }

    @When("ingresa su informacion personal")
    public void ingresa_su_informacion_personal() {
        theActorCalled(name).attemptsTo(
                NavigateTo.theDuckDuckGoHomePage(),
                realizarRegistro.whithCredentials("ydpachon07@gmail.com", "Yesica", "Pachon",
                        "123456", "Daniela", "Quevedo", "Choucair", "calle 123 #23-12", "calle 45a #30-78",
                        "Bogota", "11114", "diagonal al edificio Birmania", "6756754",
                        "Barrio portales")
        );
    }

    @Then("podra ver la informacion de su registro")
    public void podra_ver_la_informacion_de_su_registro() {

    }
}
