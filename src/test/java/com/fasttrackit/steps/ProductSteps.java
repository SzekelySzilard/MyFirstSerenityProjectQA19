package com.fasttrackit.steps;

import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.SearchResultPage;
import net.thucydides.core.annotations.Step;

public class ProductSteps {

   private SearchResultPage  searchResultPage;
   private HomePage homePage;

   @Step

    public void NavigateToProduct(){
      homePage.open();
      homePage.searchForText();
      homePage.clickOnSearchButton();
   }

      @Step
      public void ClickOnProduct(){

       searchResultPage.clickProductLinen();
   }
   @Step

   public void ProductOnPage() {
      NavigateToProduct();
      ClickOnProduct();
   }
}
