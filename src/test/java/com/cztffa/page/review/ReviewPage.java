package com.cztffa.page.review;

import org.openqa.selenium.JavascriptExecutor;

import com.cztffa.objects.Person;
import com.cztffa.objects.Product;
import com.cztffa.objects.ProductTab;
import com.cztffa.page.funding.FundingPage;
import com.cztffa.util.ApplicantUtil;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class ReviewPage extends FundingPage {

//	public void reviewPage(Person person) throws InterruptedException {
//		log.info("Processing started in review page");
//		JavascriptExecutor j = (JavascriptExecutor) getSeleniumdriver().getWebDriver();
//		j.executeScript("window.scrollBy(0,6000)");
//		Thread.sleep(3000);
//		browserActions.clickCheckboxListItem(getSeleniumdriver(), getReviewPageModel().termAndConditions);
//		Thread.sleep(3000);
//		browserActions.clickButton(getSeleniumdriver(), getReviewPageModel().submitButton);
//		log.info("Completed Processing of review page");
//		Thread.sleep(30000);
//	}
//
//	public void acceptDisclosure(int index) throws InterruptedException {
//		ApplicantUtil applicantUtil = new ApplicantUtil();
//		for(int i=0;i<index;i++) {
//		Thread.sleep(3000);
//		browserActions.scrollToWebElement(getSeleniumdriver(), applicantUtil.getWebElement(getSeleniumdriver(), getReviewPageModel().disclosureCheckbox,i));
//		Thread.sleep(1000);
//			log.info("Disclosure checkbox clicked count::"+i);
//		browserActions.clickCheckboxListItem(getSeleniumdriver(), applicantUtil.getWebElement(getSeleniumdriver(), getReviewPageModel().disclosureCheckbox,i));
////		browserActions.clickApply(getSeleniumdriver().getWebDriver(),
////				applicantUtil.getWebElement(getSeleniumdriver(), getReviewPageModel().disclosureCheckbox,i));
//		Thread.sleep(3000);
//		}
//	}





//	public void addReviewPage(Person person, ProductTab productTab, Product... products)
//			throws InterruptedException {
//		addFundingDetails(person, productTab, products);
//		reviewPage(person);
//		Thread.sleep(5000);
//	}
}
