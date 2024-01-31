package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class JobOrder_Approval {
    private final WebDriver webDriver;
    public JobOrder_Approval() {
        super();
        this.webDriver = Hooks.webDriver;
        new Actions(webDriver);
        new WebDriverWait(webDriver, Duration.ofSeconds(20));
    }

    @When("User already logged in as account Approved")
    public void userAlreadyLoggedInAsAccountApproved() {
        Properties properties;
        properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream("src/test/resources/config.properties")) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String email = properties.getProperty("emailApproval");
        String password = properties.getProperty("passwordApproval");

        WebElement dataInput = webDriver.findElement(By.cssSelector("[name='email']"));
        dataInput.click();
        dataInput.clear();
        dataInput.sendKeys(email);

        WebElement ClickFieldPassword = webDriver.findElement(By.cssSelector("[name='password']"));
        ClickFieldPassword.click();
        ClickFieldPassword.clear();
        ClickFieldPassword.sendKeys(password);
    }

    @And("User Click menu Job Order Approval")
    public void userClickMenuJobOrderApproval() throws InterruptedException {
        Actions actions = new Actions(webDriver);
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));

        WebElement clickMenuHamburger = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='hidden ml-24 lg:flex flex-1']//div[3]/li[@class='MuiButtonBase-root MuiListItem-root MuiListItem-gutters MuiListItem-padding MuiListItem-button fuse-list-item relative level-0 muiltr-569kmf']")));
        actions.moveToElement(clickMenuHamburger).click().perform();
        Thread.sleep(3000);


        WebElement clickMenuJobOrderApproval = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiButtonBase-root:nth-child(2) > .MuiListItemText-root")));
        clickMenuJobOrderApproval.click();
        Thread.sleep(2000);
    }

    @Then("User Clicks Action Row in Data Confirming Process")
    public void userClicksActionRowInDataConfirmingProcess() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
        WebElement rowAction = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiTableRow-root:nth-child(2) .MuiSvgIcon-root")));
        rowAction.click();
        WebElement viewEye = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(.,'View Request')]")));
        viewEye.click();
        Thread.sleep(2000);
    }

    @And("the user clicks the Reject button")
    public void theUserClicksTheRejectButton() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
        WebElement rejectButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(.,'Reject')]")));
        rejectButton.click();
    }

    @And("the user clicks the Approval button")
    public void theUserClicksTheApprovalButton() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
        WebElement approvalButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(.,'Approve')]")));
        approvalButton.click();
    }

    @And("the user clicks the Revised button")
    public void theUserClicksTheRevisedButton() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
        WebElement revisedButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(.,'Revised')]")));
        revisedButton.click();
    }
}
