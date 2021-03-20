package pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ProductListPage {

    ElementsCollection results = $$(".p-card-img");

    public ProductPage productList() {

        results.first().click();
        int handles = getWebDriver().getWindowHandles().size();
        switchTo().window(handles - 1);
        return new ProductPage();

    }

}
