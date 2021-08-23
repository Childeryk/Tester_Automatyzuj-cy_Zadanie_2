package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CheckoutPage {
    private static WebDriver driver;

    @FindBy(css= "button.btn-primary")
    WebElement confirmAddress;
    @FindBy (className = "-unreachable")
    WebElement paymentBtn;

    @FindBy (css = "input.ps-shown-by-js ")
    WebElement payByCheckOption;

    @FindBy(id= "conditions_to_approve[terms-and-conditions]")
    WebElement agreeOfTermsOfService;

    @FindBy(xpath = "//*[@id=\"payment-confirmation\"]/div[1]/button")
    WebElement orderWIthAnObligationToPay;

    public CheckoutPage(WebDriver driver) {
        CheckoutPage.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void confirmAddress() {
        confirmAddress.click();
    }

    public void paymentBtn() {
        paymentBtn.click();
    }

    public void payByCheckOption() {
        payByCheckOption.click();

    }

    public void agreeOfTermsOfService() {
        agreeOfTermsOfService.click();
    }

    public void orderWIthAnObligationToPay() {

        orderWIthAnObligationToPay.click();
    }

}


