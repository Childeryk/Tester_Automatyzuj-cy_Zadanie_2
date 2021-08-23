package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private final WebDriver driver;

    @FindBy(id = "_desktop_user_info")
    WebElement signIn;

    @FindBy (xpath = "//*[@id=\"content\"]/section/div/article[2]/div/a")
    WebElement clickHummingbirdPrintedSweater;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void signInBtn() {
        signIn.click();
    }

    public void chooseHummigbirdPrintedSweater () {
        clickHummingbirdPrintedSweater.click();
    }


}

