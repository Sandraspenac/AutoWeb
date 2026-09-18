package com.co.choucair.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.co.choucair.interactions.SaucedemoLoginTest;

public class SaucedemoLoginTest implements Task {

    private final String username;
    private final String password;

    // Constructor
    public SaucedemoLoginTest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static SaucedemoLoginTest login(String username, String password) {
        return instrumented(SaucedemoLoginTest.class, username, password);
    }

    // Definición de los Targets

        public static final Target TXT_USER = Target.the("txtuser")
                .located(By.id("LoginPanel0_Username"));
        public static final Target TXT_PASS = Target.the("txtpass")
                .located(By.xpath("//input[@id='LoginPanel0_Password']"));
        public static final Target BTN_LOGIN = Target.the("txt")
                .located(By.xpath("//button[@id='LoginPanel0_LoginButton']"));



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(TXT_USER),
                Enter.theValue(password).into(TXT_PASS),
                Click.on(BTN_LOGIN)
        );
    }

    public CharSequence getPass() {
        return null;
    }

    public CharSequence getUser() {
        return null;
    }

}


