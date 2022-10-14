package com.company;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCSVReader {
    public static final String PATH_TO_CSV_READER = "src/main/resources/data.csv";

    public Iterator<Object[]> readFromCSV(){
        List<Object[]> testCase = new ArrayList<>();
        try(CSVReader reader = new CSVReader(new FileReader(PATH_TO_CSV_READER))) {
            List<String[]> r = reader.readAll();
            testCase.addAll(r);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return testCase.iterator();
    }
}
