package com.cztffa.cucumber.parallel.smb;

import com.cztffa.browseractions.BrowserActions;
import com.cztffa.dataproviders.DataCSVExtractor;
import com.cztffa.driver.SeleniumDriver;

// to take xpath from product object
import com.cztffa.objects.Product;

// to take xpath from Excel Sheet
//import com.cztffa.xpath.business.Product;

import com.cztffa.page.review.SmbReviewPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Slf4j

public class SmbProductSelectorStepDefinition {

    private SeleniumDriver seleniumdriver;
    private BrowserActions browserActions;
    private SmbReviewPage smbReviewPage;

    public SmbProductSelectorStepDefinition(SmbReviewPage smbReviewPage) {
        this.seleniumdriver = smbReviewPage.getSeleniumdriver();
        this.browserActions = smbReviewPage.browserActions;
        this.smbReviewPage=smbReviewPage;
    }



@Then(": I click on smb products")
public void iClickOnSmbProducts() throws InterruptedException {
    smbReviewPage.waitForSpinnerToDisappear();

    log.info("Before click of product:");
    String product = DataCSVExtractor.smbproductDataStore.get(DataCSVExtractor.smbproductCount).get("product").toString();
    log.info("Product name: " + product);

    int productDataStoreSize = DataCSVExtractor.smbproductDataStore.size();
    By productLocator = By.xpath(Product.getByName(product).getXpath());

    smbReviewPage.waitWithSpinner(productLocator);

    WebElement element = browserActions.findElement(seleniumdriver, productLocator);
    browserActions.scrollToWebElement(seleniumdriver, element);
    smbReviewPage.wait(element);

    browserActions.clickUsingEnter(seleniumdriver.getWebDriver(), element);
    log.info("Clicked on product: " + product);

    for (int i = 0; i < productDataStoreSize - 1; i++) {

        if ((DataCSVExtractor.smbproductCount + 1) == productDataStoreSize) break;

        String currSubmissionId = DataCSVExtractor.smbproductDataStore.get(DataCSVExtractor.smbproductCount).get("submissionId").toString();
        String nextSubmissionId = DataCSVExtractor.smbproductDataStore.get(DataCSVExtractor.smbproductCount + 1).get("submissionId").toString();

        if (!currSubmissionId.equals(nextSubmissionId)) break;

        DataCSVExtractor.smbproductCount++;
        String productNew = DataCSVExtractor.smbproductDataStore.get(DataCSVExtractor.smbproductCount).get("product").toString();
        log.info("Clicking on product: " + productNew);

        By productLocatorNew = By.xpath(Product.getByName(productNew).getXpath());

        smbReviewPage.wait(productLocatorNew);
        WebElement elementNew = browserActions.findElement(seleniumdriver, productLocatorNew);
        browserActions.scrollToWebElement(seleniumdriver, elementNew);
        smbReviewPage.wait(elementNew);

        browserActions.clickUsingEnter(seleniumdriver.getWebDriver(), elementNew);
    }
log.info("Clicked on all products");
//    Thread.sleep(1000);
}
    @And(": I click on the checkout for smb")
    public void iClickOnTheCheckoutForSmb() throws InterruptedException {
        smbReviewPage.waitForSpinnerToDisappear();

        log.info("On click of checkout btn");

        smbReviewPage.waitWithSpinner(smbReviewPage.getSmbProductSelectorPageModel().checkOutBtn);
        browserActions.clickButton(seleniumdriver, smbReviewPage.getSmbProductSelectorPageModel().checkOutBtn);

        log.info("After click of checkout btn");


              smbReviewPage.waitForSpinnerToDisappear();
        smbReviewPage.waitWithSpinner(smbReviewPage.getSmbProductSelectorPageModel().proceedBtn);
        browserActions.clickButton(seleniumdriver, smbReviewPage.getSmbProductSelectorPageModel().proceedBtn);
//        Thread.sleep(1000);
        log.info("After click of proceed btn");
    }



@Then(": I click on proceed without prefill for smb")
public void iClickOnProceedWithoutPrefillForSmb() {
    log.info("Before clicking on proceed without prefill button");

    smbReviewPage.waitForSpinnerToDisappear();

    WebElement proceedBtn = smbReviewPage.getSmbProductSelectorPageModel().proceedWithoutPrefillBtn;

    WebDriverWait wait = new WebDriverWait(seleniumdriver.getWebDriver(), Duration.ofSeconds(20));
    wait.until(ExpectedConditions.visibilityOf(proceedBtn));
    wait.until(ExpectedConditions.elementToBeClickable(proceedBtn));

    log.info("Waited till proceedWithoutPrefillBtn");

    browserActions.scrollToWebElement(seleniumdriver, proceedBtn);
    smbReviewPage.wait(proceedBtn);

    browserActions.clickUsingEnter(seleniumdriver.getWebDriver(), proceedBtn);

    log.info("After clicking on proceed without prefill button");
}

}
