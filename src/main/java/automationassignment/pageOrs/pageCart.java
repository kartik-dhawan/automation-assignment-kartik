package automationassignment.pageOrs;

import org.openqa.selenium.By;

public class pageCart {

    public static final By DRESSES = By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='Dresses']");
    public static final By CASUAL_DRESSES = By.xpath("//ul[@class='tree dynamized']/li/a[contains(text(), 'Casual Dresses')]");
    public static final By PRODUCT = By.xpath("//ul[@class='product_list grid row']/li[1]");
    public static final By PRODUCT_NAME = By.xpath("//h1[@itemprop='name']");
    public static final By PRODUCT_PRICE = By.id("our_price_display");
    public static final By ADD_BTN = By.xpath("//button/span[contains(text(), 'Add to cart')]");
    public static final By CROSS_POPUP = By.xpath("//span[@class='cross']");
    public static final By CART_BTN = By.xpath("//b[contains(text(), 'Cart')]");
    public static final By PRODUCT_NAME_CART = By.xpath("//td[@class='cart_description']/p/a");
    public static final By PRODUCT_CART_PRICE = By.id("total_product_price_3_13_0");
    public static String ProductTextName;
    public static String PriceTextName;

}
