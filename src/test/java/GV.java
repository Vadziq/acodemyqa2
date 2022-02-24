import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GV {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        Point point = new Point(20,20);

        System.out.println(driver.manage().window().getPosition());
        driver.manage().window().setPosition(point);
        driver.manage().window().setPosition(point.moveBy(20,20));
//        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getPosition());
        chromeOptions.addArguments("--disable-logging");
        driver.get("https://shop.acodemy.lv");
        System.out.println(driver.getTitle());

        driver.close();

    }

}
