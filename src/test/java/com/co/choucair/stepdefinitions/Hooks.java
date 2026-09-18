package com.co.choucair.stepdefinitions;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import java.util.Objects;

public class Hooks {
    @Before
    public void  SetThestage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @After
    public void close(){
        Assert.assertNotNull(getDriver());
        Objects.requireNonNull(getDriver()).close();

        }

    private Hooks getDriver() {
        return null;
    }
}