package tests;

import com.codeborne.selenide.testng.ScreenShooter;
import extensions.RetryAnalyzer;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;

@Listeners({ ScreenShooter.class })
@Test(retryAnalyzer = RetryAnalyzer.class)
public class RunBaseClass extends BaseTest {
    @Test
    public void testSuccessfulRun() throws Exception {

        HomePage home = new HomePage();
        ProductListPage productListPage = home.searchBox("kitap");
        ProductPage productpage = productListPage.productList();
        productpage.addToBasket();
        BasketPage basketpage = productpage.goToBasket();
        basketpage.discountCoupon("bugsteam");
        basketpage.falseDiscountCoupon("or 1=1");
    }

}
