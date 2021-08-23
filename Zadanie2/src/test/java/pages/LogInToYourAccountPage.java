package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInToYourAccountPage {
    private static WebDriver driver;

    @FindBy(className = "form-control")
    WebElement emailInput;

    @FindBy(className = "js-visible-password")
    WebElement passwordInput;

    @FindBy(id = "submit-login")
    WebElement signIn;

    public LogInToYourAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LogInToYourAccountPage login(String login, String password) {
        emailInput.sendKeys(login);
        passwordInput.sendKeys(password);
        signIn.click();
        return new LogInToYourAccountPage(driver);
    }
}