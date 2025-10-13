package com.cztffa.cucumber.parallel.smb;

import com.cztffa.browseractions.BrowserActions;
import com.cztffa.dataproviders.DataCSVExtractor;
import com.cztffa.driver.SeleniumDriver;
import com.cztffa.objects.Person;
import com.cztffa.objects.StepData;
import com.cztffa.objects.Validation;
import com.cztffa.page.review.SmbReviewPage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;

import java.util.Map;

import static org.junit.Assert.assertTrue;

@Slf4j

public class SmbPersonalPageStepDefinition {
    private SeleniumDriver seleniumdriver;
    private BrowserActions browserActions;
    private StepData stepData;
    private SmbReviewPage smbReviewPage;




    public SmbPersonalPageStepDefinition(StepData stepData, SmbReviewPage smbReviewPage) {
        this.stepData = stepData;
        this.seleniumdriver = smbReviewPage.getSeleniumdriver();
        this.browserActions = smbReviewPage.browserActions;
        this.smbReviewPage=smbReviewPage;
    }
//    @When(": I provide the following details for smb")
//    public void iProvideTheFollowingDetailsForSmb() throws InterruptedException, JsonProcessingException {
//        log.info("before filling the details");
//        Map<String,String> table = (Map<String, String>) DataCSVExtractor.applicantDataStore.get(DataCSVExtractor.applicantCount);
//        Thread.sleep(4000);
//        org.json.JSONObject jsonObject = new JSONObject(table);
//        ObjectMapper objectMapper = new ObjectMapper();
//        log.info("Entering Detail");
//        Person person = objectMapper.readValue(jsonObject.toString(), Person.class); //changes
//        log.info("Details entered "+person);
//        person.setValidation(stepData.getValidation());
//
//        smbReviewPage.fillDetailsForSMB(person);
//    }

    @When(": I provide the following details for smb")
    public void iProvideTheFollowingDetailsForSmb() throws InterruptedException, JsonProcessingException {
        log.info("Before filling the details");

        smbReviewPage.waitForSpinnerToDisappear();

        Map<String, String> table = (Map<String, String>) DataCSVExtractor.businessPersonDataStore.get(DataCSVExtractor.businessPersonCount);
        JSONObject jsonObject = new JSONObject(table);
        ObjectMapper objectMapper = new ObjectMapper();

        log.info("Entering Detail");
        Person person = objectMapper.readValue(jsonObject.toString(), Person.class);
        log.info("Details entered " + person);

        person.setValidation(stepData.getValidation());

        smbReviewPage.fillDetailsForSMB(person);
    }
//    @And(": click on start Application for smb")
//    public void clickOnStartApplicationForSmb() throws InterruptedException {
//        log.info("after start button  click");
//        smbReviewPage.waitForSpinnerToDisappear();
//
//        smbReviewPage.wait(smbReviewPage.getBusinessInfoPageModel().startApplicationButton);
//        browserActions.scrollToWebElement(seleniumdriver, smbReviewPage.getBusinessInfoPageModel().startApplicationButton);
////        Thread.sleep(10000);
//
//        browserActions.clickUsingEnter(seleniumdriver.getWebDriver(), smbReviewPage.getBusinessInfoPageModel().startApplicationButton);
//        log.info("after start button  click");
////		Thread.sleep(6000);
//    }

    @When("^: I provide the below business personal details$")
    public void businesspersonalDetails() throws Throwable {


        smbReviewPage.waitForSpinnerToDisappear();

        log.info("before filling the details");
        Map<String,String> table = (Map<String, String>) DataCSVExtractor.businessPersonDataStore.get(DataCSVExtractor.businessPersonCount);

        smbReviewPage.waitForSpinnerToDisappear();
        JSONObject jsonObject = new JSONObject(table);
        ObjectMapper objectMapper = new ObjectMapper();
        log.info("Entering Detail");
        Person person = objectMapper.readValue(jsonObject.toString(), Person.class); //changes
        log.info("Details entered "+person);

        smbReviewPage.waitForSpinnerToDisappear();
        person.setValidation(stepData.getValidation());

        smbReviewPage.addApplicantForSMB(person,0);

    }
    @And(": I provide the below additional applicant details for smb")
    public void iProvideTheBelowAdditionalApplicantDetailsForSmb() throws InterruptedException, JsonProcessingException {

        System.out.println(DataCSVExtractor.businessPersonDataStore.get(DataCSVExtractor.businessPersonCount+1).get("submissionId"));
        log.info("getting submissionId");
          log.info((String) DataCSVExtractor.businessPersonDataStore.get(DataCSVExtractor.businessPersonCount+1).get("submissionId"));

        int businessDataStoreSize =  DataCSVExtractor.businessPersonDataStore.size();
        log.info("Business Data size = "+ businessDataStoreSize);
        while(DataCSVExtractor.businessPersonDataStore.get(DataCSVExtractor.businessPersonCount+1).get("submissionId").equals(DataCSVExtractor.businessPersonDataStore.get(DataCSVExtractor.businessPersonCount).get("submissionId")))
        {
//            Thread.sleep(2000);
            browserActions.scrollToWebElement(seleniumdriver,smbReviewPage.getSmbPersonalInfoPageModel().addAdditionalApplicantButton);
            Thread.sleep(1000);
            smbReviewPage.waitWithSpinner(smbReviewPage.getSmbPersonalInfoPageModel().addAdditionalApplicantButton);
            browserActions.clickButton(seleniumdriver, smbReviewPage.getSmbPersonalInfoPageModel().addAdditionalApplicantButton);
//            Thread.sleep(5000);
            smbReviewPage.waitForSpinnerToDisappear();


            String pageSource = seleniumdriver.getWebDriver().getPageSource();
            String textToCheck = "Proceed without prefill";
            if (pageSource.contains(textToCheck)) {
                browserActions.scrollToWebElement(seleniumdriver, smbReviewPage.getSmbPersonalInfoPageModel().proceedWithoutPrefillBtn);
//                Thread.sleep(1000);
                smbReviewPage.waitWithSpinner(smbReviewPage.getSmbPersonalInfoPageModel().proceedWithoutPrefillBtn);

                browserActions.clickButton(seleniumdriver, smbReviewPage.getSmbPersonalInfoPageModel().proceedWithoutPrefillBtn);
//                Thread.sleep(1000);
                smbReviewPage.waitForSpinnerToDisappear();
            }
            log.info("Moved after proceed with prefill");


            Map<String,String> table = (Map<String, String>) DataCSVExtractor.businessPersonDataStore.get(DataCSVExtractor.businessPersonCount+1);
            JSONObject jsonObject = new JSONObject(table);
            ObjectMapper objectMapper = new ObjectMapper();
            Person person = objectMapper.readValue(jsonObject.toString(), Person.class);
            Validation validation= new Validation();
            validation.setSkipPreferredContactDropdown(true);
            validation.setSkipEmploymentStatusDropdown(true);
            log.info("validation before setting "+validation);
            stepData.setValidation(validation);
            person.setValidation(stepData.getValidation());
            stepData.setPerson(person);
//            reviewPage.addApplicantsForSmb(person, DataCSVExtractor.businessPersonCount + 2,true);
//            smbPersonalInfoPage.addApplicantsForSmb(person,DataCSVExtractor.businessPersonCount+2,true);
            smbReviewPage.addApplicantsForSmb(person,DataCSVExtractor.businessPersonCount+2);

            DataCSVExtractor.businessPersonCount++;
            log.info("applicant count = " + DataCSVExtractor.businessPersonCount );
            if((DataCSVExtractor.businessPersonCount+1)==businessDataStoreSize){
                log.info("BusinessPersonCount="+DataCSVExtractor.businessPersonCount);
                log.info("Business Data store="+businessDataStoreSize);
                break;
            }

        }
    }

    @Then(": I click on personal details next button for smb")
    public void iClickOnPersonalDetailsNextButtonForSmb() throws InterruptedException {
//        Thread.sleep(5000);

        log.info("Clciking on personal Info Next button");
        smbReviewPage.waitForSpinnerToDisappear();
        smbReviewPage.waitWithSpinner(smbReviewPage.getSmbPersonalInfoPageModel().personalInfoNextButon);
        smbReviewPage.waitForSpinnerToDisappear();

        browserActions.scrollToWebElement(seleniumdriver,smbReviewPage.getSmbPersonalInfoPageModel().personalInfoNextButon);
//        Thread.sleep(1000);
//        smbReviewPage.waitForSpinnerToDisappear();
        smbReviewPage.waitWithSpinner(smbReviewPage.getSmbPersonalInfoPageModel().personalInfoNextButon);
        browserActions.clickApply(seleniumdriver.getWebDriver(), smbReviewPage.getSmbPersonalInfoPageModel().personalInfoNextButon);
//        smbReviewPage.waitForSpinnerToDisappear();
//        Thread.sleep(10000);

    }

//@Then(": I click on personal details next button for smb")
//public void iClickOnPersonalDetailsNextButtonForSmb() throws InterruptedException {
//    log.info("Clicking on personal Info Next button");
//    Thread.sleep(6000);
//    smbReviewPage.waitForSpinnerToDisappear();
////    Thread.sleep(3000);
//    WebDriver driver = seleniumdriver.getWebDriver();
//    WebElement nextButton = smbReviewPage.getSmbPersonalInfoPageModel().personalInfoNextButon;
//
//    smbReviewPage.clickNextButtonAndWaitForNextPage(driver, nextButton, "Business");
//    Thread.sleep(6000);
//}

    @And(": I should navigate to business details personal page")
    public void iShouldNavigateToBusinessDetailsPersonalPage() throws InterruptedException {
//        Thread.sleep(5000);
        smbReviewPage.waitForSpinnerToDisappear();
        log.info(" i am on business info page");
        assertTrue(seleniumdriver.getWebDriver().getPageSource().contains("Business"));
        log.info(" business info page validated");
    }

    @And(": I click on start Application for smb")
    public void iClickOnStartApplicationForSmb() {
        log.info("after start button  click");
        smbReviewPage.waitForSpinnerToDisappear();

        smbReviewPage.wait(smbReviewPage.getBusinessInfoPageModel().startApplicationButton);
        browserActions.scrollToWebElement(seleniumdriver, smbReviewPage.getBusinessInfoPageModel().startApplicationButton);
//        Thread.sleep(10000);

        browserActions.clickUsingEnter(seleniumdriver.getWebDriver(), smbReviewPage.getBusinessInfoPageModel().startApplicationButton);
        log.info("after start button  click");
//		Thread.sleep(6000);
    }
}
