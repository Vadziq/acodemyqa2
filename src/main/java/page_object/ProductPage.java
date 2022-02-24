package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.LocalDriverManager;
import utils.PropertiesReader;

import java.time.Duration;

public class ProductPage {
    private final WebDriver driver = LocalDriverManager.getInstance();
    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(PropertiesReader.getProperties().getProperty("implicit.wait"))));
//    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    private final By colorSelection = By.id("pa_color");
    private final By logoSelection = By.id("logo");
//    private final By productCartButton = By.xpath("//button[contains(@class,'single_add_to_cart_button')]");
    private final By productCartButton = By.xpath("//button[contains(@class,'button')]");
    private final By viewCartButton = By.xpath("//div[@class='woocommerce']//a[text()='View cart']");


    public void selectColor(String color) {

        Select sColor = new Select(driver.findElement(colorSelection));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(colorSelection));
        sColor.selectByVisibleText(color);
    }

    public void selectLogo(boolean isLogo){
        Select sLogo = new Select(driver.findElement(logoSelection));
        if(isLogo){
            sLogo.selectByVisibleText("Yes");
        }else{
            sLogo.selectByVisibleText("No");
        }
    }

    public void addProductToCart(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(productCartButton));
        wait.until(ExpectedConditions.elementToBeClickable(productCartButton));
        driver.findElement(productCartButton).click();
    }

    public void addProductToCartWithJs(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", driver.findElement(productCartButton));
    }

    public void viewCart(){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(viewCartButton));
        wait.until(ExpectedConditions.elementToBeClickable(viewCartButton));
        driver.findElement(viewCartButton).click();
    }
}
