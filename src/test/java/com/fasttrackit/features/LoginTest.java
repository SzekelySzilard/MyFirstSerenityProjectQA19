package com.fasttrackit.features;


import Util.BaseTest;
import com.fasttrackit.steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


public class LoginTest extends BaseTest {



    @Steps
    private LoginSteps loginSteps;


    private String user = "szilard.tivadar@yahoo.com";
    private String pass = "Istokfasza69.";

    @Test
    public void validLoginTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.loginWithCredetials(user,pass);
        loginSteps.verifyLoggedIn("Szilard");
    }

    @Test
    public void invalidUseremailTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.loginWithCredetials("cosmin",pass);
        loginSteps.verifyNotLoggedIn();
    }

    @Test
    public void invalidPassLoginTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.loginWithCredetials(user,"1234567");
        loginSteps.verifyNotLoggedIn();
    }

    @Test
    public void emptyPasswrodTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.loginWithCredetials(user,"");
        loginSteps.verifyNotLoggedIn();
    }

    @Test
    public void emptyUserEmailTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.loginWithCredetials("","123123");
        loginSteps.verifyNotLoggedIn();
    }

    @Test
    public void emptyUserEmailAndPasswordTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.loginWithCredetials("","");
        loginSteps.verifyNotLoggedIn();
    }


}
