package org.openqa.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

//verifying images using different locators
public class Local4Page extends MyLocalSite {
    public static String path = "page4";
    
    @FindBy(xpath = "//img[@src='images/WaterFaucet.jpg']")
    private WebElement water1;
    
    @FindBy(name = "watergraphic")
    private WebElement water2;
    
    @FindBy(xpath = "//img[@alt='Image of water faucet']")
    private WebElement water3;
    
    @FindBy(xpath = "//img[@src='images/totoro.gif']")
    private WebElement totoro;
    
    public void checkWater() {
        assertTrue(water1.isDisplayed());
        assertTrue(water2.isDisplayed());
        assertTrue(water3.isDisplayed());
    }
    
    public Local1Page useTotoro() {
        assertTrue(totoro.isDisplayed());
        totoro.click();
        return MyLocalSite.first_page();
    }
}
