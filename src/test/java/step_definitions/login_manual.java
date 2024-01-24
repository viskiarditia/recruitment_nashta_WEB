package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.ThreadUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class login_manual {

    private final WebDriver webDriver;
    public login_manual() {
        super();
        this.webDriver = Hooks.webDriver;
        new Actions(webDriver);
        new WebDriverWait(webDriver, Duration.ofSeconds(10));
    }
    
    @When("User Click menu Login/Register")
    public void userClickMenuLoginRegister() throws InterruptedException {
        WebElement openWebSite = webDriver.findElement(By.xpath("//input[@name='email']"));
        openWebSite.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(9);
    }

    @And("User Already Log into Recuitment NasTa Group page")
    public void userAlreadyLogIntoRecuitmentNasTaGroupPage() throws InterruptedException {

    }

    @Then("User Click Email or Username Field")
    public void userClickEmailOrUsernameField() throws InterruptedException {
        WebElement submitButton = webDriver.findElement(By.xpath("//input[@name='email']"));
        submitButton.click();
        Thread.sleep(1000);
    }


    @Then("Input any alphabet \\(e.g: Abcd)")
    public void inputAnyAlphabetEGAbcd() throws InterruptedException {
        WebElement textBox = webDriver.findElement(By.xpath("//input[@name='password']"));
        textBox.sendKeys("test");
        Thread.sleep(1000);

    }

    @Then("Input any numeric")
    public void inputAnyNumeric() throws InterruptedException {
        WebElement textBox = webDriver.findElement(By.xpath("//input[@name='password']"));
        textBox.sendKeys("123");
        Thread.sleep(1000);
    }

    @Then("Input any special character")
    public void inputAnySpecialCharacter() throws InterruptedException {
        WebElement textBox = webDriver.findElement(By.xpath("//input[@name='password']"));
        textBox.sendKeys("!@#!");
        Thread.sleep(1000);
    }

    @Then("User Click Password Field")
    public void userClickPasswordField() {
        WebElement addNew = webDriver.findElement(By.xpath("//input[@name='password']"));
        addNew.click();
        Thread.sleep(3000);

    }

    @Then("User Click And Input Email or Username & Password with Valid Data")
    public void userClickAndInputEmailOrUsernamePasswordWithValidData() {

    }

    @And("User Click Sign In Button")
    public void userClickSignInButton() {
        WebElement addNew = webDriver.findElement(By.xpath("//input[@name='password']"));
        addNew.click();
        Thread.sleep(3000);
    }

    @Then("User Click And Input Email or Username & Password with Invalid Data")
    public void userClickAndInputEmailOrUsernamePasswordWithInvalidData() {
    }

    @Then("User Click And Input Password")
    public void userClickAndInputPassword() {
    }

    @Then("User Click And Input Email or Username with Valid Data")
    public void userClickAndInputEmailOrUsernameWithValidData() {
    }

}
