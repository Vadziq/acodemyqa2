import hamclub_classes.CRSPage;
import hamclub_classes.HamclubLogin;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import utils.LocalDriverManager;
import utils.PropertiesReader;


import java.time.Duration;
import java.util.List;




@Slf4j
public class HamclubTest {

    private final WebDriver driver = LocalDriverManager.getInstance();
    HamclubLogin hamclubLogin = new HamclubLogin();
    CRSPage crsPage = new CRSPage();


    @BeforeEach
    public void init() {

    }

    @Test
    public void hamClubTest() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        driver.manage().window().maximize();

        log.info("Step 1 : Open " + PropertiesReader.getProperties().getProperty("hamclub.page"));
        driver.get(PropertiesReader.getProperties().getProperty("hamclub.page"));

        log.info("Step 2 : Login to " + driver.getTitle());
        hamclubLogin.login();

        log.info("Step 3 : Enter CRS");
        hamclubLogin.enterCrs();

        log.info("Step 4 : List of units");
        crsPage.checkElements();

        log.info("");

        // System.out.println(driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td[2]/font")));
        //driver.findElement(By.id("fancybox-close")).click();
//        for (WebElement element:list) {
//            element.click();
//            System.out.println("stop");
////            System.out.println(driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td[2]/font")));
////            driver.findElement(By.id("fancybox-close")).click();
//        }

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
