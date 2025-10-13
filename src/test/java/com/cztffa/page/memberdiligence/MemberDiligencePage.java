package com.cztffa.page.memberdiligence;

import java.util.List;
import java.util.Objects;

import com.cztffa.objects.Applicant;
import com.cztffa.objects.MemeberDeligence;
import com.cztffa.objects.Person;
import com.cztffa.objects.Validation;
import com.cztffa.page.Cdd.CddPage;
import com.cztffa.util.ApplicantUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MemberDiligencePage extends CddPage {

	public void addMemberDeligenceDetails(Person person) throws InterruptedException {
		Thread.sleep(5000);
		MemeberDeligence memeberDeligence = person.getMemeberDeligence();
		int i = 0;
		addMemberDeligence(memeberDeligence, i);
		List<Applicant> applicants = person.getApplicants();
		if (!Objects.isNull(applicants)) {
			for (Applicant applicant : applicants) {
				log.info("Processing started for the coapplicant in memberdiligenece page");
				browserActions.clickButton(getSeleniumdriver(), getMemberDiligencePageModel().realtedPersonButton);
				Thread.sleep(2000);
				addMemberDeligence(applicant.getMemeberDeligence(), ++i);
			}
		}

		browserActions.clickButton(getSeleniumdriver(), getMemberDiligencePageModel().memeberDiligenceNextButton);
		Thread.sleep(5000);
		try {
			browserActions.clickButton(getSeleniumdriver(), getMemberDiligencePageModel().complementoryProdButton);
		} catch (Exception e) {
		}
		Thread.sleep(5000);

	}

	public void addMemberDeligence(MemeberDeligence memeberDeligence, int index) {
		log.info("Processing of memeber diligence page");
		Validation validation = memeberDeligence.getValidation();
		if ((validation == null) || validation != null && !validation.isSkipMemberDiligenceOptions()) {
			ApplicantUtil applicantUtil = new ApplicantUtil();
			browserActions.clickApply(getSeleniumdriver().getWebDriver(), applicantUtil
					.getWebElement(getSeleniumdriver(), getMemberDiligencePageModel().domesticWiresXpath, index));

			if (memeberDeligence.getDomesticWires().equalsIgnoreCase("None")) {
				log.info("selecting domestic wires");
				browserActions.clickApply(getSeleniumdriver().getWebDriver(),
						getMemberDiligencePageModel().domesticWiresNonepply);
			}
			browserActions.clickApply(getSeleniumdriver().getWebDriver(), applicantUtil
					.getWebElement(getSeleniumdriver(), getMemberDiligencePageModel().internationalWiresXpath, index));
			if (memeberDeligence.getInternationalWires().equalsIgnoreCase("None")) {
				log.info("selecting international wires");
				browserActions.clickApply(getSeleniumdriver().getWebDriver(),
						getMemberDiligencePageModel().internationalWiresNonepApply);
			}
			browserActions.clickApply(getSeleniumdriver().getWebDriver(), applicantUtil
					.getWebElement(getSeleniumdriver(), getMemberDiligencePageModel().monetoryWiresXpath, index));
			if (memeberDeligence.getMonetoryInstuments().equalsIgnoreCase("None")) {
				log.info("selecting monetory instruments");
				browserActions.clickApply(getSeleniumdriver().getWebDriver(),
						getMemberDiligencePageModel().monetaryWiresNoneApply);
			}
		}
	}

//	public void addMemberDiligenceDetails(Person person, ProductTab productTab, Product... products)
//			throws InterruptedException {
//		fillPersonDetails(person, productTab, products);
//		addMemberDeligenceDetails(person);
//		Thread.sleep(5000);
//	}

}
