package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProductsPage extends BasePage {

    By shippingOptionLocator = By.className("result_info");
    By productNameLocator =  By.cssSelector("#product-135995 > div > div.product__header > a.product__imageWrapper");



    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(shippingOptionLocator);
    }

    public void selectProduct() {
        click(productNameLocator);
    }

}
