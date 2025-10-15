package com.cztffa.page.consumer;
import com.cztffa.xpath.consumer.CddPageXpath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;


public class CddPageModel {
    private WebDriver driver;

    public CddPageModel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String occupation = "//tf-dropdown[@t-model='OCCUPATION_LAB']//input";
    //public String WireActivity="//tf-radio//input[@value='No']";
    public String employer="//tf-input[@t-model='OCCUPATION_LAB_employed']//input";
    @FindBy(xpath = CddPageXpath.CddNextButton)
    public WebElement CddNextButton;
    @FindBy(xpath = CddPageXpath.WireActivity)
    public WebElement WireActivity;
    @FindBy(xpath = CddPageXpath.occupationapply)
    public WebElement occupationapply;


}
