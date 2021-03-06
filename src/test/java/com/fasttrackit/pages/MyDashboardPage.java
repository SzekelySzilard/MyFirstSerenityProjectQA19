package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/customer/account/")
public class MyDashboardPage extends PageObject {

    @FindBy(css = ".welcome-msg strong")
    private WebElementFacade welcomeText;

    public boolean verifyLoginText(String userName){
        return welcomeText.containsOnlyText("Hello "+userName );
    }
}
