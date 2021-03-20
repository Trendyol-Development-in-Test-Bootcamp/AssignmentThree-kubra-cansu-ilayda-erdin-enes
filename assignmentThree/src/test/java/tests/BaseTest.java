package tests;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeClass
    public static void setUp() throws Exception {
        Configuration.browser = "Chrome";
        Configuration.startMaximized = true;
      // Configuration.timeout = 10000;
        open("https://www.trendyol.com/");
        $("title").shouldHave(attribute("text", "En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da"));
        $(".fancybox-close").click();

    }
    @AfterClass
    public static void tearDown() {
        Selenide.closeWebDriver();
    }
}