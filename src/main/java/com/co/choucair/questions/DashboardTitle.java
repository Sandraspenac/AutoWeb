package com.co.choucair.questions;



import com.co.choucair.userinterfaces.SaucedemoLoginTest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class DashboardTitle implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        String text = SaucedemoLoginTest.DASHBOARD_TITLE.resolveFor(actor).getText();
        return text;
        
        
    }

    public static DashboardTitle value() {
        return new DashboardTitle();
    }
}
