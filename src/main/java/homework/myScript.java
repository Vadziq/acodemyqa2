package homework;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class myScript {
    public static void main(String[] args) {
        Faker mock = new Faker();

        Selenide.open("https://shop.acodemy.lv");
        $(By.linkText("My account")).click();
        $(By.id("reg_username")).sendKeys(mock.name().firstName() + "s");
        $(By.id("reg_email")).sendKeys(mock.internet().emailAddress());
        //$(By.id("reg_password")).sendKeys(mock.internet().password(8,16));
        $(By.name("register")).click();
        $(By.xpath("//ul[@class=`woocommerce-error`]//li")).shouldHave(Condition.text("Error: Please enter an account password."));
        System.out.println();

    }
}
//https://github.com/Vadziq/acodemyqa2/pull/3