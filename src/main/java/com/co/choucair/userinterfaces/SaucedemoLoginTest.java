package com.co.choucair.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SaucedemoLoginTest {
    public static final Target TXT_USER;
    public static final Target DASHBOARD_TITLE = null;

    static {
        TXT_USER = Target.the("txtuser")
                .located(By.id("user-name"));
    }

    public static final Target TXT_PASS;

    static {
        TXT_PASS = Target.the("txtpass")
                .located(By.xpath("//input[@id='LoginPanel0_Password']"));
    }

    public static final Target BTN_LOGIN;

    static {
        BTN_LOGIN = Target.the("botón login")
                .locatedBy("//input[@id='login-button']");
    }

}