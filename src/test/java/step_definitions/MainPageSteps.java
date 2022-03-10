package step_definitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import page_object.HomePage;
import utils.LocalDriverManager;

public class MainPageSteps {

    HomePage homePage = new HomePage();

    @And("user clicks on product {string}")
    public void userClicksOnProduct(String productName) {
        homePage.clickOnProduct(productName);
    }
}
