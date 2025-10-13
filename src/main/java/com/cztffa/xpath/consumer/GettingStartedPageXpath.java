package com.cztffa.xpath.consumer;

public class GettingStartedPageXpath {
    public static final String FIRSTNAME = "//tf-input[@t-model='Party__r.FirstName__c']//input";
    public static final String LASTNAME = "//div[contains(text(),'Last Name')]";
    public static final String PHONENUMBER = "//tf-phone[@t-model='Party__r.PrimaryPhone__c']//input";
    public static final String PERSONALEMAIL = "//tf-email[@t-model='Party__r.PrimaryEmail__c']//input";
    public static final String ACCEPTPOLICY = "//tf-checkbox[@t-model='Accepted__c']//input";
    public static final String ACCEPTBTN = "//button[normalize-space()='Accept']";
    public static final String STARTAPPLICATIONBUTTON = "//button[normalize-space()='Start Application']";
}
