import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;

public class CouponTest {

    WebDriver driver;
    ChromeOptions chromeOptions;

    @BeforeEach
    public void init(){
        driver = new ChromeDriver();
        chromeOptions = new ChromeOptions();
    }

    @Test
    public void applyCouponCode(){

        chromeOptions.addArguments("--disable-logging");
        driver.get("https://shop.acodemy.lv");
        System.out.println(driver.getTitle());
        assertThat(driver.getTitle(), equalTo("Online shop – acodemy – Just another WordPress site"));
        assertThat(driver.getTitle(), is(equalTo("Online shop – acodemy – Just another WordPress site")));
        assertThat(driver.getTitle(), is("Online shop – acodemy – Just another WordPress site"));
        assertThat(driver.getTitle(), containsString("Online shop"));

    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }
}
