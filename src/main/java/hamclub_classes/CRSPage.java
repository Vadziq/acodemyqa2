package hamclub_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.LocalDriverManager;
import utils.PropertiesReader;

import java.time.Duration;
import java.util.List;

public class CRSPage {
    private final WebDriver driver = LocalDriverManager.getInstance();
    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(PropertiesReader.getProperties().getProperty("hamclub.wait"))));
    private final By checkLink = By.linkText("Проверить(Check)");
    //By.xpath("//a[text()='Проверить(Check)']");

    public void checkElements() {
        List<WebElement> list = driver.findElements(checkLink);
//        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
            list.get(i).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[23]/div/a[1]")));

//            driver.switchTo().frame(0);
//            System.out.println(driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td[2]/font")).getText());
//            driver.switchTo().defaultContent();
            // driver.findElement(By.cssSelector("input[name='custId']")).getText();
//            System.out.println(driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td[2]/font")).getText());
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[23]")));
            //  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div[23]/div/div[9]")));
            //wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("/html/body/table[1]/tbody/tr/td[1]/font")));


            //Thread.sleep(100000);
            // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/table[1]/tbody/tr/td[2]/font")));

            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("fancybox-frame")));
//            System.out.println();
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/table[1]/tbody/tr/td[2]/font")));

//            System.out.println("pause");
            System.out.println(i + " " + driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td[2]/font")).getText() + " ");
            System.out.println(driver.findElement(By.xpath("/html/body/table[3]/tbody/tr/td[4]/font")).getText());

//            System.out.println(driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td[2]/font")).getAccessibleName());
            driver.switchTo().defaultContent();

//            ExpectedConditions.
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[23]/div/a[1]")));
            driver.findElement(By.xpath("/html/body/div[23]/div/a[1]")).click();
//            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("fancybox-frame")));
//            System.out.println();
        }

//        for (WebElement element:list) {
//            driver.findElement(By.xpath("//a[text()='Проверить(Check)']")).click();
//            System.out.println(driver.getCurrentUrl());
//            System.out.println();
////        System.out.println(driver.findElement(B.linkText("/html/body/table[1]/tbody/tr/td[2]/font")).getText());
//            driver.findElement(By.xpath("/html/body/div[23]/div/a[1]")).click();
//        }
    }
}
