package com.fasttrackit.steps;

import com.fasttrackit.pages.HomePage;
import net.thucydides.core.annotations.Step;
import org.junit.Test;

public class SearchSteps {
    private HomePage homePage;


    @Step
    public  void SearchForInputText(){
        homePage.open();
        homePage.searchForText();
        homePage.clickOnSearchButton();
    }
}
