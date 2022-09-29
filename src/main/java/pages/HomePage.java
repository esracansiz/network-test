package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {

    SearchBox searchBox ;
    By cartCountLocator = By.cssSelector( "body > div.stickyHeader > header > div > div > div.col-3.header__rightContent > div.header__basket.js-basket.header__basketLink > button > span");
    By cartContainerLocator = By.cssSelector("#header__desktopBasket > div > div.header__basketSummary > a");
    By acceptCookiesLocator = By.id("onetrust-accept-btn-handler");

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox(){
        return this.searchBox;
    }

    public boolean isProductCountUp() {
        return getCartCount() > 0 ;
    }

    public void goToCart() {
        click(cartContainerLocator);
    }

    private int getCartCount(){
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }

    public void acceptCookies(){
        if (isDisplayed(acceptCookiesLocator)){
            click(acceptCookiesLocator);
        }
    }
}
