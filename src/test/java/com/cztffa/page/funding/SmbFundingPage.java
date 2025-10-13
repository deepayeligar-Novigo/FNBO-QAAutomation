package com.cztffa.page.funding;

import com.cztffa.dataproviders.DataCSVExtractor;
import com.cztffa.objects.Funding;
import com.cztffa.page.account.SmbAccountDetailsPage;
import com.cztffa.util.ApplicantUtil;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

@Slf4j
public class SmbFundingPage extends SmbAccountDetailsPage {
    public void addFundDetailsForSMB(Funding funding) throws InterruptedException {
        ApplicantUtil applicantUtil = new ApplicantUtil();
        log.info("Processing the funding details");
        waitForSpinnerToDisappear();
        waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
        waitForVisibilityWithLoader("//*[contains(text(),'Specify how you would like to')]");
        String pageSource = getSeleniumdriver().getWebDriver().getPageSource();
//        if(pageSource.contains("Do you want to fund now?")) {
//            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().fundingToggleButton);
////            Thread.sleep(2000);
//            waitWithSpinner(getSmbFundingPageModel().fundingToggleButton);
//            browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().fundingToggleButton);
//            log.info("After funding toggle click");
////            Thread.sleep(2000);
//        }

        if(pageSource.contains("Do you want to fund now?")) {
            log.info("Clicking funding toggle");
            waitForVisibilityWithLoader("//*[contains(text(),'Do you want to fund now?')]");
            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().fundingToggleButton);
//			Thread.sleep(1000);

            browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().fundingToggleButton);

            log.info("Funding toggle clicked");
//			Thread.sleep(3000);
        }
        browserActions.clickApply(getSeleniumdriver().getWebDriver(), getSmbFundingPageModel().sourceOfFundDrApply);
//        Thread.sleep(2000);
        log.info("After funding text box click");

        if (funding.getFundingSource().equalsIgnoreCase("ACH")) {
            browserActions.scrollToWebElement(getSeleniumdriver(),getSmbFundingPageModel().sourceOfFundOpApply);
            waitWithSpinner(getSmbFundingPageModel().sourceOfFundOpApply);
            browserActions.clickApply(getSeleniumdriver().getWebDriver(), getSmbFundingPageModel().sourceOfFundOpApply);
            log.info("After selected External Account");

//		browserActions.scrollToWebElement(getSeleniumdriver(), getFundingPageModel().fundingDetailsLabel);


            waitForSpinnerToDisappear();

//            Thread.sleep(2500);

//                browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().acknowledgePalidToggle);//added
//            Thread.sleep(1000);
//            browserActions.clickCheckboxListItem(getSeleniumdriver(), getSmbFundingPageModel().acknowledgePalidToggle);//added
//            log.info("Selected acknowledgePalidToggle");





            if (pageSource.contains("I acknowledge that I want to ")) {
                waitForVisibilityWithLoader("//*[contains(text(),'Do you want to fund now?')]");
                if (getSmbFundingPageModel().acknowledgePalidToggle.isDisplayed()) {
                    browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().acknowledgePalidToggle);
//                    Thread.sleep(1000);
                    waitWithSpinner(getSmbFundingPageModel().acknowledgePalidToggle);
                    browserActions.clickCheckboxListItem(getSeleniumdriver(), getSmbFundingPageModel().acknowledgePalidToggle);
                    log.info("Selected acknowledgePalidToggle");
                } else {
                    log.info("acknowledgePalidToggle is not displayed");
                }
            } else {
                log.info("Text 'I acknowledge that I want to' not found in page source, skipping checkbox selection");
            }


//            try {
//                WebElement toggle = getSmbFundingPageModel().acknowledgePalidToggle;
//                if (toggle.isDisplayed()) {
//                    browserActions.scrollToWebElement(getSeleniumdriver(), toggle);
//                    Thread.sleep(1000);
//                    browserActions.clickCheckboxListItem(getSeleniumdriver(), toggle);
//                    log.info("Selected acknowledgePalidToggle");
//                }
//            } catch (NoSuchElementException e) {
//                log.info("acknowledgePalidToggle not present, skipping.");
//            }

//            Thread.sleep(2000);

           log.info("Clciking on btn Plaid");
           wait(getSmbFundingPageModel().btnPlaid);
           browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().btnPlaid);
//            Thread.sleep(1000);
            waitWithSpinner(getSmbFundingPageModel().btnPlaid);
            waitWithShortTime(getSeleniumdriver());
            browserActions.clickUsingEnter(getSeleniumdriver().getWebDriver(), getSmbFundingPageModel().btnPlaid);
//            Thread.sleep(5000);
             waitForSpinnerToDisappear();
            browserActions.switchToFrame(getSeleniumdriver(), getSmbFundingPageModel().framePlaid);
//            Thread.sleep(2000);


//		browserActions.scrollToWebElement(getSeleniumdriver(), getFundingPageModel().btnAuthContinue);
//		Thread.sleep(1000);
//		browserActions.clickButton(getSeleniumdriver(), getFundingPageModel().btnAuthContinue, 2000, 2000);

//		browserActions.clickApply(getSeleniumdriver().getWebDriver(), getFundingPageModel().btnAuthContinue);
//		Thread.sleep(2000);// selectBank

            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().btnAuthContinueGuest);
//            Thread.sleep(1000);// selectBank
            waitWithSpinner(getSmbFundingPageModel().btnAuthContinueGuest);
//		browserActions.clickButton(getSeleniumdriver(), getFundingPageModel().btnAuthContinue, 1000, 1000); //second screen continue click
            browserActions.clickApply(getSeleniumdriver().getWebDriver(), getSmbFundingPageModel().btnAuthContinueGuest);
//            Thread.sleep(2000);
            waitForSpinnerToDisappear();
            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().btnAuthContinue);
            waitWithSpinner(getSmbFundingPageModel().btnAuthContinue);
            browserActions.clickApply(getSeleniumdriver().getWebDriver(), getSmbFundingPageModel().btnAuthContinue);
//            Thread.sleep(3000);
            waitForSpinnerToDisappear();
            waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
//		if (funding.getBank().equalsIgnoreCase("Citi Bank")) {
            log.info("selecting citi bank acccount");
//			browserActions.clickButton(getSeleniumdriver(), getFundingPageModel().selectBank);
            //bank  should b=match exact text value in plaid instutuon name eg : Chase,Bank of America,Citibank Online,
            log.info("bank name locator"+applicantUtil.getWebElement(getSeleniumdriver(),getSmbFundingPageModel().plaidInstutionName,funding.getBank()));
//			browserActions.clickButton(getSeleniumdriver(), applicantUtil.getWebElement(getSeleniumdriver(),getFundingPageModel().plaidInstutionName,funding.getBank()));
             waitWithShortTime(getSeleniumdriver());
            browserActions.clickButton(getSeleniumdriver(), applicantUtil.getWebElement(getSeleniumdriver(),getSmbFundingPageModel().plaidInstutionName,funding.getBank()),3000, 500);
//			browserActions.mouseOverClickElement(getSeleniumdriver(), applicantUtil.getWebElement(getSeleniumdriver(),getFundingPageModel().plaidInstutionName,funding.getBank()));
//		}
            String parent=getSeleniumdriver().getWebDriver().getWindowHandle();
            browserActions.clickButton(getSeleniumdriver(),getSmbFundingPageModel().btnLogin);
//            Thread.sleep(2000);
            waitForSpinnerToDisappear();
            waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());

            browserActions.switchToNewTab(getSeleniumdriver());
            browserActions.enterText(getSeleniumdriver(), getSmbFundingPageModel().txtUsername, funding.getAchUserId());
            browserActions.enterText(getSeleniumdriver(), getSmbFundingPageModel().txtPassword, funding.getAchPassword());
//            Thread.sleep(1000);
            browserActions.scrollToWebElement(getSeleniumdriver(),getSmbFundingPageModel().btnAuthSubmit);
            waitWithSpinner(getSmbFundingPageModel().btnAuthSubmit);
            browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().btnAuthSubmit);
//            Thread.sleep(3000);
            waitForSpinnerToDisappear();
            waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());

            waitWithSpinner(getSmbFundingPageModel().btnAuthContinueAfter);
            browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().btnAuthContinueAfter);
//            Thread.sleep(3000);
            waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());

            waitWithSpinner(getSmbFundingPageModel().btnAuthContinueAfterSuccess);
            browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().btnAuthContinueAfterSuccess);
//            Thread.sleep(3000);
            selectElement(getSeleniumdriver().getWebDriver(),getSmbFundingPageModel().checkbox);

            browserActions.clickCheckboxListItem(getSeleniumdriver(),getSmbFundingPageModel().checkbox);
//            Thread.sleep(3000);
            waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
             log.info("Clicking on submit button");
            waitWithSpinner(getSmbFundingPageModel().btnSubmit);
            browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().btnSubmit);
//            Thread.sleep(3000);
            waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());

            selectElement(getSeleniumdriver().getWebDriver(),getSmbFundingPageModel().checkboxTerms);
            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().checkboxTerms);
//            Thread.sleep(2000);
            selectElement(getSeleniumdriver().getWebDriver(),getSmbFundingPageModel().checkboxTerms);
            waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());

            browserActions.clickCheckboxListItem(getSeleniumdriver(),getSmbFundingPageModel().checkboxTerms);
//            Thread.sleep(3000);
            waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
            log.info("submit and confirm");
            waitWithSpinner(getSmbFundingPageModel().btnSubmitConfirm);

            waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
            Thread.sleep(2500);
            browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().btnSubmitConfirm);
            Thread.sleep(3000);
//            waitWithLongTime(getSeleniumdriver());
//		browserActions.switchToNewTab(getSeleniumdriver());
//		getSeleniumdriver().getWebDriver().switchTo().window(getSeleniumdriver().getWebDriver().getWindowHandles().);
//		getSeleniumdriver().getWebDriver().navigate().back();


//            waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
            waitForSpinnerToDisappear();
             log.info("Before Switch");
            getSeleniumdriver().getWebDriver().switchTo().window(parent);
            log.info("After Switch");
            browserActions.switchToDefaultContent(getSeleniumdriver());

            browserActions.switchToFrame(getSeleniumdriver(), getSmbFundingPageModel().framePlaid);
            log.info("Switched to framePlaid");
//            Thread.sleep(3000);
            waitForSpinnerToDisappear();
            waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
            log.info("Scrolling to finish without saving button");
            browserActions.scrollToWebElement(getSeleniumdriver(),getSmbFundingPageModel().btnContinue);
//            waitWithSpinner(getSmbFundingPageModel().btnContinue);
            log.info(" before finish without Saving click");
//            Thread.sleep(1000);
             browserActions.clickButton(getSeleniumdriver(),getSmbFundingPageModel().btnContinue);
            log.info(" After finish without Saving click");

//            browserActions.clickUsingEnter(getSeleniumdriver().getWebDriver(), getSmbFundingPageModel().btnContinue);
            browserActions.switchToDefaultContent(getSeleniumdriver());
//            Thread.sleep(8000);
//            waitForSpinnerToDisappear();
//            waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
//            waitForSpinnerToDisappear();
//		browserActions.clickCheckboxListItem(getSeleniumdriver(),getFundingPageModel().acknowledgePalidToggle);//added
//		Thread.sleep(8000);
//            Thread.sleep(8000);
            log.info("Waiting for going to parent page");
            waitForSpinnerToDisappear();
            waitForVisibilityWithLoader("//*[contains(text(),'External Account')]");
            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().drpAcNum);
//            Thread.sleep(1000);
            log.info("Scrolled to drop Acnum");
            waitForSpinnerToDisappear();
            selectElement(getSeleniumdriver().getWebDriver(),getSmbFundingPageModel().drpAcNum);

//            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().drpAcNum);
//            selectElement(getSeleniumdriver().getWebDriver(),getSmbFundingPageModel().drpAcNum);
            browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().drpAcNum);
//            Thread.sleep(3000);

            waitForSpinnerToDisappear();
            log.info("I am on optAcNum");
            browserActions.scrollToWebElement(getSeleniumdriver(),getSmbFundingPageModel().optAcNum);
            selectElement(getSeleniumdriver().getWebDriver(),getSmbFundingPageModel().optAcNum);
            browserActions.clickButton(getSeleniumdriver(),getSmbFundingPageModel().optAcNum);
//            Thread.sleep(3000);
            log.info("Selected Drop Down Value Clicked");
            waitForSpinnerToDisappear();
            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().flagTrantoAcc);
//            Thread.sleep(2000);
            log.info("Scrolled to Entered Amount");
            waitWithSpinner(getSmbFundingPageModel().flagTrantoAcc);
            browserActions.scrollToWebElement(getSeleniumdriver(),getSmbFundingPageModel().authorizePalidToggle);
//            Thread.sleep(1000);
            log.info("Clciking on Authorise Plaid toggle");

            browserActions.clickButton(getSeleniumdriver(),getSmbFundingPageModel().authorizePalidToggle);//added
//            Thread.sleep(3000);
            waitForSpinnerToDisappear();
            waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
            log.info("clicked Authorise plaid toggle");
//            waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());


//		WebElement radio = getSeleniumdriver().getWebDriver().findElement(By.id());
//		browserActions.selectRadioButton(getSeleniumdriver(), getFundingPageModel().noOverdraft, "No",2,2);;
//		Thread.sleep(2000);
//			browserActions.clickCheckboxListItem(getSeleniumdriver(), getFundingPageModel().fundingNextButton);
        }
        else if(funding.getFundingSource().equalsIgnoreCase("creditCard") || funding.getFundingSource().equalsIgnoreCase("debitCard")) {
//			browserActions.clickApply(getSeleniumdriver().getWebDriver(), getFundingPageModel().sourceOfFundCCApply);
//			Thread.sleep(20000);
            if (funding.getFundingSource().equalsIgnoreCase("creditCard")) {
                browserActions.clickApply(getSeleniumdriver().getWebDriver(), getSmbFundingPageModel().sourceOfFundCCApply);
                log.info("Credit card selected");
            } else if (funding.getFundingSource().equalsIgnoreCase("debitCard")) {
                browserActions.clickApply(getSeleniumdriver().getWebDriver(), getSmbFundingPageModel().sourceOfFundDCApply);
                log.info("Debit card selected");
            }
            Thread .sleep(5000);

            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().frameCardNumber);
            Thread.sleep(2000);
            browserActions.switchToFrame(getSeleniumdriver(), getSmbFundingPageModel().frameCardNumber);
            Thread.sleep(3000);

            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().cardNumber);
            Thread.sleep(2000);
            browserActions.enterText(getSeleniumdriver(), getSmbFundingPageModel().cardNumber,funding.getCardNumber());
            Thread.sleep(2000);
            log.info("Frame Card number enetered");
            browserActions.switchToDefaultContent(getSeleniumdriver());
            browserActions.switchToFrame(getSeleniumdriver(), getSmbFundingPageModel().frameCardName);
            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().cardHolder);
            browserActions.enterText(getSeleniumdriver(), getSmbFundingPageModel().cardHolder,funding.getCardHolderName());
            Thread.sleep(2000);
            browserActions.switchToDefaultContent(getSeleniumdriver());
            browserActions.switchToFrame(getSeleniumdriver(), getSmbFundingPageModel().frameCardDate);
            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().cardExpiry);
            browserActions.enterTextKeyEntry(getSeleniumdriver(), getSmbFundingPageModel().cardExpiry,funding.getExpiryDate());
            Thread.sleep(2000);
            browserActions.switchToDefaultContent(getSeleniumdriver());
            browserActions.switchToFrame(getSeleniumdriver(), getSmbFundingPageModel().frameCardCVV);
            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().cvv);
            browserActions.enterTextKeyEntry(getSeleniumdriver(), getSmbFundingPageModel().cvv,funding.getCvv());
            Thread.sleep(2000);
            browserActions.switchToDefaultContent(getSeleniumdriver());
            browserActions.switchToFrame(getSeleniumdriver(), getSmbFundingPageModel().frameCardZip);
            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().zipCode);
            browserActions.enterTextKeyEntry(getSeleniumdriver(), getSmbFundingPageModel().zipCode,funding.getZipCode());
            Thread.sleep(2000);
            browserActions.switchToDefaultContent(getSeleniumdriver());
            browserActions.switchToFrame(getSeleniumdriver(), getSmbFundingPageModel().frameCardStreet);
            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().street);
            browserActions.enterText(getSeleniumdriver(), getSmbFundingPageModel().street,funding.getStreetAddress());
            browserActions.switchToDefaultContent(getSeleniumdriver());
            Thread.sleep(2000);
            browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().btnPay, 2000, 2000);
            Thread.sleep(8000);
            browserActions.clickApply(getSeleniumdriver().getWebDriver(), getSmbFundingPageModel().btnAuthContinueGuest);
            Thread.sleep(2000);

        }
        log.info("Finished processing of Funding details");
    }
}
