package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Zadanie2Steps {
    WebDriver driver;

    @Given("jako zarejestrowany użytkownik loguję się na stronę sklepu")
    public void openWebSite() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php");

        MainPage mainPage = new MainPage(driver);
        mainPage.signInBtn();

        LogInToYourAccountPage logInToYourAccountPage = new LogInToYourAccountPage(driver);
        logInToYourAccountPage.login("qtvfczcdxwwmrnpitf@tbbyt.net", "Hasło123");
    }

    @When("jestem na stronie z produktami")
    public void returnToMainPage() {
        YourAccountPage yourAccountPage = new YourAccountPage(driver);
        yourAccountPage.returnToMainPage();
    }

    @And("wybiorę Hummingbird Printed Sweater")
    public void chooseHummigbirdPrintedSweater() {
        MainPage mainPage = new MainPage(driver);
        mainPage.chooseHummigbirdPrintedSweater();
    }

    @And("wybiorę 5 sztuk w rozmiarze M")
    public void chooseMSize() {
        HummingbirdPrintedSweaterPage hummingbirdPrintedSweaterPage = new HummingbirdPrintedSweaterPage(driver);
        hummingbirdPrintedSweaterPage.chooseSize();
        hummingbirdPrintedSweaterPage.chooseMSize();
        hummingbirdPrintedSweaterPage.quantity();
        hummingbirdPrintedSweaterPage.addProduct();
    }

    @And("przejdę do opcji checkout")
    public void proceedToCheckout() {
        HummingbirdPrintedSweaterPage hummingbirdPrintedSweaterPage = new HummingbirdPrintedSweaterPage(driver);
        hummingbirdPrintedSweaterPage.proceedToCheckout();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.proceedToCheckutBtn();
    }

    @And("potwierdzę adres")
    public void confirmAddress() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.confirmAddress();
    }


    @And("wybiorę metodę płatności Pay by Check")
    public void payByCheck() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.paymentBtn();
        checkoutPage.payByCheckOption();

    }

    @And("kliknę na “order with an obligation pay”")
    public void cklickOrderWithAnObligationToPay() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.agreeOfTermsOfService();
        checkoutPage.orderWIthAnObligationToPay();
    }

    @Then("zrobię screenshot z potwierdzeniem zamówienia")
    public void takeScreenshot() throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\Childeryk\\Desktop\\tester\\tester automatyzujący\\Zaliczenie\\screenshot\\screenshot.png"));
        driver.quit();
    }
}


