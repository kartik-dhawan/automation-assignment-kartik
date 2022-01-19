package automationassignment.pageFunctions;

import automationassignment.pageOrs.pageCart;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ShopCartPageImpl extends BasicActions{

    public ShopCartPageImpl(WebDriver bot){
        super(bot);
    }

    @Step("Clicking on Dresses")
    public void clickDresses(){
        click(pageCart.DRESSES);
//        sleep(2000);
    }

    @Step("Clicking on casual dresses")
    public void clickCasualDresses(){
        click(pageCart.CASUAL_DRESSES);
//        sleep(2000);
    }

    @Step("Selecting the product")
    public void selectProduct(){
        click(pageCart.PRODUCT);
//        sleep(3000);
    }

    @Step("Adding the product to the cart")
    public void addToCart(){

        pageCart.ProductTextName = textReceiver(pageCart.PRODUCT_NAME);
        pageCart.PriceTextName = textReceiver(pageCart.PRODUCT_PRICE);

        click(pageCart.ADD_BTN);
    }

    @Step("Closing the popup")
    public void closePopUp(){
//        sleep(2000);
        clickPopupElement(pageCart.CROSS_POPUP);
    }

    @Step("Opening the cart")
    public void openCart(){
//        sleep(2000);
        click(pageCart.CART_BTN);
    }

    @Step("verifying the product name")
    public void nameCheck(){
        System.out.println("Name checking started");
        Assert.assertTrue(dataMatcher(pageCart.ProductTextName, pageCart.PRODUCT_NAME_CART));
        System.out.println("Name checking completed");

    }

    @Step("verifying the product price")
    public void priceCheck(){
        System.out.println("Price checking started");
        Assert.assertTrue(dataMatcher(pageCart.PriceTextName, pageCart.PRODUCT_CART_PRICE));
        System.out.println("Price checking completed");
    }

}
