package hamclub_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utils.LocalDriverManager;
import utils.PropertiesReader;

public class HamclubLogin {


    private final WebDriver driver = LocalDriverManager.getInstance();
    private final By loginField = By.name("ccall");
    private final By passwordField = By.name("parol");
    private final By crsIcon = By.xpath("/html/body/div[2]/div/div[2]/form/div[2]/a/img");

    public void login(){
        driver.findElement(loginField).sendKeys(PropertiesReader.getProperties().getProperty("hamclub.login"));
        driver.findElement(passwordField).sendKeys(PropertiesReader.getProperties().getProperty("hamclub.password"));
        driver.findElement(passwordField).sendKeys(Keys.ENTER);
    }

    public void enterCrs(){
        driver.findElement(crsIcon).click();
    }

}
