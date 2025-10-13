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
    
    @FindBy(xpath = CddPageXpath.WIREACTIVITY)
    public WebElement WireActivity;
    
    @FindBy(xpath = CddPageXpath.EMPLOYER)
    public WebElement employer;
    
    @FindBy(xpath = CddPageXpath.CDDNEXTBUTON)
    public WebElement CddNextButon;
    
}
