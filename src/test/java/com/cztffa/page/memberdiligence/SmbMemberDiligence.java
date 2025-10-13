package com.cztffa.page.memberdiligence;

import com.cztffa.page.personalinfo.SmbPersonalInfoPage;
import com.cztffa.util.ApplicantUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SmbMemberDiligence extends SmbPersonalInfoPage {
    public void completeDueDiligence() throws InterruptedException {

        waitForSpinnerToDisappear();
        log.info("entering number of locations");
//        Thread.sleep(9000);
        waitForSpinnerToDisappear();
        waitForVisibilityWithLoader("//*[contains(text(),'We need some additional information')]");
        browserActions.scrollToWebElement(getSeleniumdriver(), getMemberDiligencePageModel().tradeArea);
//        Thread.sleep(2000);

        waitWithSpinner(getMemberDiligencePageModel().tradeArea);
//        selectElement(getSeleniumdriver().getWebDriver(), getMemberDiligencePageModel().tradeArea);
        waitWithSpinner(getMemberDiligencePageModel().location);
        browserActions.scrollToWebElement(getSeleniumdriver(),getMemberDiligencePageModel().location);
        selectElement(getSeleniumdriver().getWebDriver(),getMemberDiligencePageModel().location);
        browserActions.enterTextNoTextClear(getSeleniumdriver(),
                getMemberDiligencePageModel().location,
                "1");
        assertTrue(true);


        log.info("selecting the trade scope");

        browserActions.scrollToWebElement(getSeleniumdriver(),getMemberDiligencePageModel().tradeArea);
//        Thread.sleep(1000);
        selectElement(getSeleniumdriver().getWebDriver(), getMemberDiligencePageModel().tradeArea);
        waitWithSpinner(getMemberDiligencePageModel().tradeArea);
        browserActions.clickButton(getSeleniumdriver(), getMemberDiligencePageModel().tradeArea);
        log.info("selecting local trader");

        selectElement(getSeleniumdriver().getWebDriver(),getMemberDiligencePageModel().tradeLocal);
        browserActions.clickApply(getSeleniumdriver().getWebDriver(),
                getMemberDiligencePageModel().tradeLocal);
        assertTrue(true);
        log.info("trading locally selected");

        waitForSpinnerToDisappear();




        WebDriver driver = getSeleniumdriver().getWebDriver();

        int totalDrops = driver.findElements(By.xpath("//tf-detail-header[.//span[text()='Related Person']]")).size();

        log.info("Total persons found: " + totalDrops);

        for (int index = 1; index <= totalDrops; index++) {
            try {

                List<WebElement> drops = driver.findElements(By.xpath("//tf-detail-header[.//span[text()='Related Person']]"));
                WebElement currentDrop = drops.get(index - 1);
                browserActions.scrollToWebElement(getSeleniumdriver(), currentDrop);
//                Thread.sleep(1000);
                waitWithSpinner(currentDrop);
                 selectElement(getSeleniumdriver().getWebDriver(),currentDrop);
                if (currentDrop.isDisplayed()) {
                    browserActions.clickApply(driver, currentDrop);
//                    Thread.sleep(2000);
//                    waitForVisibility("//*[contains(text(),'What is your employment status')]");
                    WebElement employmentStatusElement = currentDrop.findElement(By.xpath("(//tf-dropdown[@t-model='Employment_Status']//input)" + "[" + index + "]"));
                    browserActions.scrollToWebElement(getSeleniumdriver(),employmentStatusElement);
                    waitWithSpinner(employmentStatusElement);
                    selectElement(getSeleniumdriver().getWebDriver(),employmentStatusElement);

//                    Thread.sleep(500);
                    if (employmentStatusElement.isDisplayed()) {
                        browserActions.scrollToWebElement(getSeleniumdriver(),employmentStatusElement);
                        selectElement(getSeleniumdriver().getWebDriver(),employmentStatusElement);
                        browserActions.clickButton(getSeleniumdriver(), employmentStatusElement);
//                        Thread.sleep(500);

                        WebElement selfEmployedSelectedElement = currentDrop.findElement(By.xpath("//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Self Employed')]"));
                        if (selfEmployedSelectedElement.isDisplayed()) {
                            browserActions.scrollToWebElement(getSeleniumdriver(),selfEmployedSelectedElement);
                            selectElement(getSeleniumdriver().getWebDriver(),selfEmployedSelectedElement);
                            browserActions.clickApply(getSeleniumdriver().getWebDriver(), selfEmployedSelectedElement);

                        }

                        WebElement occupationNameElement = currentDrop.findElement(By.xpath("(//tf-input[@t-model='Occupation']//input)" + "[" + index + "]"));
                        if (occupationNameElement.isDisplayed()) {
                            browserActions.scrollToWebElement(getSeleniumdriver(),occupationNameElement);
                            selectElement(getSeleniumdriver().getWebDriver(),occupationNameElement);
                            browserActions.enterText(getSeleniumdriver(), occupationNameElement, "Farmer");
//                            Thread.sleep(500);
                        }
                    }

                    WebElement pepStatusElement = currentDrop.findElement(By.xpath("(//tf-dropdown[@t-model='PEP_Member_Type']//input)" + "[" + index + "]"));
                    if (pepStatusElement.isDisplayed()) {
                        browserActions.scrollToWebElement(getSeleniumdriver(),pepStatusElement);
                        selectElement(getSeleniumdriver().getWebDriver(),pepStatusElement);
                        browserActions.clickButton(getSeleniumdriver(), pepStatusElement);
//                        Thread.sleep(700);

                        WebElement noPEPSelectedElement = currentDrop.findElement(By.xpath("//div[@class='dropdown-item ng-star-inserted'][contains(text(),'No')]"));
                        if (noPEPSelectedElement.isDisplayed()) {
                            browserActions.scrollToWebElement(getSeleniumdriver(),noPEPSelectedElement);
                            selectElement(getSeleniumdriver().getWebDriver(),noPEPSelectedElement);
                            browserActions.clickApply(getSeleniumdriver().getWebDriver(), noPEPSelectedElement);
                        }
                    }
                }

            } catch (NoSuchElementException e) {
                log.warn("No element found or error at index " + index + ", skipping.");
            }
        }

    }

}
