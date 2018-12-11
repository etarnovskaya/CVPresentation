package com.elena.next.manager;

import com.elena.next.tests.MyListener;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  private  Properties properties;
  private NavigationHelper navigationHelper;
  private SessionHelper sessionHelper;
  private EventFiringWebDriver wd;
  private String browser;
  private HomePage homePage;
  private  SearchResultPage searchResPage;
  private Header header;


  public ApplicationManager(String browser) {
    this.browser = browser;
    properties = new Properties();
  }

  public void start() throws IOException {
     if(browser.equals(BrowserType.CHROME)){
      wd = new EventFiringWebDriver(new ChromeDriver());
    }else if (browser.equals(BrowserType.FIREFOX)){
      wd = new EventFiringWebDriver(new FirefoxDriver());
    } else if (browser.equals(BrowserType.EDGE)){
      wd = new EventFiringWebDriver(new EdgeDriver());
    }
    wd.register(new MyListener());
//    String target = System.getProperty("target", "local");
//     properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties",target))));


    wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    navigationHelper = new NavigationHelper(wd);
    header = new Header(wd);

   // navigationHelper.openSite("https://www.next.co.il/he");//properties.getProperty("web.Url"));
//    sessionHelper = new SessionHelper(wd);
//    sessionHelper.logIn(properties.getProperty("web.adminLogin"), properties.getProperty("web.adminPassword"));
homePage = new HomePage(wd);
searchResPage = new SearchResultPage(wd);
  }

  public void stop() {
    wd.quit();
  }

  public Header getHeader() {
    return header;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public SearchResultPage getSearchResultPage() {
    return searchResPage;
  }

  public HomePage getHomePage() {
    return homePage;
  }
}
