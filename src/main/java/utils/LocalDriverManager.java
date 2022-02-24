package utils;

import exceptions.UnsupportedDriverException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocalDriverManager {

    private static WebDriver driver;

    public static WebDriver getInstance(){
        if(driver == null){
            driver = localDriver();
        }
        return driver;
    }

    public static WebDriver localDriver(){
        String browser = PropertiesReader.getProperties().getProperty("browser").toLowerCase();
        switch (browser){
            case"chrome":
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            case"firefox":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();

            default: throw new UnsupportedDriverException("Following browser is not supported");
        }
    }

    public static void closeDriver(){
        driver.quit();
        driver = null;
    }
}
