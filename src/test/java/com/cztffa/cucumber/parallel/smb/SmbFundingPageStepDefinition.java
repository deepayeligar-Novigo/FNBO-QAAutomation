package com.cztffa.cucumber.parallel.smb;

import com.cztffa.browseractions.BrowserActions;
import com.cztffa.dataproviders.DataCSVExtractor;
import com.cztffa.driver.SeleniumDriver;
import com.cztffa.objects.Funding;
import com.cztffa.page.review.SmbReviewPage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;

import java.util.Map;

import static org.junit.Assert.assertTrue;

@Slf4j

public class SmbFundingPageStepDefinition {
    private SeleniumDriver seleniumdriver;
    private BrowserActions browserActions;
    private SmbReviewPage smbReviewPage;


    public SmbFundingPageStepDefinition(SmbReviewPage smbReviewPage) {

        this.seleniumdriver = smbReviewPage.getSeleniumdriver();
        this.browserActions = smbReviewPage.browserActions;
        this.smbReviewPage=smbReviewPage;
    }
    @And("^: I should see the business funding page$")
    public void navigateToBusinessFundingPage() throws Throwable {
//        Thread.sleep(2000);
        smbReviewPage.letSpinnerDisappear();
        assertTrue(seleniumdriver.getWebDriver().getPageSource().contains("Business"));
    }
    @Then(": I provide below funding details for smb")
    public void iProvideBelowFundingDetailsForSmb() throws JsonProcessingException, InterruptedException {
        Map<String,String> table = (Map<String, String>) DataCSVExtractor.smbfundingDataStore.get(DataCSVExtractor.smbfundingCount);
        JSONObject jsonObject = new JSONObject(table);
        ObjectMapper objectMapper = new ObjectMapper();
        Funding funding = objectMapper.readValue(jsonObject.toString(), Funding.class);
        smbReviewPage.addFundDetailsForSMB(funding);
        DataCSVExtractor.smbfundingCount++;
    }

    @Then("^: I click on business funding page next button$")
    public void clickFundingPageNextButton() throws Throwable {
//        Thread.sleep(2000);
        smbReviewPage.waitForSpinnerToDisappear();
        browserActions.scrollToWebElement(seleniumdriver,smbReviewPage.getBusinessInfoPageModel().businessInfoNextButon);
//        Thread.sleep(2000);
        smbReviewPage.waitWithSpinner(smbReviewPage.getBusinessInfoPageModel().businessInfoNextButon);
        browserActions.clickUsingEnter(seleniumdriver.getWebDriver(), smbReviewPage.getBusinessInfoPageModel().businessInfoNextButon);
//        Thread.sleep(15000);
        smbReviewPage.waitForSpinnerToDisappear();

    }
}
