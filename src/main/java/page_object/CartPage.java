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
import java.util.concurrent.TimeoutException;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CartPage {
    private final WebDriver driver = LocalDriverManager.getInstance();
    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(PropertiesReader.getProperties().getProperty("explicit.wait"))));
//    private final Wait<WebDriver> fluentWait = new FluentWait<>(driver);
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
//        wait.until(ExpectedConditions.not(ExpectedConditions.stalenessOf(driver.findElement(couponCodeField))));
        System.out.println(code);
        wait.until(driver -> "complete".equals(((JavascriptExecutor) driver).executeScript("return document.readyState")));
//        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//form[contains(@class,'processing')]"))));
//        delay.seconds(Integer.parseInt(PropertiesReader.getProperties().getProperty("delay.wait")));
        driver.findElement(couponCodeField).sendKeys(code);
    }

    public void applyCoupon(){
//        wait.until(ExpectedConditions.not(ExpectedConditions.stalenessOf(driver.findElement(applyCouponButton))));
//        wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(applyCouponButton)));
//        wait.until(ExpectedConditions.elementToBeClickable(applyCouponButton));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", driver.findElement(applyCouponButton));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//form[contains(@class,'processing')]"))));
//        driver.findElement(applyCouponButton).click();
    }

    public void checkSuccessMessage(String message){
        wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage));
        assertThat(driver.findElement(successMessage).getText(), equalTo(message));
//        System.out.println(driver.findElement(successMessage).getText());
    }

    public void checkErrorMessage(String message){
        System.out.println(message);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
        wait.until(ExpectedConditions.textToBe(errorMessage, message));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(PropertiesReader.getProperties().getProperty("imlicit.wait"))));
//        delay.seconds(Integer.parseInt(PropertiesReader.getProperties().getProperty("delay.wait")));
        assertThat(driver.findElement(errorMessage).getText(), equalTo(message));
//        System.out.println(driver.findElement(errorMessage).getText());
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
