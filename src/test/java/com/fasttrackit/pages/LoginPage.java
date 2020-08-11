package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa4.fasttrackit.org:8008/?page_id=120")
public class LoginPage extends PageObject {

    @FindBy(id = "username")
    private WebElementFacade userEmailField;

    @FindBy(id = "password")
    private WebElementFacade userPasswordField;

    @FindBy(css="button[value=\"Login\"] ")
    private WebElementFacade loginButton;

    public void setUserEmailField(String email){
        typeInto(userEmailField, email);
    }

    public void setUserPasswordField(String pass){
        typeInto(userPasswordField, pass);
    }

    public void clickLoginButton(){
        clickOn(loginButton);
    }

    public boolean isOnLoginPage(){
        return userEmailField.isDisplayed();
    }



}
