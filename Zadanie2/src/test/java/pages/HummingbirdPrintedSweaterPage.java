package pages;

import org.awaitility.Awaitility;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HummingbirdPrintedSweaterPage {
    private static WebDriver driver;


    @FindBy (className = "form-control-select")
    WebElement chooseSize;

    @FindBy(xpath = "//*[@id=\"group_1\"]/option[2]")
    WebElement chooseMSize;

    @FindBy(xpath = "//*[@id=\"quantity_wanted\"]")
    WebElement quantity;

    @FindBy(className = "add-to-cart")
    WebElement addProduct;

    @FindBy(css= "a.btn-primary")
    WebElement proceedToCheckout;

    public HummingbirdPrintedSweaterPage(WebDriver driver) {
        HummingbirdPrintedSweaterPage.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void chooseSize() {
        chooseSize.click();
    }

    public void chooseMSize() {
        chooseMSize.click();
    }

    public void quantity()  {
        String quantity1 = "//*[@id=\"quantity_wanted\"]";
        Awaitility.await().atMost(1, TimeUnit.SECONDS).until(() -> wait(driver, quantity1));
        driver.findElement(By.xpath(quantity1));
        quantity.clear();
        quantity.sendKeys("5");
    }

    public void addProduct() {
        addProduct.click();
    }

    public void proceedToCheckout() {
        proceedToCheckout.click();
    }

    public static boolean wait(WebDriver driver, String selector) {
        try {
            driver.findElement(By.xpath(selector));
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }
}