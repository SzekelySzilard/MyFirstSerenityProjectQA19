package com.fasttrackit.features;

import Util.BaseTest;
import com.fasttrackit.steps.CartSteps;
import com.fasttrackit.steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTest extends BaseTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private CartSteps cartSteps;

    @Test
    public void addToCartTest(){
        loginSteps.login("cosmin@fasttrackit.org","123456");

    }
}

