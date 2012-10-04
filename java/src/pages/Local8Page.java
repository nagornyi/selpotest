package org.openqa.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import java.util.*;

//parsing the table
public class Local8Page extends MyLocalSite {
    public static String path = "page8";
    
    //@FindBy(id = "booktable")
    @FindBy(css = "table#booktable")
    private WebElement table;
    
    //@FindBy(xpath = "//table[@id='booktable']/tbody/tr/td")
    @FindBy(css = "table#booktable tbody tr td")
    private List<WebElement> cells;
    
    public void testTable() {
    
        //getting access to the cells of the table
        for(WebElement cell: cells) {
            System.out.println(cell.getText());
        }
    
        //getting the handler to the rows of the table
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        System.out.println("Table rows count: " + rows.size());
    
        //print the value of each cell using the rows handler
        int rown;		
        int celln;
        rown = 0;
        for(WebElement row: rows) {
            rown ++;
            List<WebElement> cells = row.findElements(By.tagName("td"));
            celln = 0;
            for(WebElement cell: cells) {
                celln ++;
                System.out.println("Row number: "+rown+". Cell number: "+celln+". Value: "+cell.getText());
            }
        }
        
        //simpler way - all above logics was encapsulated into a tableData function
        System.out.println("Row 2, cell 2: "+tableData(rows)[1][1]);
        assertEquals(tableData(rows)[1][0], "vin");
    }
}

