package com.cztffa.page.Cdd;

import com.cztffa.objects.Person;
import com.cztffa.objects.Validation;
import com.cztffa.page.base.BasePage;
import com.cztffa.page.consumer.CddPageModel;
import com.cztffa.page.personalinfo.PersonalInfoPage;
import com.cztffa.util.ApplicantUtil;
import lombok.extern.slf4j.Slf4j;

import com.cztffa.page.review.ReviewPage;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import com.cztffa.driver.SeleniumDriver;
import com.cztffa.page.review.ReviewPage;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cztffa.objects.Applicant;
import com.cztffa.objects.Person;
import com.cztffa.objects.Validation;
import com.cztffa.util.ApplicantUtil;
import com.cztffa.page.product.ProductSelectorPage;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CddPage extends PersonalInfoPage {
    private SeleniumDriver seleniumdriver;
    private ReviewPage reviewPage;

   // public void Cdddetail(Person person, int index) throws InterruptedException {
//		getSeleniumdriver().getWebDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        public void cdddetail (Person person,int index) throws InterruptedException {
            ApplicantUtil applicantUtil = new ApplicantUtil();
            Validation validation = person.getValidation();
            waitForSpinnerToDisappear();
            browserActions.scrollElementIntoView(getSeleniumdriver(), element(getCddPageModel().occupation, index));
            browserActions.clickApply(getSeleniumdriver().getWebDriver(), element(getCddPageModel().occupation, index));
            Thread.sleep(3000);
            wait(getCddPageModel().occupationapply);

            browserActions.clickApply(getSeleniumdriver().getWebDriver(),getCddPageModel().occupationapply);
            log.info("After entering occupation ");
            Thread.sleep(5000);
            wait(element((getCddPageModel()).employer, index));
            browserActions.scrollElementIntoView(getSeleniumdriver(), element(getCddPageModel().employer, index));
            browserActions.enterText(getSeleniumdriver(), element(getCddPageModel().employer, index), person.getCity());
            Thread.sleep(2000);
//
            log.info("Clicking on wire activity");
            Thread.sleep(5000);

            browserActions.scrollElementIntoView(getSeleniumdriver(),getCddPageModel().WireActivity);
            browserActions.clickButton(getSeleniumdriver(),getCddPageModel().WireActivity);
            log.info("Wire activity selected");
            Thread.sleep(2000);


            log.info("Clicking on Cddnext button");
            Thread.sleep(5000);

            browserActions.scrollElementIntoView(getSeleniumdriver(), getCddPageModel().CddNextButton);
            browserActions.clickButton(getSeleniumdriver(), getCddPageModel().CddNextButton);
            log.info("next button clicked");
            Thread.sleep(7000);

        }
    }
