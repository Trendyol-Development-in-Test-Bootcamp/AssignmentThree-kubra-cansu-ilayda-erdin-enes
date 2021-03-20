package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class ProductPage {

    public void addToBasket() {

        $(By.className("add-to-bs-tx")).shouldBe(Condition.visible).click();
    }

    public BasketPage goToBasket() {

        $(".account-basket").shouldBe(Condition.visible).click();
        return new BasketPage();

    }
}
