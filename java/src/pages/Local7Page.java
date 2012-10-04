package org.openqa.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import java.util.*;

//working with select box using its native methods, not present in WebElement
public class Local7Page extends MyLocalSite {
    public static String path = "page7";
    
    @FindBy(name = "dropdown")
    private WebElement options;
    
    public void testSelectBox() {
        Select options_sel = new Select(options);
        options_sel.deselectAll();
        options_sel.selectByVisibleText("Volvo");
        options_sel.selectByValue("3");
    
        List<WebElement> opts = options.findElements(By.tagName("option"));
    
        for(WebElement option: opts){
            if(option.getText().equals("Mercedes")) {
                option.click();
            }
        }
    
        for(WebElement option: opts){
            if(option.isSelected()) {
                System.out.println(option.getAttribute("value"));
            }
        }
    }
}
