package com.elena.next.tests;

import com.elena.next.model.SearchBar;
import org.testng.annotations.Test;

public class SmokeCustomerTest extends TestBase {
  @Test
  public void  customerEnglishVersionTest1() throws InterruptedException {
    // user selects item, adds it to the basket and deletes from the basket;
    //expected result- items count in the basket = 0

//    open site
    app.getNavigationHelper().openSite("https://www.next.co.il/en");
//    search item
    app.getHeader().typeInSearchBar(new SearchBar().setText("dress"));
    app.getHeader().proceedToSearch();
    //select item
    app.getItemHelper().selectFirstItem();
    //Choose size
    app.getItemHelper().chooseSize();
    //add to bag
    app.getItemHelper().addItemToTheBag();
//
    //check itemCountInBasket

    Thread.sleep(5000);
    app.getHeader().checkItemCountInBasket();

    //open basket
    app.getHeader().clickOnBasketIcon();

    //view / edit bag
    app.getBasketHelper().clickOnEditButton();

   System.out.println(app.getBasketHelper().getOrderValue());
    //remove item

    app.getBasketHelper().removeItem();

    app.getHeader().checkItemCountInBasket();

  }
}
