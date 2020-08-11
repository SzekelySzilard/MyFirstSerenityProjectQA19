package com.fasttrackit.features;

import Util.BaseTest;
import com.fasttrackit.steps.ProductSteps;
import com.fasttrackit.steps.SearchSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class ProductTest extends BaseTest {

@Steps

private ProductSteps productSteps;
private SearchSteps searchSteps;



@Test

    public void ProductTestLinen(){

    productSteps.ProductOnPage();

}
}
