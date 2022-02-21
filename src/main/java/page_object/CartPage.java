package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Delay;
import utils.LocalDriverManager;
import utils.PropertiesReader;
import java.time.Duration;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CartPage {
    private final WebDriver driver = LocalDriverManager.getInstance();
    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(PropertiesReader.getProperties().getProperty("implicit.wait"))));
    private final Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);
    private final Delay delay = new Delay();




    private final By couponCodeField = By.id("coupon_code");
    private final By applyCouponButton = By.name("apply_coupon");
    private final By successMessage = By.className("woocommerce-message");
    private final By errorMessage = By.className("woocommerce-error");
    private final By removeButton = By.className("woocommerce-remove-coupon");
//    private final By removeButton = By.xpath("//a[@class='woocommerce-remove-coupon']");


    public void checkForCouponFieldAvailable(String message){
        wait.until(ExpectedConditions.presenceOfElementLocated(couponCodeField));
        assertThat(driver.findElement(couponCodeField).getAttribute("placeholder"), equalTo(message));
        System.out.println(driver.findElement(couponCodeField).getAttribute("placeholder"));
    }


    public void enterCoupon(String code){
        delay.seconds(5);
        driver.findElement(couponCodeField).sendKeys(code);
    }

    public void applyCoupon(){
        driver.findElement(applyCouponButton).click();
    }

    public void checkSuccessMessage(String message){
        wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage));
        assertThat(driver.findElement(successMessage).getText(), equalTo(message));
        System.out.println(driver.findElement(successMessage).getText());
    }

    public void checkErrorMessage(String message){
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
        assertThat(driver.findElement(errorMessage).getText(), equalTo(message));
        System.out.println(driver.findElement(errorMessage).getText());
    }

    public void removeCoupon(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(removeButton));
        wait.until(ExpectedConditions.elementToBeClickable(removeButton));
        driver.findElement(removeButton).click();
    }

    public void removeCouponWithJs(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(removeButton));
        wait.until(ExpectedConditions.elementToBeClickable(removeButton));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", driver.findElement(removeButton));
    }

    public void checkRemovedMessage(String message){
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(successMessage)));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(successMessage, message));
        assertThat(driver.findElement(successMessage).getText(), equalTo(message));
        System.out.println(driver.findElement(successMessage).getText());
    }

}
