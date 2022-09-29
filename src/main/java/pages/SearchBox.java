package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage{

    By searchBoxLocator = By.id("search");


    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(searchBoxLocator , text);
        driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
    }
}
