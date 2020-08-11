package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/catalogsearch/result/?q=LINEN")
public class SearchResultPage  extends PageObject {

    @FindBy(id="product-collection-image-406")
    public WebElementFacade ProductLinen;

    public void clickProductLinen () {clickOn(ProductLinen); }
}
