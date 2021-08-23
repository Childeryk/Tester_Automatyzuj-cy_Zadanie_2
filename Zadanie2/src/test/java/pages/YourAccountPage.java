package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAccountPage {
    private static WebDriver driver;

    @FindBy (id = "_desktop_logo")
    WebElement returnMainPAge;


    public YourAccountPage(WebDriver driver) {
        YourAccountPage.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void returnToMainPage () {
        returnMainPAge.click();
    }

}
