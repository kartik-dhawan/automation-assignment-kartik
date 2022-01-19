package PageTests.addtocart;


import Core.BasicActionsIntegration;
import automationassignment.pageFunctions.ShopCartPageImpl;
import io.qameta.allure.*;
import org.testng.annotations.Test;

@Epic("Epic 1")
public class AddToCartTest extends BasicActionsIntegration {

    ShopCartPageImpl shop;

    @Test
    @Description("creating ShopCartPageImpl object before class")
    public void initImpl(){
        shop = new ShopCartPageImpl(Bot);
    }

    @Test(dependsOnMethods = "initImpl")
    @Description("To verify adding of product to the cart and whether right product and correct price is added")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Feature 2")
    @Story("Story 1")
    @Owner("Kartik Dhawan")
    public void product_in_cart_verification(){
        stepLogger("Click on dresses");
        shop.clickDresses();

        stepLogger("Click on casual dresses");
        shop.clickCasualDresses();

        stepLogger("Select an item from the page");
        shop.selectProduct();

        stepLogger("Add that item to cart");
        shop.addToCart();

        stepLogger("Close the popup");
        shop.closePopUp();

        stepLogger("Open the cart");
        shop.openCart();

        stepLogger("Verify if the same item with correct price is added to the cart");
        shop.nameCheck();
        shop.priceCheck();
    }


}
