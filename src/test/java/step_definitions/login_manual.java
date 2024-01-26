package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
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

import java.io.File;
import java.time.Duration;

public class login_manual {

    private final WebDriver webDriver;
    public login_manual() {
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

    @When("User Click menu SignIn")
    public void userClickMenuSignIn() {
    }
}
