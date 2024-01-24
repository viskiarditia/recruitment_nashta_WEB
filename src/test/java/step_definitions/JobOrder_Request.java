package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static step_definitions.Hooks.webDriver;

public class JobOrder_Request {
    @Given("User already open website Recruitment NasTa Group")
    public void userAlreadyOpenWebstieRecuitmentNasTaGroup() {
    }

    @When("User already logged in")
    public void userAlreadyLoggedIn() {
    }

    @And("User Click menu Job Order")
    public void userClickMenuJobOrder() throws InterruptedException {
        WebElement JobOrder = webDriver.findElement(By.xpath("//div[@class='hidden ml-24 lg:flex flex-1']//div[3]//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary text-13 truncate muiltr-uzix25']"));
        JobOrder.click();
        Thread.sleep(3000);
    }

    @Then("User Add New Data Job Order Request")
    public void userAddNewDataJobOrderRequest() {
    }

    @When("User Click General Information Field")
    public void userClickGeneralInformationField() throws InterruptedException {
        WebElement General_info = webDriver.findElement(By.xpath("//div[@class='undefined file-details p-24']//div[@class='MuiButtonBase-root MuiAccordionSummary-root MuiAccordionSummary-gutters muiltr-1iji0d4']/div[.='General Information *Please complete the following data']"));
        General_info.click();
        Thread.sleep(3000);
    }

    @When("User Click Scale Of Needs Field")
    public void userClickScaleOfNeedsField() throws InterruptedException {
        WebElement ScaleOfNeed = webDriver.findElement(By.xpath("//input[@id='combo-box-Scale of Needs']"));
        ScaleOfNeed.click();
        Thread.sleep(3000);
    }

    @When("User Click Job Required Field")
    public void userClickJobRequiredField() throws InterruptedException {
        WebElement ComboBox = webDriver.findElement(By.xpath("//input[@id='combo-box-Job Required']"));
        ComboBox.click();
        Thread.sleep(3000);
    }

    @When("User Click Departement Field")
    public void userClickDepartementField() throws InterruptedException {
        WebElement ComboBox = webDriver.findElement(By.xpath("//input[@id='combo-box-Department']"));
        ComboBox.click();
        Thread.sleep(3000);
    }

    @When("User Click Amount of Required Personnel Field")
    public void userClickAmountOfRequiredPersonnelField() throws InterruptedException {
        WebElement ComboBox = webDriver.findElement(By.xpath("//input[@name='total_needed']"));
        ComboBox.click();
        Thread.sleep(3000);
    }

    @When("User Click Date Needed Field")
    public void userClickDateNeededField() throws InterruptedException {
        WebElement ComboBox = webDriver.findElement(By.xpath("//input[@id='Date Needed-date']"));
        ComboBox.click();
        Thread.sleep(3000);
    }

    @When("User Click Company Field")
    public void userClickCompanyField() throws InterruptedException {
        WebElement ComboBox = webDriver.findElement(By.xpath("//input[@id='combo-box-Company']"));
        ComboBox.click();
        Thread.sleep(3000);
    }

    @When("User Click Assigment Location Field")
    public void userClickAssigmentLocationField() throws InterruptedException {
        WebElement ComboBox = webDriver.findElement(By.xpath("//input[@name='location']"));
        ComboBox.click();
        Thread.sleep(3000);
    }

    @When("User Click Assigment Location Field Age")
    public void userClickAssigmentLocationFieldAge() throws InterruptedException {
        WebElement ComboBox = webDriver.findElement(By.xpath("//input[@id='combo-box-Age']"));
        ComboBox.click();
        Thread.sleep(3000);
    }

    @When("User Click Assigment Location Field Selection Test")
    public void userClickAssigmentLocationFieldSelectionTest() throws InterruptedException {
        WebElement ComboBox = webDriver.findElement(By.xpath("//input[@id='combo-box-Age']"));
        ComboBox.click();
        Thread.sleep(3000);
    }

    @When("User Click Assigment Location Field Project Type Field")
    public void userClickAssigmentLocationFieldProjectTypeField() throws InterruptedException {
        WebElement ComboBox = webDriver.findElement(By.xpath("//input[@id='combo-box-Project Type']"));
        ComboBox.click();
        Thread.sleep(3000);
    }

    @When("User Click Dropdown Field Project Type Field")
    public void userClickDropdownFieldProjectTypeField() throws InterruptedException {
        WebElement ComboBox = webDriver.findElement(By.xpath("//input[@id='combo-box-Project Type']"));
        ComboBox.click();
        Thread.sleep(3000);
    }

    @Then("User Choise Project")
    public void userChoiseProject() {
    }

    @Then("User Choise Non Project")
    public void userChoiseNonProject() {
    }

    @When("User Click Assigment Location Field Employe Status")
    public void userClickAssigmentLocationFieldEmployeStatus() throws InterruptedException {
        WebElement ComboBox = webDriver.findElement(By.xpath("//input[@id='combo-box-Employee Status']"));
        ComboBox.click();
        Thread.sleep(3000);
    }

    @When("User Click Assigment Location Field Position Level")
    public void userClickAssigmentLocationFieldPositionLevel() throws InterruptedException {
        WebElement ComboBox = webDriver.findElement(By.xpath("//input[@id='combo-box-Position Level']"));
        ComboBox.click();
        Thread.sleep(3000);
    }

    @When("User Click Assigment Location Field Gender")
    public void userClickAssigmentLocationFieldGender() throws InterruptedException {
        WebElement ComboBox = webDriver.findElement(By.xpath("//input[@id='combo-box-Gender']"));
        ComboBox.click();
        Thread.sleep(3000);
    }

    @When("User Click Assigment Location Field Education")
    public void userClickAssigmentLocationFieldEducation() throws InterruptedException {
        WebElement ComboBox = webDriver.findElement(By.xpath("//input[@id='combo-box-Education Level']"));
        ComboBox.click();
        Thread.sleep(3000);
    }

    @When("User Click Assigment Location Field Others  Age")
    public void userClickAssigmentLocationFieldOthersAge() throws InterruptedException {
        WebElement ComboBox = webDriver.findElement(By.xpath("//input[@id='combo-box-Age']"));
        ComboBox.click();
        Thread.sleep(3000);
    }

    @When("User Click Assigment Location Field Work Experience")
    public void userClickAssigmentLocationFieldWorkExperience() throws InterruptedException {
        WebElement ComboBox = webDriver.findElement(By.xpath("//input[@id='combo-box-Work Experience']"));
        ComboBox.click();
        Thread.sleep(3000);
    }

    @When("User Click Assigment Location Field Min Expected Salary")
    public void userClickAssigmentLocationFieldMinExpectedSalary() throws InterruptedException {
        WebElement ComboBox = webDriver.findElement(By.xpath("//input[@name='estimated_salary']"));
        ComboBox.click();
        Thread.sleep(3000);
    }

    @When("User Click Assigment Location Field End Date")
    public void userClickAssigmentLocationFieldEndDate() throws InterruptedException {
        WebElement ComboBox = webDriver.findElement(By.xpath("//input[@name='estimated_salary_max']"));
        ComboBox.click();
        Thread.sleep(3000);
    }

    @When("User Click Assigment Location Field Max Expected Salary")
    public void userClickAssigmentLocationFieldMaxExpectedSalary() throws InterruptedException {
        WebElement ComboBox = webDriver.findElement(By.xpath("//input[@name='estimated_salary_max']"));
        ComboBox.click();
        Thread.sleep(3000);
    }

    @When("User Click Assigment Location Field Fulfillment Source")
    public void userClickAssigmentLocationFieldFulfillmentSource() {
    }

    @When("User Click Assigment Location Field Others")
    public void userClickAssigmentLocationFieldOthers() {
    }

    @When("User Click Assigment Location Field Description")
    public void userClickAssigmentLocationFieldDescription() {
    }

    @When("User Click Assigment Location Field Notes")
    public void userClickAssigmentLocationFieldNotes() {
    }

    @When("User Click Assigment Location Field Type Skill \\/ Certification")
    public void userClickAssigmentLocationFieldTypeSkillCertification() {
    }

    @When("User Click Assigment Location Field Type Name Skill \\/ Certification")
    public void userClickAssigmentLocationFieldTypeNameSkillCertification() {
    }

    @When("User Click Assigment Location Field Skala Level")
    public void userClickAssigmentLocationFieldSkalaLevel() {
    }

    @When("User Input All Field Form")
    public void userInputAllFieldForm() {
    }

    @When("User Input All Field Form without Scale Of Needs Field")
    public void userInputAllFieldFormWithoutScaleOfNeedsField() {
    }

    @When("User Click Assigment Location Field Start Date")
    public void userClickAssigmentLocationFieldStartDate() {
    }

    @Then("the user fills in each required field")
    public void theUserFillsInEachRequiredField() {
    }

    @Then("the user fills in each required field without Scales of Needs")
    public void theUserFillsInEachRequiredFieldWithoutScalesOfNeeds() {
    }

    @Then("User Click button Column Actions")
    public void userClickButtonColumnActions() {
    }

    @And("Choise Sort by Status Ascending")
    public void choiseSortByStatusAscending() {
    }

    @And("Choise Sort by Status Descending")
    public void choiseSortByStatusDescending() {
    }

    @And("Choise Sort by Clear Sort")
    public void choiseSortByClearSort() {
    }

    @And("Choise Clear Filter")
    public void choiseClearFilter() {
    }

    @And("Choise Filter by Status")
    public void choiseFilterByStatus() {
    }

    @Then("User Click button Row Actions in data that in process")
    public void userClickButtonRowActionsInDataThatInProcess() {
    }

    @And("Choise Status Approval")
    public void choiseStatusApproval() {
    }

    @And("Choise Delete")
    public void choiseDelete() {
    }

    @Then("User Scrolll to the bottom Click button Row per Page")
    public void userScrolllToTheBottomClickButtonRowPerPage() {
    }

    @And("Choise number {string}")
    public void choiseNumber(String arg0) {
    }
}
