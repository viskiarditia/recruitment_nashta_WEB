package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));

        WebElement clickMenuHamburger = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='hidden ml-24 lg:flex flex-1']//div[3]/li[@class='MuiButtonBase-root MuiListItem-root MuiListItem-gutters MuiListItem-padding MuiListItem-button fuse-list-item relative level-0 muiltr-569kmf']")));
        actions.moveToElement(clickMenuHamburger).click().perform();
        Thread.sleep(3000);


        WebElement clickMenuJobOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".muiltr-1zy08t:nth-child(1) > .MuiListItemText-root")));
        clickMenuJobOrder.click();
        Thread.sleep(2000);
    }

    @Then("User Add New Data Job Order Request")
    public void userAddNewDataJobOrderRequest() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement AddNewData = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='Add New']")));
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


    private void inputTestDataSkillCertification(String xpath, String data) {
        WebElement element = webDriver.findElement(By.xpath(xpath));

        // Tunggu hingga elemen menjadi interaktif (maksimum 10 detik)
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));

        element.click();
        element.sendKeys(data);
    }

    @When("User Click every field in Skill Certification")
    public void userClickEveryFieldInSkillCertification() throws InterruptedException {
        WebElement skillCertification= webDriver.findElement(By.xpath("//p[.='Skill/Certification *Please complete the following data']"));
        skillCertification.click();
        Thread.sleep(2000);

        WebElement typeSkillCertification= webDriver.findElement(By.xpath("//input[@id='combo-box-Type Skill/Certification']"));
        typeSkillCertification.click();
        WebElement nameSkillCertification= webDriver.findElement(By.xpath("//div[@class='grid grid-cols-1 gap-14 md:grid-cols-12 items-center']//input[@class='MuiInputBase-input MuiOutlinedInput-input muiltr-zwrapf']"));
        nameSkillCertification.click();
        WebElement skalaLevel= webDriver.findElement(By.xpath("//input[@id='combo-box-Skala Level']"));
        skalaLevel.click();
    }

    @Then("Input any Test in every Field Skill Certification {string}")
    public void inputAnyTestInEveryFieldSkillCertification(String data) {
        inputTestDataSkillCertification("//input[@id='combo-box-Type Skill/Certification']", data);
        inputTestDataSkillCertification("//div[@class='grid grid-cols-1 gap-14 md:grid-cols-12 items-center']//input[@class='MuiInputBase-input MuiOutlinedInput-input muiltr-zwrapf']", data);
        inputTestDataSkillCertification("//input[@id='combo-box-Skala Level']", data);
    }

    @When("User Input All Field Form")
    public void userInputAllFieldForm() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));

        //general information
        WebElement generalInformation = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//div[@class='undefined file-details p-24']//div[@class='MuiButtonBase-root MuiAccordionSummary-root MuiAccordionSummary-gutters muiltr-1iji0d4']/div[.='General Information *Please complete the following data']")));
        generalInformation.click();
        Thread.sleep(2000);

        WebElement scaleOfNeeds = webDriver.findElement(By.xpath("//input[@id='combo-box-Scale of Needs']"));
        scaleOfNeeds.click();
        WebElement dropDownOption1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("combo-box-Scale of Needs-option-1")));
        dropDownOption1.click();
        scaleOfNeeds.click();

        WebElement company = webDriver.findElement(By.xpath("//input[@id='combo-box-Company']"));
        company.click();
        WebElement dropDownOption2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@id='combo-box-Company-option-1']")));
        dropDownOption2.click();
        company.sendKeys(Keys.ENTER);

        WebElement jobRequired = webDriver.findElement(By.xpath("//input[@id='combo-box-Job Required']"));
        jobRequired.click();
        WebElement dropDownOption3 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@id='combo-box-Job Required-option-54']")));
        dropDownOption3.click();
        jobRequired.sendKeys(Keys.ENTER);

        WebElement department = webDriver.findElement(By.xpath("//input[@id='combo-box-Department']"));
        department.click();
        WebElement dropDownOption4 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@id='combo-box-Department-option-5']")));
        dropDownOption4.click();
        department.sendKeys(Keys.ENTER);

        WebElement location = webDriver.findElement(By.xpath("//input[@name='location']"));
        location.click();
        location.sendKeys("bogor");
        location.sendKeys(Keys.ENTER);

        WebElement totalNeeded = webDriver.findElement(By.xpath("//input[@name='total_needed']"));
        totalNeeded.click();
        totalNeeded.clear();
        totalNeeded.sendKeys("1");

        WebElement datePicker = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium muiltr-1r7lzhg']")));
        datePicker.click();
        // Pilih tahun pada date picker
        WebElement yearDropdown = datePicker.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall MuiPickersCalendarHeader-switchViewButton muiltr-1aoxnv6']"));
        yearDropdown.click();
        WebElement yearDropdown1 = datePicker.findElement(By.xpath("//button[@class='PrivatePickersYear-yearButton Mui-selected muiltr-ow191y']"));
        yearDropdown1.click();
        WebElement monthDropdown = datePicker.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeStart MuiIconButton-sizeSmall MuiPickersArrowSwitcher-button muiltr-hr1ny1']"));
        monthDropdown.click();
        WebElement dayButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[.='2']")));
        dayButton.click();

        //reason of request
        WebElement reasonOfRequest = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[.='Reason for Request *Please complete the following data']")));
        reasonOfRequest.click();
        Thread.sleep(2000);

        WebElement procurmentReason = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='reason_desc']")));
        procurmentReason.click();
        procurmentReason.sendKeys("ahli");
        procurmentReason.sendKeys(Keys.ENTER);

        WebElement projectType = webDriver.findElement(By.xpath("//input[@id='combo-box-Project Type']"));
        projectType.click();
        WebElement dropDownOption5 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("combo-box-Project Type-option-0")));
        dropDownOption5.click();

        WebElement employeeStatus = webDriver.findElement(By.xpath("//input[@id='combo-box-Employee Status']"));
        employeeStatus.click();
        WebElement dropDownOption6 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("combo-box-Employee Status-option-0")));
        dropDownOption6.click();


        WebElement positionLevel = webDriver.findElement(By.xpath("//input[@id='combo-box-Position Level']"));
        positionLevel.click();
        WebElement dropDownOption7 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("combo-box-Position Level-option-4")));
        dropDownOption7.click();

        WebElement age = webDriver.findElement(By.xpath("//input[@id='combo-box-Age']"));
        age.click();
        WebElement dropDownOption8 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("combo-box-Age-option-1")));
        dropDownOption8.click();

        WebElement otherAge = webDriver.findElement(By.xpath("//input[@name='age_remarks']"));
        otherAge.click();

        WebElement fullfillmentSource = webDriver.findElement(By.xpath("//input[@id='combo-box-Fulfillment Source']"));
        fullfillmentSource.click();
        WebElement dropDownOption9 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("combo-box-Fulfillment Source-option-0")));
        dropDownOption9.click();

        WebElement selectionTest = webDriver.findElement(By.xpath("//input[@id='combo-box-Selection Test']"));
        selectionTest.click();
        WebElement dropDownOption10 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("combo-box-Selection Test-option-0")));
        dropDownOption10.click();
        selectionTest.click();

        WebElement boxGender = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='combo-box-Gender']")));
        boxGender.click();
        WebElement dropDownOption11 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("combo-box-Gender-option-0")));
        dropDownOption11.click();
        boxGender.click();

        WebElement educationalLevel = webDriver.findElement(By.xpath("//input[@id='combo-box-Education Level']"));
        educationalLevel.click();
        WebElement dropDownOption12 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("combo-box-Education Level-option-2")));
        dropDownOption12.click();

        WebElement workExperience = webDriver.findElement(By.xpath("//input[@id='combo-box-Work Experience']"));
        workExperience.click();
        WebElement dropDownOption13 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("combo-box-Work Experience-option-2")));
        dropDownOption13.click();

        WebElement estimated_salary = webDriver.findElement(By.xpath("//input[@name='estimated_salary']"));
        estimated_salary.click();
        estimated_salary.sendKeys(Keys.END);
        estimated_salary.clear();
        estimated_salary.sendKeys("7000000");

        WebElement estimatedSalaryMax = webDriver.findElement(By.xpath("//input[@name='estimated_salary_max']"));
        estimatedSalaryMax.click();
        estimatedSalaryMax.sendKeys(Keys.END);
        estimatedSalaryMax.clear();
        estimatedSalaryMax.sendKeys("10000000");

        //Job Description
        WebElement jobDescription = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[.='Job Description *Please complete the following data']")));
        jobDescription.click();
        Thread.sleep(2000);

        WebElement titleJobDescription = webDriver.findElement(By.xpath("//div[@class='grid grid-cols-1 gap-14 ']//input[@class='MuiInputBase-input MuiOutlinedInput-input muiltr-zwrapf']"));
        titleJobDescription.click();
        titleJobDescription.sendKeys("Quality Assurance Engineer");

        WebElement notes = webDriver.findElement(By.xpath("//textarea[@name='job_desc_notes']"));
        notes.click();
        notes.sendKeys("What is Lorem Ipsum?\n" +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");


        //Skill/Certification
        WebElement skillcertification = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[.='Skill/Certification *Please complete the following data']")));
        skillcertification.click();
        Thread.sleep(2000);

        WebElement typeSkillCertification= webDriver.findElement(By.xpath("//input[@id='combo-box-Type Skill/Certification']"));
        typeSkillCertification.click();
        WebElement dropDownOption14 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("combo-box-Type Skill/Certification-option-0")));
        dropDownOption14.click();

        WebElement nameSkillCertification= webDriver.findElement(By.xpath("//div[@class='grid grid-cols-1 gap-14 md:grid-cols-12 items-center']//input[@class='MuiInputBase-input MuiOutlinedInput-input muiltr-zwrapf']"));
        nameSkillCertification.click();
        nameSkillCertification.sendKeys("Coursera");

        WebElement skalaLevel= webDriver.findElement(By.xpath("//input[@id='combo-box-Skala Level']"));
        skalaLevel.click();
        WebElement dropDownOption15 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("combo-box-Skala Level-option-1")));
        dropDownOption15.click();


        WebElement SUBMIT= webDriver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedRctBlue MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedRctBlue MuiButton-sizeMedium MuiButton-containedSizeMedium px-20 whitespace-nowrap px-28 ml-10 muiltr-isfyrj']"));
        SUBMIT.click();

        Thread.sleep(5000);
    }


}
