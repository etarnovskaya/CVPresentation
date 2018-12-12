package com.elena.next.tests;

import com.elena.next.model.SearchBar;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SearchBarTests extends TestBase {
  @DataProvider
  public Iterator<Object[]> searchValid() throws IOException {
    List<Object[]> list = new ArrayList<>();
    BufferedReader reader = new BufferedReader(
            new FileReader(new File("src/test/resources/searchValid.csv")));
    String line = reader.readLine();
    while (line != null){
      String[] split = line.split(";");
      list.add(new Object[] {new SearchBar()
              .setText(split[0])});
      line=reader.readLine();
    }
    return list.iterator();
  }

@Test(dataProvider ="searchValid")
  public  void searchBarTest(SearchBar searchBar){
  app.getNavigationHelper().openSite("https://www.next.co.il/en");
  app.getHeader().typeInSearchBar(searchBar);
  app.getHeader().proceedToSearch();

String pageTitle = app.getSearchResultPage().getPageTitle();
 // Assert.assertEquals(pageTitle, "FOOTWEAR");
}
}
