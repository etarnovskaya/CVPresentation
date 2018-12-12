package com.elena.next.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasketHelper extends HelperBase {
  public BasketHelper(WebDriver wd) {
    super(wd);
  }

  public void clickOnEditButton() throws InterruptedException {
    Thread.sleep(5000);
    WebElement addedToBagDialog =
            wd.findElement(By.cssSelector(".addedToBagDialogue"));

    addedToBagDialog.findElement(By.cssSelector(".view_edit_bag")).click();
  }

  public String getOrderValue(){
   return wd.findElement(By.id("sbtotals")).getText();
  }

  public void removeItem() {
    click(By.xpath("//*[@title='Click to remove this item']"));
  }
}
