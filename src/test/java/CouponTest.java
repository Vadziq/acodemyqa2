import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import page_object.CartPage;
import page_object.HeaderPage;
import page_object.HomePage;
import page_object.ProductPage;
import utils.LocalDriverManager;
import utils.PropertiesReader;


import static constants.Colors.BLUE;
import static constants.Messages.COUPON_IS_APPLIED;
import static constants.Messages.COUPON_IS_REMOVED;
import static constants.Products.HOODIE;
import static constants.Coupons.EASY_DISCOUNT;
import static constants.Coupons.UNEXISTED_COUPON;

@Slf4j
public class CouponTest {


    private final WebDriver driver = LocalDriverManager.getInstance();

    ChromeOptions chromeOptions;
    HeaderPage header = new HeaderPage();
    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();


    @BeforeEach
    public void init() {

        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-logging");

        log.info("Step 1: User open webpage");
        driver.manage().window().maximize();
        driver.get(PropertiesReader.getProperties().getProperty("home.page"));
        System.out.println(driver.getTitle());
    }

    @Test
    public void applyCouponCode() {

        log.info("Step 2: User select product by name " + HOODIE);
        homePage.clickOnProduct(HOODIE);

        log.info("Step 3: User select color from list " + BLUE);
        productPage.selectColor(BLUE);

        log.info("Step 4: User select logo presence");
        productPage.selectLogo(true);

        log.info("Step 5: User add product to cart");
        productPage.addProductToCart();

        log.info("Step 6: User open cart");
        productPage.viewCart();

        log.info("Step 7: User input coupon code");
        cartPage.enterCoupon(UNEXISTED_COUPON);
//        cartPage.enterCoupon("easy_discount");

        log.info("Step 8: User apply coupon");
        cartPage.applyCoupon();

//        log.info("Step 9: Check if coupon is applied");
//        cartPage.checkSuccessMessage(COUPON_IS_APPLIED);

        log.info("Step 9: Check if coupon is wrong");
        cartPage.checkErrorMessage("Coupon \"" + UNEXISTED_COUPON + "\" does not exist!");


        log.info("Step 10: User remove coupon");
//        cartPage.removeCoupon();
//        cartPage.removeCouponWithJs();

        log.info("Step 11: Check if coupon is removed");
//        cartPage.checkRemovedMessage(COUPON_IS_REMOVED);
        System.out.println();

//        header.searchForAProduct("Album");
//        assertThat(driver.getTitle(), equalTo("Online shop – acodemy – Just another WordPress site"));
//        assertThat(driver.getTitle(), is(equalTo("Online shop – acodemy – Just another WordPress site")));
//        assertThat(driver.getTitle(), is("Online shop – acodemy – Just another WordPress site"));
//        assertThat(driver.getTitle(), containsString("Online shop"));
//        System.out.println(driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/ul/li[1]/a[2]")).getText());
//        System.out.println();

//        for (int i = 0; i < home.getAllProducts().size(); i++) {
//            if(home.getAllProducts().get(i).getText().contains("Cap")){
//                home.getAllProducts().get(i).click();
//            }
//        }

//        for(WebElement product : home.getAllProducts()){
//            if(product.getText().contains("Cap")){
//                product.click();
//                break;
//            }
//        }
//        searchField.sendKeys("Album");
//        searchField.submit();//Keys.ENTER
//        WebElement addToCartButton = driver.findElement(By.name("add-to-cart"));
//        addToCartButton.click();
//        WebElement viewCartButton = driver.findElement(By.linkText("View cart"));
//        viewCartButton.click();


//        List<WebElement> list = driver.findElements(By.xpath("//h2[@class='woocommerce-loop-product__title']"));
//
//        for (WebElement element:list) {
//            System.out.println(element.getText());
//            //h2[@class='woocommerce-loop-product__title']
//        }
//
//        List<WebElement> list2 = driver.findElements(By.xpath("//a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link']"));
//        for (WebElement element:list2) {
//            System.out.println(element.getText());
//            //h2[@class='woocommerce-loop-product__title']
//        }
//        List<WebElement> list3 = driver.findElements(By.xpath("//li/a[text()='Add to cart']"));
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(1));
//        for(int i=0;i<list3.size();i++) {
//            System.out.println(list3.get(i));
//            list3.get(i).click();
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/main/ul/li["+(i+1)+"]/a[3]")));
//        }
//        System.out.println();
//        driver.findElement(By.xpath("/html/body/div/header/div[2]/div/nav/div[1]/ul/li[2]/a")).click();
//
//        System.out.println("pause");
    }

    @AfterEach
    public void tearDown() {
        LocalDriverManager.closeDriver();
    }
}
