package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;


public class HomePage {

    public ProductListPage searchBox(String value) {
        $(".search-box").shouldBe(Condition.visible).setValue(value).pressEnter();
        return new ProductListPage();
    }


}
