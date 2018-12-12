package com.elena.next.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ItemHelper extends HelperBase{
  public ItemHelper(WebDriver wd) {
    super(wd);
  }

  public void selectFirstItem() {
    click(By.cssSelector(".Item"));
  }

  public void chooseSize() {
   click(By.cssSelector(".SizeSelector"));
   click(By.cssSelector(".SizeSelector .InStock"));
  }

  public void addItemToTheBag() {
    click(By.cssSelector(".btn-addtobag"));
  }
}
