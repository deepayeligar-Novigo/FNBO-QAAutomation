package com.cztffa.page.Cdd;

import com.cztffa.objects.Person;
import com.cztffa.objects.Validation;
import com.cztffa.page.personalinfo.PersonalInfoPage;
import com.cztffa.util.ApplicantUtil;

public class CddPage extends PersonalInfoPage {
    public void CddPage (Person person, int index) throws InterruptedException {
//		getSeleniumdriver().getWebDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        ApplicantUtil applicantUtil = new ApplicantUtil();
        Validation validation = person.getValidation();
    }
}
