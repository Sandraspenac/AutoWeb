package com.co.choucair.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SaucedemoLoginTest {
    public static final Target TXT_USER;
    public static final Target DASHBOARD_TITLE = null;

    static {
        TXT_USER = Target.the("campo usuario")
                .located(By.id("standard-user"));
    }

    public static final Target TXT_PASS;

    static {
        TXT_PASS = Target.the("campo contraseña")
                .located(By.id("secret_sauce"));
    }

    public static final Target BTN_LOGIN;

    static {
        BTN_LOGIN = Target.the("botón login")
                .located(By.id("login-button"));
    }

}