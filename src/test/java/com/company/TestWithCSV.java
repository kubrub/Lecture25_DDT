package com.company;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;

public class TestWithCSV {
    @DataProvider(name = "myCSVdata")
    public Iterator<Object[]> csvRead(){
        return new MyCSVReader().readFromCSV();
    }

    @Test(dataProvider = "myCSVdata")
    public void test(String value1, String value2){
        Assert.assertTrue(value1.contains(value2));
    }
}
