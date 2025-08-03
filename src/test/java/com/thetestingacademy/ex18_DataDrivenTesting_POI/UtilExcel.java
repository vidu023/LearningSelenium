package com.thetestingacademy.ex18_DataDrivenTesting_POI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UtilExcel {

    // Apache POI
    // Read the File - TestData.xlsx -> Download the file & keep it in the resource folder
    // Workbook Create
    // Sheet
    // Row and Cell
    // 2D Object  - getData()

    static Workbook book;
    static Sheet sheet;

    //TestData path
    // first i get the user directory for System.getProperty() -> System.getProperty("user.dir")
    // & then copy the actual path from content root

    // user directory is this - > C:\Users\Vaishak Kini\IdeaProjects\LearningSelenium
    public static String SHEET_PATH = System.getProperty("user.dir") + "/src/test/resources/TestData.xlsx";

    // 2d function getTestDataFromExcel which takes a parameter sheet
    public static Object[][] getTestDataFromExcel(String sheetName){

        FileInputStream fileInputStream = null;
        try {
            // Basically we are doing here is Open the file -> workbook -> sheet

            fileInputStream = new FileInputStream(SHEET_PATH); // give the sheet path
            // it will throw checked exception -> so surround with try  catch block
            // reading a file can be an issue
            book = WorkbookFactory.create(fileInputStream);
            // whenever we want to read a file so temporary it has to create it in its memory and its not actually creating it
            // work on it & then delete it and it will replace it
            // sheetName will also throw an error -> IO Exception will be added under catch instead of FileNotFoundException
            sheet = book.getSheet(sheetName);
        } catch (IOException e){
            //throw new RuntimeException(e);
            // we shall throw the exception like this instead
            System.out.println("Either File Not Found! or workbook not created!");
        }

        // now we shall read the data in 2D array
        // row - sheet.getLastRowNum() - lastrownum will give total number of rows
        // column - 1st row i.e [0] index will give total number of column (cell) -> sheet.getRow(0).getLastCellNum()
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

        for (int i = 0; i < sheet.getLastRowNum(); i++) { // 0 to 4

            for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) { // 0 to 1

                // First row email, password -> column name - skip - header i.e. 1st row -> i+1
                data[i][j] = sheet.getRow(i + 1).getCell(j).toString();

            }

        }
        return data;

    }
}

// we need to write this file once & then we can use this file n number of times