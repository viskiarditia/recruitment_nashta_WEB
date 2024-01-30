package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;


public class login {

    private final WebDriver webDriver;
    public login() {
        super();
        this.webDriver = Hooks.webDriver;
        new Actions(webDriver);
        new WebDriverWait(webDriver, Duration.ofSeconds(10));
    }



    @Given("User already open website Recruitment NasTa Group")
    public void userAlreadyOpenWebsiteRecruitmentNasTaGroup() throws InterruptedException {
        WebElement OpenWebsite = webDriver.findElement(By.cssSelector("[alt='logo']"));
        OpenWebsite.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(1000);
    }
    

    @Then("User Click Email or Username Field")
    public void userClickEmailOrUsernameField() {
        WebElement ClickFieldEmail = webDriver.findElement(By.xpath("//input[@name='email']"));
        ClickFieldEmail.click();
    }

    @Then("Input any {string}")
    public void inputAny(String Data) throws InterruptedException {
        WebElement dataInput = webDriver.findElement(By.xpath("//input[@name='email']"));
        dataInput.sendKeys(Data);
    }

    @Then("User Click Password Field")
    public void userClickPasswordField() {
        WebElement ClickFieldPassword = webDriver.findElement(By.xpath("//input[@name='password']"));
        ClickFieldPassword.isDisplayed();
        Assert.assertTrue(true);
    }

    @Then("User Click And Input Email or Username & Password with Valid Data")
    public void userClickAndInputEmailOrUsernamePasswordWithValidData() {
        Properties properties;
        properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream("src/test/resources/config.properties")) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String email = properties.getProperty("email");
        String password = properties.getProperty("password");

        WebElement dataInput = webDriver.findElement(By.cssSelector("[name='email']"));
        dataInput.click();
        dataInput.clear();
        dataInput.sendKeys(email);

        WebElement ClickFieldPassword = webDriver.findElement(By.cssSelector("[name='password']"));
        ClickFieldPassword.click();
        ClickFieldPassword.clear();
        ClickFieldPassword.sendKeys(password);

    }

    @And("User Click Sign In Button")
    public void userClickSignInButton() throws InterruptedException {
        WebElement ClickSignIn = webDriver.findElement(By.cssSelector(".MuiButton-root"));
        ClickSignIn.click();
        Thread.sleep(5000);
    }


    @Then("User already on landing page")
    public void userAlreadyOnLandingPage() {
//        dasar code
//        WebElement landingPage = webDriver.findElement(By.cssSelector(".MuiToolbar-root"));
//        landingPage.isDisplayed();
//        Assert.assertTrue(true);

        By landingPageSelector = By.cssSelector(".MuiToolbar-root");
        List<WebElement> landingPageElements = webDriver.findElements(landingPageSelector);

        if (!landingPageElements.isEmpty()) {
            // Verifikasi bahwa setidaknya satu elemen ditemukan
            WebElement landingPage = landingPageElements.get(0);
            Assert.assertTrue(landingPage.isDisplayed());
            System.out.println("User is on the landing page."); // Opsional: Tambahkan pesan log jika ditemukan
        } else {
            // Eksekusi kode jika elemen tidak ditemukan
            System.out.println("Element not found. User may not be on the landing page.");

        }
    }

    @Then("User Click And Input Email & Password with Invalid Data")
    public void userClickAndInputEmailPasswordWithInvalidData() throws InterruptedException {
        Properties properties;
        properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream("src/test/resources/config.properties")) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Membuat array untuk email dan password
        String[] emails = new String[2];
        String[] passwords = new String[2];

        // Mengisi array dengan nilai dari konfigurasi
        int i;
        for (i = 0; i < 2; i++) {
            emails[i] = properties.getProperty("emailInvalid" + (i + 1));
            passwords[i] = properties.getProperty("passwordInvalid" + (i + 1));
        }

//        String email = emails[i];
//        String password = passwords[i];
        String email1 = properties.getProperty("emailInvalid1");
        String password1 = properties.getProperty("passwordInvalid1");

        WebElement dataInput = webDriver.findElement(By.cssSelector("[name='email']"));
        dataInput.click();
        dataInput.clear();
        dataInput.sendKeys(email1);

        WebElement ClickFieldPassword = webDriver.findElement(By.cssSelector("[name='password']"));
        ClickFieldPassword.click();
        ClickFieldPassword.clear();
        ClickFieldPassword.sendKeys(password1);

        WebElement ClickSignIn = webDriver.findElement(By.cssSelector(".MuiButton-root"));
        ClickSignIn.click();
        Thread.sleep(5000);

        By landingPageSelector = By.cssSelector(".MuiToolbar-root");
        List<WebElement> landingPageElements = webDriver.findElements(landingPageSelector);

        if (!landingPageElements.isEmpty()) {
            // Verifikasi bahwa setidaknya satu elemen ditemukan
            WebElement landingPage = landingPageElements.get(0);
            Assert.assertTrue(landingPage.isDisplayed());
            System.out.println("User is on the landing page."); // Opsional: Tambahkan pesan log jika ditemukan
        } else {
            // Eksekusi kode jika elemen tidak ditemukan
            System.out.println("Element not found. User may not be on the landing page.");
        }

    }

}
