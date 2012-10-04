package org.openqa.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

//Searching for some text in Google
public class GoogleSearchPage extends GoogleSite {
    public static String path = "";
    
    @FindBy(name = "q")
    private WebElement searchBox;
    
    public GoogleResultsPage searchFor(String text) {
        searchBox.sendKeys(text);
        searchBox.submit();
        return PageFactory.initElements(driver, GoogleResultsPage.class);
    }
}
