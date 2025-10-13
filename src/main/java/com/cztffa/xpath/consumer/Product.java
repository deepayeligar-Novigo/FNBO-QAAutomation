package com.cztffa.xpath.consumer;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Product {

  FREECHECKINGACCOUNT("FreeCheckingAccount",
      "//tfcz-product-card[.//div[text()='Free Checking Account']]//button[contains(text(), 'Add to Cart')]"),
  PREMIERCHECKINGACCOUNT("PremierCheckingAccount",
      "//tfcz-product-card[.//div[text()='Premier Checking Account']]//button[contains(text(), 'Add to Cart')]");

  private String name;

  private String xpath;

  public static Product getByName(String name) {

      if (name.equalsIgnoreCase("FreeCheckingAccount")) {
      return FREECHECKINGACCOUNT;}
      else if (name.equalsIgnoreCase("PremierCheckingAccount")) {
      return PREMIERCHECKINGACCOUNT;}
      return null;
  }
}
