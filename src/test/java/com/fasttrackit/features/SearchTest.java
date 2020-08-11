package com.fasttrackit.features;

import Util.BaseTest;
import com.fasttrackit.pages.LoginPage;
import com.fasttrackit.steps.SearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


public class SearchTest extends BaseTest {



    @Steps
    private SearchSteps searchSteps;
    private String text="LINEN";

    @Test
    public void serchTest(){

    searchSteps.SearchForInputText();
    }
}
