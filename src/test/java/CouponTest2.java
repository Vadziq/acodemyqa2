import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import page_object.CartPage;
import page_object.HeaderPage;
import page_object.HomePage;
import page_object.ProductPage;
import utils.LocalDriverManager;
import utils.PropertiesReader;

import static constants.Colors.BLUE;
import static constants.Coupons.*;
import static constants.Messages.COUPON_IS_APPLIED;
import static constants.Products.HOODIE;

@Slf4j
public class CouponTest2 {

    private final WebDriver driver = LocalDriverManager.getInstance();
    ChromeOptions chromeOptions;
    HeaderPage header = new HeaderPage();
    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();


    @BeforeEach
    public void init(){

        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-logging");

        log.info("Step 1: User open webpage");
        driver.manage().window().maximize();
        driver.get(PropertiesReader.getProperties().getProperty("home.page"));
        System.out.println(driver.getTitle());
    }

    @Test
    public void CouponTests(){
        log.info("Step 2: User select product by name " + HOODIE);
        homePage.clickOnProduct(HOODIE);

        log.info("Step 3: User select color from list " + BLUE);
        productPage.selectColor(BLUE);

        log.info("Step 4: User select logo presence");
        productPage.selectLogo(true);

        log.info("Step 5: User add product to cart");
//        productPage.addProductToCart();
        productPage.addProductToCartWithJs();

        log.info("Step 6: User open cart");
        productPage.viewCart();

        log.info("Step 7: Check if \"Coupon code\" field available");
        cartPage.checkForCouponFieldAvailable("Coupon code");

        log.info("Step 8: User input incorrect coupon code: " + UNEXISTED_COUPON);
        cartPage.checkForCouponFieldAvailable("Coupon code");
        cartPage.enterCoupon(UNEXISTED_COUPON);

        log.info("Step 9: User apply coupon");
        cartPage.applyCoupon();

        log.info("Step 10: Check if coupon does not exist");
        cartPage.checkErrorMessage("Coupon \"" + UNEXISTED_COUPON + "\" does not exist!"); //WTF?

//        log.info("Step 11: User input coupon code: " + EASY_DISCOUNT);
//        cartPage.checkForCouponFieldAvailable("Coupon code");
//        cartPage.enterCoupon(EASY_DISCOUNT);
        log.info("Step 11: User input coupon code: " + EXPIRED);
        cartPage.checkForCouponFieldAvailable("Coupon code");
        cartPage.enterCoupon(EXPIRED);

        log.info("Step 12: User apply coupon");
        cartPage.applyCoupon();

        log.info("Step 13: Check if coupon is expired");
        cartPage.checkErrorMessage("This coupon has expired.");
//        log.info("Step 13: Check if coupon is applied");
//        cartPage.checkSuccessMessage(COUPON_IS_APPLIED);


        System.out.println();

    }

    @AfterEach
    public void tearDown() {

        LocalDriverManager.closeDriver();
    }
}
