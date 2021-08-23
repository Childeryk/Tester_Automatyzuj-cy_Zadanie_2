package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
    private static WebDriver driver;


    @FindBy(css= "a.btn-primary")
    WebElement proceedToCheckutBtn;

    public ShoppingCartPage(WebDriver driver) {
        ShoppingCartPage.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void proceedToCheckutBtn() {
        proceedToCheckutBtn.click();
    }


}

