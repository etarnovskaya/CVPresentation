package com.elena.next.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreateGroupTests extends TestBase {
//  @DataProvider
//  public Iterator<Object[]> validGroups() throws IOException {
//    List<Object[]> list = new ArrayList<>();
//    BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/groups.csv")));
//    String line = reader.readLine();
//    while (line != null){
//      String[] split = line.split(";");
//      list.add(new Object[] {new GroupData()
//              .withName(split[0])
//              .withHeader(split[1])
//              .withFooter(split[2])});
//      line=reader.readLine();
//    }
//    return list.iterator();
//  }
//
//  @Test(dataProvider = "validGroups")
//  public void groupCreationTest(GroupData group) {
//    app.getGroupHelper().goToGroupsPage();
//    int before = app.getGroupHelper().getGroupCount();
//    app.getGroupHelper().initGroupCreation();
//    app.getGroupHelper().fillGroupForm(group);
//    app.getGroupHelper().submitGroupCreation();
//    app.getGroupHelper().returnToGroupsPage();
//    int after = app.getGroupHelper().getGroupCount();
//
//    Assert.assertEquals(after, before+1);
//
//  }


}
