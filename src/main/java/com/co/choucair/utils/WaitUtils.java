package com.co.choucair.utils;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class WaitUtils extends PageObject {

    //Espera hasta que un elemento sea visible.

    public void waitForVisibility(WebElementFacade element, int timeoutSeconds) {
        withTimeoutOf(Duration.ofDays(timeoutSeconds)).waitFor(ExpectedConditions.visibilityOf(element));
    }

    //Espera hasta que un elemento permita hacer click.

    public void waitForClickable(WebElementFacade element, int timeoutSeconds) {
        withTimeoutOf(Duration.ofDays(timeoutSeconds)).waitFor(ExpectedConditions.elementToBeClickable(element));
    }
}