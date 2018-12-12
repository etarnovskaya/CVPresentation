package com.elena.next.manager;

import com.elena.next.model.SearchBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Header extends  HelperBase {
  WebDriverWait wait;

  public Header(WebDriver wd) {
    super(wd);
  }


  public String waitAndGetMyAccountText() {
    wait = new WebDriverWait(wd, 7);
   return wait.until(ExpectedConditions.visibilityOfElementLocated
           (By.cssSelector("li[data-section='myAccount']"))).getText();

  }

  public void clickOnFlag() {
    click(By.cssSelector("div.HeaderFlag"));
  }

  public  void clickOnEnglishButtonInTheFlag(){
    click(By.cssSelector("[type=button][value=English]"));
    confirmLanguageSelection();
  }

  public  void clickOnHebrewButtonInTheFlag(){
    click(By.cssSelector("[type=button][value='עברית ']"));
    confirmLanguageSelection();
  }

  public void  confirmLanguageSelection(){
    click(By.id("btnFlagSelectorShopNow"));
  }

  public void typeInSearchBar(SearchBar searchBar) {
    type(By.cssSelector("#sli_search_1"), searchBar.getText());
  }


  public void proceedToSearch() {
    click(By.xpath("//input[@title='Search Items']"));
  }

  public void checkItemCountInBasket() {
    System.out.println(
            wd.findElement(By.cssSelector(".BagSummary"))
                    .getText());
  }

  public void clickOnBasketIcon() {
    click(By.cssSelector(".BagSummary"));
  }


}
