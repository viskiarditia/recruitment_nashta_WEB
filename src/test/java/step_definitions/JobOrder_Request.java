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

import java.time.Duration;


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

        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement clickMenuJobOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".muiltr-1zy08t:nth-child(1) > .MuiListItemText-root")));
        clickMenuJobOrder.click();
        Thread.sleep(2000);
    }

    @Then("User Add New Data Job Order Request")
    public void userAddNewDataJobOrderRequest() throws InterruptedException {
        WebElement AddNewData = webDriver.findElement(By.xpath("//a[.='Add New']"));
        AddNewData.click();
        Thread.sleep(2000);
    }

    @When("User Click every field in General Information")
    public void userClickEveryFieldInGeneralInformation() throws InterruptedException {
        WebElement generalInformation = webDriver.findElement(By.xpath(".//div[@class='undefined file-details p-24']//div[@class='MuiButtonBase-root MuiAccordionSummary-root MuiAccordionSummary-gutters muiltr-1iji0d4']/div[.='General Information *Please complete the following data']"));
        generalInformation.click();
        Thread.sleep(2000);
        WebElement scaleOfNeeds = webDriver.findElement(By.xpath("//input[@id='combo-box-Scale of Needs']"));
        scaleOfNeeds.click();
        WebElement company = webDriver.findElement(By.xpath("//input[@id='combo-box-Company']"));
        company.click();
        WebElement jobRequired = webDriver.findElement(By.xpath("//input[@id='combo-box-Job Required']"));
        jobRequired.click();
        WebElement departement = webDriver.findElement(By.xpath("//input[@id='combo-box-Department']"));
        departement.click();
        WebElement location = webDriver.findElement(By.xpath("//input[@name='location']"));
        location.click();
        WebElement totalNeeded = webDriver.findElement(By.xpath("//input[@name='total_needed']"));
        totalNeeded.click();
        WebElement neededDate = webDriver.findElement(By.xpath("//input[@id='Date Needed-date']"));
        neededDate.click();
        Thread.sleep(1000);
    }

    private void inputTestDataGeneralInformation(String xpath, String data) {
        WebElement element = webDriver.findElement(By.xpath(xpath));

        // Tunggu hingga elemen menjadi interaktif (maksimum 10 detik)
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));

        element.click();
        element.sendKeys(data);
    }
    @Then("Input any Test in every Field General Information {string}")
    public void inputAnyTestInEveryFieldGeneralInformation(String data) throws InterruptedException {

        inputTestDataGeneralInformation("//input[@id='combo-box-Scale of Needs']", data);
        inputTestDataGeneralInformation("//input[@id='combo-box-Company']", data);
        inputTestDataGeneralInformation("//input[@id='combo-box-Job Required']", data);
        inputTestDataGeneralInformation("//input[@id='combo-box-Department']", data);
        inputTestDataGeneralInformation("//input[@name='location']", data);
        inputTestDataGeneralInformation("//input[@name='total_needed']", data);
        inputTestDataGeneralInformation("//input[@id='Date Needed-date']", data);
        Thread.sleep(1000);

    }

    @When("User Click every field in Reason of Request")
    public void userClickEveryFieldInReasonOfRequest() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));

        WebElement reasonOfRequest = webDriver.findElement(By.xpath("//p[.='Reason for Request *Please complete the following data']"));
        reasonOfRequest.click();
        Thread.sleep(2000);
        WebElement procurmentReason = webDriver.findElement(By.xpath("//input[@name='reason_desc']"));
        procurmentReason.click();
        WebElement projectType = webDriver.findElement(By.xpath("//input[@id='combo-box-Project Type']"));
        projectType.click();

        WebElement dropDownOption = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("combo-box-Project Type-option-0")));
        dropDownOption.click();

        WebElement employeeStatus = webDriver.findElement(By.xpath("//input[@id='combo-box-Employee Status']"));
        employeeStatus.click();
        WebElement positionLevel = webDriver.findElement(By.xpath("//input[@id='combo-box-Position Level']"));
        positionLevel.click();
        WebElement age = webDriver.findElement(By.xpath("//input[@id='combo-box-Age']"));
        age.click();
        WebElement otherAge = webDriver.findElement(By.xpath("//input[@name='age_remarks']"));
        otherAge.click();
        WebElement fullfillmentSource = webDriver.findElement(By.xpath("//input[@id='combo-box-Fulfillment Source']"));
        fullfillmentSource.click();

        WebElement selectionTest = webDriver.findElement(By.xpath("//input[@id='combo-box-Selection Test']"));
        selectionTest.click();
        WebElement dropDownOption1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("combo-box-Selection Test-option-0")));
        dropDownOption1.click();
        selectionTest.click();

        WebElement boxGender = webDriver.findElement(By.xpath("//input[@id='combo-box-Gender']"));
        boxGender.click();
        WebElement educationLevel = webDriver.findElement(By.xpath("//input[@id='combo-box-Education Level']"));
        educationLevel.click();
        WebElement workExperience = webDriver.findElement(By.xpath("//input[@id='combo-box-Work Experience']"));
        workExperience.click();
        WebElement estimated_salary = webDriver.findElement(By.xpath("//input[@name='estimated_salary']"));
        estimated_salary.click();
        WebElement estimatedSalaryMax = webDriver.findElement(By.xpath("//input[@name='estimated_salary_max']"));
        estimatedSalaryMax.click();

        Thread.sleep(1000);

    }

    private void inputTestDataReason(String xpath, String data) {
        WebElement element = webDriver.findElement(By.xpath(xpath));

        // Tunggu hingga elemen menjadi interaktif (maksimum 10 detik)
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));

        element.click();
        element.sendKeys(data);
    }

    @Then("Input any Test in every Field Reason of Request {string}")
    public void inputAnyTestInEveryFieldReasonOfRequest(String data) {
        inputTestDataReason("//input[@name='reason_desc']", data);
        inputTestDataReason("//input[@id='combo-box-Project Type']", data);
        inputTestDataReason("//input[@id='combo-box-Employee Status']", data);
        inputTestDataReason("//input[@id='combo-box-Position Level']", data);
        inputTestDataReason("//input[@id='combo-box-Age']", data);
        inputTestDataReason("//input[@name='age_remarks']", data);
        inputTestDataReason("//input[@id='combo-box-Fulfillment Source']", data);
        inputTestDataReason("//input[@id='combo-box-Selection Test']", data);
        inputTestDataReason("//input[@id='combo-box-Gender']", data);
        inputTestDataReason("//input[@id='combo-box-Education Level']", data);
        inputTestDataReason("//input[@id='combo-box-Work Experience']", data);
        inputTestDataReason("//input[@name='estimated_salary']", data);
        inputTestDataReason("//input[@name='estimated_salary_max']", data);
    }
}
