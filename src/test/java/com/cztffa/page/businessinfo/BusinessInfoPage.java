package com.cztffa.page.businessinfo;

import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import com.cztffa.page.product.SmbProductSelectorPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.cztffa.objects.Business;
import com.cztffa.objects.Validation;
import com.cztffa.util.ApplicantUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BusinessInfoPage extends SmbProductSelectorPage {

    //addBusinessDetailForSmb
	public void addBusinessDetailForSmb(Business business, int index) throws InterruptedException {
		getSeleniumdriver().getWebDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		waitForSpinnerToDisappear();

		ApplicantUtil applicantUtil = new ApplicantUtil();
		Validation validation = business.getValidation();
		log.info("Entering business name");
		browserActions.enterText(getSeleniumdriver(),
				applicantUtil.getWebElement(getSeleniumdriver(), getBusinessInfoPageModel().businessName, index),
				business.getBusinessName());
		assertTrue(true);


		WebElement dropdownOption = applicantUtil.getWebElement(getSeleniumdriver(), getBusinessInfoPageModel().businessType, index);

		wait(dropdownOption);
		browserActions.scrollToWebElement(getSeleniumdriver(),dropdownOption);


		log.info("selecting the business type dropdown");
		browserActions.clickButton(getSeleniumdriver(),
				applicantUtil.getWebElement(getSeleniumdriver(), getBusinessInfoPageModel().businessType, index));
		getSeleniumdriver().getWebDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		if (business.getBusinessType().equalsIgnoreCase("Sole Proprietorship")) {
			log.info("selecting citizenship");
			browserActions.clickApply(getSeleniumdriver().getWebDriver(),
					getBusinessInfoPageModel().businessTypeSelectSole);
			assertTrue(true);
			log.info("business type selected");
		}
		else if (business.getBusinessType().equalsIgnoreCase("Limited Liability Company")) {
			log.info("selecting citizenship");
			browserActions.clickApply(getSeleniumdriver().getWebDriver(),
					getBusinessInfoPageModel().businessTypeSelectLlc);
			assertTrue(true);
			log.info("business type selected");
		}
		else if (business.getBusinessType().equalsIgnoreCase("Corporation")) {
			log.info("selecting citizenship");
			browserActions.clickApply(getSeleniumdriver().getWebDriver(),
					getBusinessInfoPageModel().businessTypeSelectCorporation);
			assertTrue(true);
			log.info("business type selected");
		}
		else if (business.getBusinessType().equalsIgnoreCase("General Partnership")) {
			log.info("selecting citizenship");
			browserActions.clickApply(getSeleniumdriver().getWebDriver(),
					getBusinessInfoPageModel().businessTypeSelectGenralPartnership);
			assertTrue(true);
			log.info("business type selected");
		}



//         Thread.sleep(1000);
//		WebElement streetAddress = applicantUtil.getWebElement(getSeleniumdriver(), getBusinessInfoPageModel().streetAddress1, index);
//		wait(streetAddress);
		log.info("i am at the select address place");


		log.info("selected street address dropdown ::"+business.getStreetAddress1());
		WebElement address = applicantUtil.getWebElement(getSeleniumdriver(), getBusinessInfoPageModel().streetAddress1, index);

		browserActions.scrollToWebElement(getSeleniumdriver(), address);
//		Thread.sleep(1000);
        selectElement(getSeleniumdriver().getWebDriver(),address);

		browserActions.clickApply(getSeleniumdriver().getWebDriver(),address);
		browserActions.enterText(getSeleniumdriver(),
				address,
				business.getStreetAddress1());
//		browserActions.clickApply(getSeleniumdriver().getWebDriver(),address);
		selectBusinessAddress(getSeleniumdriver().getWebDriver(),address);
         waitWithShortTime(getSeleniumdriver());
		log.info("before addresstext");

//         Thread.sleep(2000);
		WebElement addressOfElement = applicantUtil.getWebElement(getSeleniumdriver(), getBusinessInfoPageModel().addressText, business.getStreetAddress1());
		selectElement(getSeleniumdriver().getWebDriver(),addressOfElement);
		browserActions.scrollToWebElement(getSeleniumdriver(), addressOfElement);
//		Thread.sleep(2000);
		waitWithSpinner(addressOfElement);

		browserActions.clickApply(getSeleniumdriver().getWebDriver(),addressOfElement);
		log.info("after addresstext");

//		Thread.sleep(2000);

		WebElement city = applicantUtil.getWebElement(getSeleniumdriver(), getBusinessInfoPageModel().city, index);

		browserActions.scrollToWebElement(getSeleniumdriver(),city);
		wait(getSeleniumdriver().getWebDriver(),city);
		browserActions.enterText(getSeleniumdriver(),
				applicantUtil.getWebElement(getSeleniumdriver(), getBusinessInfoPageModel().city, index),
				business.getCity());

		if ((validation == null) || validation != null && !validation.isSkipStateDropdown()) {
			browserActions.clickApply(getSeleniumdriver().getWebDriver(),
					applicantUtil.getWebElement(getSeleniumdriver(), getBusinessInfoPageModel().state, index));
			wait(getBusinessInfoPageModel().stateOptApply);
			browserActions.clickApply(getSeleniumdriver().getWebDriver(), getBusinessInfoPageModel().stateOptApply);
			log.info("After entering state drop downn ");
		}

		WebElement zip = applicantUtil.getWebElement(getSeleniumdriver(), getBusinessInfoPageModel().zip, index);
		browserActions.scrollToWebElement(getSeleniumdriver(),zip);
		wait(zip);
		browserActions.enterText(getSeleniumdriver(),
				applicantUtil.getWebElement(getSeleniumdriver(), getBusinessInfoPageModel().zip, index),
				business.getZip());
		waitForSpinnerToDisappear();
		log.info("After entering Zipcode");



		log.info("entering mobile phone no");


		WebElement mobPhone = applicantUtil.getWebElement(getSeleniumdriver(), getBusinessInfoPageModel().mobilePhone, index);
		browserActions.scrollToWebElement(getSeleniumdriver(),mobPhone);
		wait(mobPhone);
		browserActions.enterText(getSeleniumdriver(),
				applicantUtil.getWebElement(getSeleniumdriver(), getBusinessInfoPageModel().mobilePhone, index),
				business.getPhoneNumber());
		log.info("entering email");
		browserActions.enterText(getSeleniumdriver(),
				applicantUtil.getWebElement(getSeleniumdriver(), getBusinessInfoPageModel().email, index),
				business.getEmail());
		waitForSpinnerToDisappear();





		if (business.getBusinessType().equalsIgnoreCase("Sole Proprietorship")) {
			log.info("entering SSN");
			browserActions.clickApply(getSeleniumdriver().getWebDriver(),
					applicantUtil.getWebElement(getSeleniumdriver(), getBusinessInfoPageModel().idType, index));
			browserActions.clickApply(getSeleniumdriver().getWebDriver(),
					getBusinessInfoPageModel().idTypeSSNApply);
			waitForSpinnerToDisappear();
			waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
			browserActions.scrollToWebElement(getSeleniumdriver(), getBusinessInfoPageModel().ssn);
			browserActions.enterText(getSeleniumdriver(),
					getBusinessInfoPageModel().ssn,
					business.getSsn());
			log.info("entered ssn");

		} else if (business.getBusinessType().equalsIgnoreCase("Limited Liability Company") ||
				business.getBusinessType().equalsIgnoreCase("Corporation")||business.getBusinessType().equalsIgnoreCase("General Partnership")) {

			log.info("entering TIN");
			browserActions.clickApply(getSeleniumdriver().getWebDriver(),
					applicantUtil.getWebElement(getSeleniumdriver(), getBusinessInfoPageModel().idType, index));

			browserActions.clickApply(getSeleniumdriver().getWebDriver(),
					getBusinessInfoPageModel().idTypeTINApply);
			waitForSpinnerToDisappear();
			waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
			browserActions.scrollToWebElement(getSeleniumdriver(), getBusinessInfoPageModel().tin);
			browserActions.enterText(getSeleniumdriver(),
					getBusinessInfoPageModel().tin,
					business.getTinNumber());
			log.info("entered TIN");
		}



		WebElement naics = applicantUtil.getWebElement(getSeleniumdriver(), getBusinessInfoPageModel().naicsCode, index);


		browserActions.scrollToWebElement(getSeleniumdriver(),  applicantUtil.getWebElement(getSeleniumdriver(), getBusinessInfoPageModel().naicsCode, index));
		wait(naics);
		browserActions.clickApply(getSeleniumdriver().getWebDriver(),
				applicantUtil.getWebElement(getSeleniumdriver(), getBusinessInfoPageModel().naicsCode, index));
		waitForSpinnerToDisappear();
		log.info("selecting preferred id method {}", business.getNaicsCode());
		if (business.getNaicsCode().equalsIgnoreCase("soybean farming")) {
			browserActions.clickButton(getSeleniumdriver(),
					getBusinessInfoPageModel().soybeanFarmingSelected);
		}
		log.info("Soyabean selected");


		log.info("Entering date of establishment");


		WebElement dateOfEst = applicantUtil.getWebElement(getSeleniumdriver(), getBusinessInfoPageModel().dateOfEstablishment, index);

		browserActions.scrollToWebElement(getSeleniumdriver(),dateOfEst);
		wait(dateOfEst);
//       Thread.sleep(1000);
//		waitWithShortTime(getSeleniumdriver());
		browserActions.clickApply(getSeleniumdriver().getWebDriver(),applicantUtil.getWebElement(getSeleniumdriver(), getBusinessInfoPageModel().dateOfEstablishment,index));


		WebElement doeElement = applicantUtil.getWebElement(getSeleniumdriver(), getBusinessInfoPageModel().dateOfEstablishment,
				index);
		assertTrue(true);
		browserActions.enterTextKeyEntry(getSeleniumdriver(), doeElement, business.getDoe());
//		Thread.sleep(1000);

		log.info("date of establishment entered");




		if(index!=0) {
			WebElement relationCode=applicantUtil.getWebElement(getSeleniumdriver(), getBusinessInfoPageModel().relationCode, index);
			browserActions.scrollToWebElement(getSeleniumdriver(),applicantUtil.getWebElement(getSeleniumdriver(), getBusinessInfoPageModel().relationCode, index));

			wait(relationCode);
			browserActions.enterText(getSeleniumdriver(),
					applicantUtil.getWebElement(getSeleniumdriver(), getBusinessInfoPageModel().relationCode, index),
					business.getRelationship());
//			Thread.sleep(1000);


			browserActions.clickApply(getSeleniumdriver().getWebDriver(),applicantUtil.getWebElement(getSeleniumdriver(), getBusinessInfoPageModel().relation, business.getRelationship()));
			log.info("After entering Relationcode"+business.getRelationship());
		}
	}

}