package com.elena.next.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenSiteTest extends  TestBase{
    @Test
  public void openSiteEnglishVersionFromHebrewPage(){
    app.getNavigationHelper().openSite("https://www.next.co.il/he");
    app.getHomePage().clickOnGoToEnglishVersionArea();
    String MyaccountText = app.getHeader().waitAndGetMyAccountText();

Assert.assertEquals(MyaccountText, "My Account");
  }

  @Test
  public void openSiteHebrewVersionFromEnglishPage(){
    app.getNavigationHelper().openSite("https://www.next.co.il/en");
    //clickOn Hebrew link
    app.getHomePage().clickOnGoToHebrewVersionArea();
    String MyaccountText = app.getHeader().waitAndGetMyAccountText();
    Assert.assertEquals(MyaccountText, "החשבון שלי");
  }

  @Test
  public void openSiteHebrewVersionFromEnglishPageByFlagIcon(){
    app.getNavigationHelper().openSite("https://www.next.co.il/en");
    //clickOn Flag on header
    app.getHeader().clickOnFlag();

    app.getHeader().clickOnHebrewButtonInTheFlag();

    String MyaccountText = app.getHeader().waitAndGetMyAccountText();
    Assert.assertEquals(MyaccountText, "החשבון שלי");
  }

  @Test
  public void openSiteEnglishVersionFromHebrewPageByFlagIcon(){
    app.getNavigationHelper().openSite("https://www.next.co.il/he");
    //clickOn Flag on header
    app.getHeader().clickOnFlag();

    app.getHeader().clickOnEnglishButtonInTheFlag();

    String MyaccountText = app.getHeader().waitAndGetMyAccountText();
    Assert.assertEquals(MyaccountText, "My Account");
  }
}

