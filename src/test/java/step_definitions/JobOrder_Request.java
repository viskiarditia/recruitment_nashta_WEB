package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static step_definitions.Hooks.webDriver;

public class JobOrder_Request {
    private final WebDriver webDriver;
    public JobOrder_Request() {
        super();
        this.webDriver = Hooks.webDriver;
        new Actions(webDriver);
        new WebDriverWait(webDriver, Duration.ofSeconds(10));
    }

    @And("User Click menu Job Order")
    public void userClickMenuJobOrder() throws InterruptedException {
        Actions actions = new Actions(webDriver);

        WebElement clickMenuHamburger = webDriver.findElement(By.xpath("//div[@class='hidden ml-24 lg:flex flex-1']//div[3]/li[@class='MuiButtonBase-root MuiListItem-root MuiListItem-gutters MuiListItem-padding MuiListItem-button fuse-list-item relative level-0 muiltr-569kmf']"));
        actions.moveToElement(clickMenuHamburger).click().perform();
        Thread.sleep(3000);

//        JavascriptExecutor js = (JavascriptExecutor) webDriver;
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement clickMenuJobOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".muiltr-1zy08t:nth-child(1) > .MuiListItemText-root")));
        clickMenuJobOrder.click();
        Thread.sleep(2000);
    }

    @Then("User Add New Data Job Order Request")
    public void userAddNewDataJobOrderRequest() throws InterruptedException {
        WebElement AddNewData = webDriver.findElement(By.xpath("//a[.='Add New']"));
        AddNewData.click();
        Thread.sleep(3000);
    }
}
