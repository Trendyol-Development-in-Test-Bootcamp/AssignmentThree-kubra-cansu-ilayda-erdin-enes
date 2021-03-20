package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;


public class BasketPage {

    public static String result;
    public void discountCoupon(String value) throws Exception {
        
        $(".pb-header").shouldHave(Condition.text("Sepetim (1 Ürün)"));
        $(By.id("Kod")).shouldBe(Condition.visible).setValue(value);
        $(By.id("addDiscountButton")).shouldBe(Condition.visible).click();
        Thread.sleep(5000);
        result = $(".lighboxcontainer").shouldBe(Condition.visible).getText();
        System.out.println(result);
        $(".buttonclose").shouldBe(Condition.visible).click();
        $("#Kod").shouldBe(Condition.visible).clear();
    }

    public void falseDiscountCoupon(String value) throws InterruptedException {

        $(By.id("Kod")).shouldBe(Condition.visible).setValue(value);
        $(By.id("addDiscountButton")).shouldBe(Condition.visible).click();
        Thread.sleep(5000);
        String result2 = $(".lighboxcontainer").shouldBe(Condition.visible).getText();
        System.out.println(result2);
        $(".buttonclose").shouldBe(Condition.visible).click();
        assert !(result.equals(result2));
        //assert true;

    }
}




