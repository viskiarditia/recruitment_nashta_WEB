package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class logout {
    private final WebDriver webDriver;

    public logout() {
        super();
        this.webDriver = Hooks.webDriver;
        new Actions(webDriver);
        new WebDriverWait(webDriver, Duration.ofSeconds(20));
    }

    @When("User Click Avatar Profile choice Sign Out")
    public void userClickAvatarProfileChoiceSignOut() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));

        WebElement avatarProfile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header[@id='fuse-toolbar']/div/div[3]/button[4]/div/span")));
        avatarProfile.click();

        WebElement signOut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='Sign out']")));
        signOut.click();
    }

    @And("User logout page")
    public void userLogoutPage() throws InterruptedException {
        WebElement OpenWebsite = webDriver.findElement(By.cssSelector("[alt='logo']"));
        OpenWebsite.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(1000);
    }
}
