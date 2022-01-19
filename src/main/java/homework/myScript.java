package homework;

import com.codeborne.selenide.Selenide;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class myScript {
    public static void main(String[] args) {
        Faker mock = new Faker();

        Selenide.open("https://shop.acodemy.lv");
        $(By.linkText("My account")).click();
        $(By.id("reg_username")).sendKeys(mock.name().firstName() + "xz");
        System.out.println();

    }
}
