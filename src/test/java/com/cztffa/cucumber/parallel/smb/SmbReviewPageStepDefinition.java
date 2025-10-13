package com.cztffa.cucumber.parallel.smb;

import com.cztffa.browseractions.BrowserActions;
import com.cztffa.dataproviders.DataCSVExtractor;
import com.cztffa.driver.SeleniumDriver;
import com.cztffa.page.review.SmbReviewPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertTrue;

@Slf4j

public class SmbReviewPageStepDefinition {


    private SeleniumDriver seleniumdriver;
    private BrowserActions browserActions;
    private SmbReviewPage smbReviewPage;



    public SmbReviewPageStepDefinition(SmbReviewPage smbReviewPage) {
        this.seleniumdriver = smbReviewPage.getSeleniumdriver();
        this.browserActions = smbReviewPage.browserActions;
        this.smbReviewPage=smbReviewPage;
    }
    @Then("^: I should accept the all business terms and conditions (\\d+)$")
    public void acceptAllTermsAndConditions(int numberOfDisclosure) throws Throwable {
         log.info("i am at terms and condition page");
        smbReviewPage.waitForSpinnerToDisappear();
        smbReviewPage.waitForVisibilityWithLoader("//*[contains(text(),'You are almost done')]");
//        Thread.sleep(2000);

//        Thread.sleep(4000);

//        browserActions.scrollToWebElement(seleniumdriver, smbReviewPage.getSmbReviewPageModel().termAndConditions);
//        Thread.sleep(2500);
        smbReviewPage.scrollToElementWithActionPause(seleniumdriver,smbReviewPage.getSmbReviewPageModel().termAndConditions);
        log.info("After Scrolling");
//        browserActions.clickUsingEnter(seleniumdriver.getWebDriver(), smbReviewPage.getSmbReviewPageModel().termAndConditions);
//        Thread.sleep(3000);
//        smbReviewPage.waitForVisibility(By.xpath("(//tf-checkbox[@t-model='Accepted__c']//input)"));
        browserActions.scrollToWebElement(seleniumdriver,smbReviewPage.getSmbReviewPageModel().termAndConditions);
        smbReviewPage.waitWithShortTime(seleniumdriver);
        browserActions.clickButton(seleniumdriver, smbReviewPage.getSmbReviewPageModel().termAndConditions);
        browserActions.scrollToWebElement(seleniumdriver, smbReviewPage.getSmbReviewPageModel().termAndConditions);
//        Thread.sleep(500);


        int index = 2;
        while(true) {
            try {
                log.info("Inside while");
                String termAndConditions = "(//tf-checkbox[@t-model='Accepted__c']//input)[" + index + "]";
                log.info(termAndConditions);
                WebElement checkbox;
                try {
                    checkbox = seleniumdriver.getWebDriver().findElement(By.xpath(termAndConditions));
                    log.info("Inside If");
                    browserActions.scrollToWebElement(seleniumdriver, checkbox);
//                    Thread.sleep(500);
                    smbReviewPage.waitWithShortTime(seleniumdriver);
//                    browserActions.clickUsingEnter(seleniumdriver.getWebDriver(), checkbox);
                    browserActions.clickButton(seleniumdriver,checkbox);//added

//                    Thread.sleep(500);
                    index++;
                } catch (Exception e) {
                    break;
                }
            } catch (NoSuchElementException e) {
                log.info("No more checkboxes found. Exiting loop.");
                break;
            }
        }

    }

    @And(": I click on review details submit button for smb")
    public void iClickOnReviewDetailsSubmitButtonForSmb() throws InterruptedException {
        log.info("Before clicking on submit button");

        browserActions.scrollToWebElement(seleniumdriver, smbReviewPage.getSmbReviewPageModel().submitButton);
//        Thread.sleep(700);
//        smbReviewPage.waitUntilVisibleAndClickable(seleniumdriver.getWebDriver(),smbReviewPage.getSmbReviewPageModel().submitButton);
        browserActions.clickUsingEnter(seleniumdriver.getWebDriver(), smbReviewPage.getSmbReviewPageModel().submitButton);
        log.info("After clicking on submit button");
        Thread.sleep(12000);

    }
    @Then(": I should see the reference Id page for final submission of smb")
    public void iShouldSeeTheReferenceIdPageForFinalSubmissionOfSmb() throws InterruptedException {

        log.info("On Reference Id page");
//        smbReviewPage.waitForSpinnerToDisappear();
//        Thread.sleep(11000);
//        smbReviewPage.waitForVisibilityWithLoader("//*[contains(text(),'Submission')]");

        DataCSVExtractor.smbapplicationCount++;
//        DataCSVExtractor.applicantCount++;


        assertTrue(smbReviewPage.getSmbReviewPageModel().successMsg.isDisplayed());
        log.info("Successful executed the whole flow ");
    }
}
