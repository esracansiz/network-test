package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProductDetailPage extends BasePage{

    By addToCartButtonLocator = By.cssSelector("#mainContent > div > div.container > div.row > div.col-12.col-lg-4 > div > div.product__buttons > button.product__button.-addToCart.btn.-black");
    By size = By.cssSelector("#mainContent > div > div.container > div.row > div.col-12.col-lg-4 > div > div.product__sizes > div.product__content.-sizes > div:nth-child(6) > label");
    By goToBasket = By.xpath("//*[@class='button -primary header__basket--checkout header__basketModal -checkout']");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToCartButtonLocator);
    }

    public void addToCart() {
        click(size);
        click(addToCartButtonLocator);
        click(goToBasket);
        System.out.println("Sepete gidildi");
    }
}


