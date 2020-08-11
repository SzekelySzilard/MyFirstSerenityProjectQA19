package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.interactions.Actions;

@DefaultUrl("http://qa4.fasttrackit.org:8008/")
public class HomePage extends PageObject {

    @FindBy(id = "menu-item-122")
    private WebElementFacade accountLink;

    @FindBy(css = "a[title='Log In']")
    private WebElementFacade loginLink;

    @FindBy(css="#search")
    private WebElementFacade searchField;

    @FindBy(css=".search-button" )
    private WebElementFacade searchButton;

    


    public void clickAccount(){
        clickOn(accountLink);
    }

    public void clickLogin(){
        clickOn(loginLink);
    }

    public void hoverOver(){
        Actions actions = new Actions(getDriver());
        actions.moveToElement(loginLink).perform();

    }
    public void searchForText() {typeInto(searchField, "LINEN") ;}

    public void clickOnSearchButton() {clickOn(searchButton);}

}
