package com.cztffa.page.funding;

import com.cztffa.driver.SeleniumDriver;
import io.cucumber.java.et.Ja;
import org.openqa.selenium.By;

import com.cztffa.dataproviders.DataCSVExtractor;
import com.cztffa.objects.Funding;
import com.cztffa.objects.Person;
import com.cztffa.objects.Product;
import com.cztffa.objects.ProductTab;
import com.cztffa.page.account.AccountDetailsPage;
import com.cztffa.util.ApplicantUtil;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Slf4j
public class FundingPage extends AccountDetailsPage {
	private SeleniumDriver seleniumdriver;

	public void addFundDetails(Funding funding) throws InterruptedException {
		this.seleniumdriver = getSeleniumdriver();

		ApplicantUtil applicantUtil = new ApplicantUtil();
		log.info("Processing the funding details");
//		Thread.sleep(5000);
//		Thread.sleep(1000);
		waitForVisibilityWithLoader("//*[contains(text(),'Specify how you would like to')]");
		String pagesource = seleniumdriver.getWebDriver().getPageSource();
		if(pagesource.contains("Do you want to fund now?")) {
			log.info("Clicking funding toggle");
			waitForVisibilityWithLoader("//*[contains(text(),'Do you want to fund now?')]");
			browserActions.scrollToWebElement(getSeleniumdriver(), getFundingPageModel().fundingToggleButton);
//			Thread.sleep(1000);

			browserActions.clickButton(getSeleniumdriver(), getFundingPageModel().fundingToggleButton);

			log.info("Funding toggle clicked");
//			Thread.sleep(3000);
		}
		waitWithSpinner(getFundingPageModel().sourceOfFundDrApply);
		selectElement(getSeleniumdriver().getWebDriver(),getFundingPageModel().sourceOfFundDrApply);
		browserActions.clickApply(getSeleniumdriver().getWebDriver(), getFundingPageModel().sourceOfFundDrApply);
//		Thread.sleep(2000);
		log.info("Clicked on funding dropdown");
		if (funding.getFundingSource().equalsIgnoreCase("ACH")) {
			log.info("Selecting source of funding");
			wait(getFundingPageModel().sourceOfFundOpApply);
			selectElement(getSeleniumdriver().getWebDriver(),getFundingPageModel().sourceOfFundOpApply);
			browserActions.clickApply(getSeleniumdriver().getWebDriver(), getFundingPageModel().sourceOfFundOpApply);
			log.info("Source of funding selected");
			waitForSpinnerToDisappear();
//			waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
//			Thread.sleep(12000);
//			Thread.sleep(2000);
			waitForVisibilityWithLoader("//*[contains(text(),'Funding Details')]");
              Thread.sleep(8000);
			browserActions.scrollToWebElement(getSeleniumdriver(),getFundingPageModel().acknowledgePalidToggle);
			Thread.sleep(2000);
			browserActions.clickButton(getSeleniumdriver(),getFundingPageModel().acknowledgePalidToggle);
			log.info("Selected acknowledgePalidToggle");
//			Thread.sleep(1000);
			waitWithSpinner(getFundingPageModel().btnPlaid);
			waitForSpinnerToDisappear();
			waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
			browserActions.scrollToWebElement(getSeleniumdriver(), getFundingPageModel().btnPlaid);
			browserActions.clickUsingEnter(getSeleniumdriver().getWebDriver(), getFundingPageModel().btnPlaid);
			log.info("Clicked on Verify with Plaid button");
//			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(getFundingPageModel().framePlaid));
//			Thread.sleep(3000);
//			Thread.sleep(2000);
			browserActions.switchToFrame(getSeleniumdriver(), getFundingPageModel().framePlaid);
			log.info("switching window");
//			Thread.sleep(2000);
			waitForSpinnerToDisappear();
			log.info("Window switched");
			waitWithSpinner(getFundingPageModel().btnAuthContinueGuest);
			browserActions.scrollToWebElement(getSeleniumdriver(), getFundingPageModel().btnAuthContinueGuest);
//			Thread.sleep(1000);
			waitWithSpinner(getFundingPageModel().btnAuthContinueGuest);
			browserActions.clickApply(getSeleniumdriver().getWebDriver(), getFundingPageModel().btnAuthContinueGuest);
//			Thread.sleep(2000);
			log.info("Clicked on continue as guest button");

			waitWithSpinner(getFundingPageModel().btnAuthContinue);
			browserActions.scrollToWebElement(getSeleniumdriver(), getFundingPageModel().btnAuthContinue);
			browserActions.clickApply(getSeleniumdriver().getWebDriver(), getFundingPageModel().btnAuthContinue);
			log.info("Clicked on continue button");
//			Thread.sleep(2000);
			waitForSpinnerToDisappear();
			waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
//			waitForVisibility("//*[contains(text(),'Select your institution')]");

	//		if (funding.getBank().equalsIgnoreCase("Citi Bank")) {
				log.info("selecting Bank account");
//				Thread.sleep(1000);
	//			browserActions.clickButton(getSeleniumdriver(), getFundingPageModel().selectBank);
				//bank  should b=match exact text value in plaid instutuon name eg : Chase,Bank of America,Citibank Online,
				log.info("bank name locator"+applicantUtil.getWebElement(getSeleniumdriver(),getFundingPageModel().plaidInstutionName,funding.getBank()));
	//			browserActions.clickButton(getSeleniumdriver(), applicantUtil.getWebElement(getSeleniumdriver(),getFundingPageModel().plaidInstutionName,funding.getBank()));
				browserActions.clickButton(getSeleniumdriver(), applicantUtil.getWebElement(getSeleniumdriver(),getFundingPageModel().plaidInstutionName,funding.getBank()),3000, 500);
	//			browserActions.mouseOverClickElement(getSeleniumdriver(), applicantUtil.getWebElement(getSeleniumdriver(),getFundingPageModel().plaidInstutionName,funding.getBank()));
	//		}
			log.info("Clicking on Continue to login button");
			String parent=getSeleniumdriver().getWebDriver().getWindowHandle();
			browserActions.clickButton(getSeleniumdriver(),getFundingPageModel().btnLogin);
//			Thread.sleep(2000);
			waitForSpinnerToDisappear();
			waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());

			browserActions.switchToNewTab(getSeleniumdriver());
			log.info("Entering username and password");
			browserActions.enterText(getSeleniumdriver(), getFundingPageModel().txtUsername, funding.getAchUserId());
			browserActions.enterText(getSeleniumdriver(), getFundingPageModel().txtPassword, funding.getAchPassword());
//			Thread.sleep(1000);

			log.info("Clicking on Sign in button");
			browserActions.clickButton(getSeleniumdriver(), getFundingPageModel().btnAuthSubmit);
//			Thread.sleep(2000);
			waitForSpinnerToDisappear();
			waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());

			log.info("Clicking on Get code button");
			waitWithSpinner(getFundingPageModel().btnAuthContinueAfter);
			browserActions.clickButton(getSeleniumdriver(), getFundingPageModel().btnAuthContinueAfter);
//			Thread.sleep(2000);
			waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());

			log.info("Clicking on Submit button");
			waitWithSpinner(getFundingPageModel().btnAuthContinueAfterSuccess);
			browserActions.clickButton(getSeleniumdriver(), getFundingPageModel().btnAuthContinueAfterSuccess);
//			Thread.sleep(2000);
			log.info("Clicking on Plaid Checking");
			browserActions.clickCheckboxListItem(getSeleniumdriver(),getFundingPageModel().checkbox);
//			Thread.sleep(3000);

			wait(getFundingPageModel().btnSubmit);
			browserActions.clickButton(getSeleniumdriver(), getFundingPageModel().btnSubmit);
			log.info("Clicked on Continue button");
//			Thread.sleep(3000);
			waitForSpinnerToDisappear();
			waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
			selectElement(getSeleniumdriver().getWebDriver(),getFundingPageModel().checkboxTerms);
			browserActions.scrollToWebElement(getSeleniumdriver(), getFundingPageModel().checkboxTerms);
//			Thread.sleep(2000);
			selectElement(getSeleniumdriver().getWebDriver(),getFundingPageModel().checkboxTerms);
			waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
			browserActions.clickCheckboxListItem(getSeleniumdriver(),getFundingPageModel().checkboxTerms);
			log.info("Accepted Terms and Conditions");
//			Thread.sleep(3000);
//			wait(getFundingPageModel().btnSubmitConfirm);
			browserActions.clickButton(getSeleniumdriver(), getFundingPageModel().btnSubmitConfirm);
			log.info("Clicked on Connected account Information button");
			Thread.sleep(3000);
//			waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());

			getSeleniumdriver().getWebDriver().switchTo().window(parent);
			browserActions.switchToDefaultContent(getSeleniumdriver());
			browserActions.switchToFrame(getSeleniumdriver(), getFundingPageModel().framePlaid);
            log.info("Switched frmae to frame Plaid");
//			Thread.sleep(3000);
			waitForSpinnerToDisappear();
			waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
			log.info("Moved to the last continue button fish without saving");
			browserActions.scrollToWebElement(getSeleniumdriver(),getFundingPageModel().btnContinue);
			waitWithSpinner(getFundingPageModel().btnContinue);
			browserActions.clickButton(getSeleniumdriver(), getFundingPageModel().btnContinue);
			log.info("Clicked on Continue without saving button");
			browserActions.switchToDefaultContent(getSeleniumdriver());
			log.info("Selecting External account");
//			Thread.sleep(8000);
//			Thread.sleep(2000);
//			browserActions.clickCheckboxListItem(getSeleniumdriver(),getFundingPageModel().acknowledgePalidToggle);//added
	//		Thread.sleep(8000);
			waitForSpinnerToDisappear();
			waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
			waitForSpinnerToDisappear();
			waitForVisibilityWithLoader("//*[contains(text(),'External Account')]");
			waitWithSpinner(getFundingPageModel().drpAcNum);
			browserActions.scrollToWebElement(getSeleniumdriver(), getFundingPageModel().drpAcNum);
			waitForSpinnerToDisappear();
			selectElement(getSeleniumdriver().getWebDriver(),getFundingPageModel().drpAcNum);
			browserActions.clickButton(getSeleniumdriver(), getFundingPageModel().drpAcNum);
			log.info("Clicked on External account dropdown");
//			Thread.sleep(1000);

			wait(getFundingPageModel().optAcNum);
			browserActions.scrollToWebElement(getSeleniumdriver(),getFundingPageModel().optAcNum);
			selectElement(getSeleniumdriver().getWebDriver(),getFundingPageModel().optAcNum);
			browserActions.clickButton(getSeleniumdriver(), getFundingPageModel().optAcNum);
			log.info("Selected Account");
//			Thread.sleep(2000);
			log.info("Completed Plaid checking");
			browserActions.scrollToWebElement(getSeleniumdriver(), getFundingPageModel().flagTrantoAcc);
//			Thread.sleep(2000);
			browserActions.scrollToWebElement(getSeleniumdriver(),getFundingPageModel().authorizePalidToggle);
//			Thread.sleep(1000);
			browserActions.clickButton(getSeleniumdriver(),getFundingPageModel().authorizePalidToggle);
			log.info("Authorized Plaid toggle");
//			Thread.sleep(5000);
	//		WebElement radio = getSeleniumdriver().getWebDriver().findElement(By.id());
	//		browserActions.selectRadioButton(getSeleniumdriver(), getFundingPageModel().noOverdraft, "No",2,2);;
	//		Thread.sleep(2000);
	//			browserActions.clickCheckboxListItem(getSeleniumdriver(), getFundingPageModel().fundingNextButton);
		}
		else if(funding.getFundingSource().equalsIgnoreCase("creditCard") || funding.getFundingSource().equalsIgnoreCase("debitCard")) {
			if(funding.getFundingSource().equalsIgnoreCase("creditCard")){
				browserActions.clickApply(getSeleniumdriver().getWebDriver(), getFundingPageModel().sourceOfFundCCApply);
				log.info("Selecting credit card");
			}
			else if(funding.getFundingSource().equalsIgnoreCase("debitCard")){
				browserActions.clickApply(getSeleniumdriver().getWebDriver(), getFundingPageModel().sourceOfFundDCApply);
				log.info("Selecting debit card");
			}
			Thread.sleep(8000);
			browserActions.scrollToWebElement(getSeleniumdriver(), getFundingPageModel().frameCardNumber);	
			Thread.sleep(2000);
			browserActions.switchToFrame(getSeleniumdriver(), getFundingPageModel().frameCardNumber);
			Thread.sleep(3000);
			browserActions.scrollToWebElement(getSeleniumdriver(), getFundingPageModel().cardNumber);
			Thread.sleep(2000);
			browserActions.enterText(getSeleniumdriver(), getFundingPageModel().cardNumber,funding.getCardNumber());
			Thread.sleep(2000);
			log.info("Entering card number");
			browserActions.switchToDefaultContent(getSeleniumdriver());
			browserActions.switchToFrame(getSeleniumdriver(), getFundingPageModel().frameCardName);
			browserActions.scrollToWebElement(getSeleniumdriver(), getFundingPageModel().cardHolder);	
			browserActions.enterText(getSeleniumdriver(), getFundingPageModel().cardHolder,funding.getCardHolderName());
			log.info("Entering cardholder name");
			Thread.sleep(2000);
			browserActions.switchToDefaultContent(getSeleniumdriver());
			browserActions.switchToFrame(getSeleniumdriver(), getFundingPageModel().frameCardDate);
			browserActions.scrollToWebElement(getSeleniumdriver(), getFundingPageModel().cardExpiry);	
			browserActions.enterTextKeyEntry(getSeleniumdriver(), getFundingPageModel().cardExpiry,funding.getExpiryDate());
			log.info("Entering card expiry");
			Thread.sleep(2000);
			browserActions.switchToDefaultContent(getSeleniumdriver());
			browserActions.switchToFrame(getSeleniumdriver(), getFundingPageModel().frameCardCVV);
			browserActions.scrollToWebElement(getSeleniumdriver(), getFundingPageModel().cvv);	
			browserActions.enterTextKeyEntry(getSeleniumdriver(), getFundingPageModel().cvv,funding.getCvv());
			log.info("Entering card cvv");
			Thread.sleep(2000);
			browserActions.switchToDefaultContent(getSeleniumdriver());
			browserActions.switchToFrame(getSeleniumdriver(), getFundingPageModel().frameCardZip);
			browserActions.scrollToWebElement(getSeleniumdriver(), getFundingPageModel().zipCode);	
			browserActions.enterTextKeyEntry(getSeleniumdriver(), getFundingPageModel().zipCode,funding.getZipCode());
			log.info("Entering zipcode");
			Thread.sleep(2000);
			browserActions.switchToDefaultContent(getSeleniumdriver());
			browserActions.switchToFrame(getSeleniumdriver(), getFundingPageModel().frameCardStreet);
			browserActions.scrollToWebElement(getSeleniumdriver(), getFundingPageModel().street);	
			browserActions.enterText(getSeleniumdriver(), getFundingPageModel().street,funding.getStreetAddress());
			log.info("Entering street address");
			browserActions.switchToDefaultContent(getSeleniumdriver());
			Thread.sleep(2000);
			browserActions.clickButton(getSeleniumdriver(), getFundingPageModel().btnPay, 2000, 2000);
			log.info("Clicking on Pay button");
			Thread.sleep(8000);
			browserActions.clickApply(getSeleniumdriver().getWebDriver(), getFundingPageModel().btnAuthContinue);
			log.info("Clicking on Continue button");
			Thread.sleep(2000);
		}
		log.info("Finished processing of Funding details");
	}
	
//	public void addFundingDetails(Person person, ProductTab productTab, Product... products)
//			throws InterruptedException {
//		addAccountDetails(person, productTab, products);
//		addFundDetails(person.getFunding());
//		Thread.sleep(5000);
//	}

}
