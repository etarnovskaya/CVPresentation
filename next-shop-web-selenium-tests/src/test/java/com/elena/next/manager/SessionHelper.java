package com.elena.next.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {
  public SessionHelper(WebDriver wd) {
    super(wd);
  }

  public void  logIn(String user, String password){
    type(By.name("user"), user);
    type(By.name("pass"), password);

    click(By.cssSelector("[type=submit]"));
  }
}
